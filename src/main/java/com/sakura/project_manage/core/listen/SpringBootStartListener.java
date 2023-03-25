package com.sakura.project_manage.core.listen;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import com.sakura.project_manage.common.utils.CommonConstant;
import com.sakura.project_manage.common.utils.CommonsUtil;
import com.sakura.project_manage.common.utils.ObjectTools;
import com.sakura.project_manage.entity.AuthorityDetail;
import com.sakura.project_manage.entity.RoleDetail;
import com.sakura.project_manage.mapper.generator.AuthorityDetailGeneratorMapper;
import com.sakura.project_manage.mapper.generator.RoleDetailGeneratorMapper;

import lombok.extern.slf4j.Slf4j;


/**
 * SpringBoot全局监听器:监听到SpringBoot启动完成的时候
 * @author 李七夜
 */
@Slf4j
@Component
public class SpringBootStartListener implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private ServletContext servletContext;
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Autowired
    private AuthorityDetailGeneratorMapper authorityDetailGeneratorMapper;
    @Autowired
    private RoleDetailGeneratorMapper roleDetailGeneratorMapper;

    /**
     * SpringBoot启动完成后执行的方法
     * @param applicationReadyEvent
     */
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        servletContext.setAttribute("session", 1);
        //方便测试,项目启动完成后所有的权限会自动更新到超级管理员上,其它的会放到redis里
        adminRoleSet();
        ConfigurableApplicationContext applicationContext = applicationReadyEvent.getApplicationContext();
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        String serverPort = environment.getProperty("server.port");
        String contextPath = environment.getProperty("server.servlet.context-path");
        String projectName = environment.getProperty("server.name");
        String env = environment.getProperty("server.env");
        if (CommonsUtil.isBlank(contextPath)) {
            contextPath = "/";
        }
        log.info("SpringBoot启动成功.....");
        log.info("\n----------------------------------------------------------\n\t" +
                        "Application '" + projectName + "' is running! Access URLs:\n\t" +
                        "Local: \t\thttp://localhost:{}{}\n\t" +
                        "{}\n\t" +
                        "Environment: \t\t{}" +
                        "\n----------------------------------------------------------",
                serverPort,
                contextPath,
                "Swagger: \t\thttp://localhost:" + serverPort + contextPath
                        + ("/".equals(contextPath) ? "" : "/")
                        + "swagger-ui.html", env);
    }

    /**
     * 将所有的权限放到超级管理员上
     */
    private void adminRoleSet() {
        List<AuthorityDetail> list = authorityDetailGeneratorMapper.selectAll();
        String authorityCodes = String
                .join(",", list.stream().map(AuthorityDetail::getAuthorityCode).collect(Collectors.toList()));
        roleDetailGeneratorMapper
                .updateByPrimaryKeySelective(RoleDetail.builder().id(1).authoritys(authorityCodes).build());
        List<RoleDetail> roleDetailList = roleDetailGeneratorMapper.selectAll();
        //将对应的权限枚举放到redis里
        roleDetailList.stream().filter(roleDetail -> ObjectTools.isNotBlank(roleDetail.getAuthoritys()))
                .forEach(roleDetail -> redisTemplate.opsForValue()
                        .set(CommonConstant.REDIS_PERMISSION + roleDetail.getId(), roleDetail.getAuthoritys()));
    }
}
