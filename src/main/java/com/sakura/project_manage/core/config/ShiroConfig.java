package com.sakura.project_manage.core.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Maps;
import com.sakura.project_manage.core.filter.AuthFilter;
import com.sakura.project_manage.core.realm.AuthRealm;


/**
 * @author 李七夜
 * Shiro核心配置文件
 * Created by 李七夜 on 2023/3/5 18:43
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(DefaultWebSecurityManager defaultWebSecurityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        //关联 DefaultWebSecurityManager
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        //添加shiro内置的过滤器
        /*
         * anon: 无需认证就可以访问
         * authc: 必须认证才能访问
         * user: 必须拥有记住我功能才能用
         * perms: 拥有对某个资源的权限才能访问
         * role: 拥有某个角色权限才能访问
         * */
        //添加过滤器
        Map<String, Filter> filters = new HashMap<>();
        //自定义的认证授权过滤器
        filters.put("auth", new AuthFilter());
        //添加自定义的认证授权过滤器
        shiroFilterFactoryBean.setFilters(filters);

        //要拦截的路径放在map里面
        Map<String, String> filterMap = Maps.newLinkedHashMap();
        //放行login接口
        filterMap.put("/login", "anon");
        //放行logout接口
        filterMap.put("/logout", "anon");
        // 针对Swagger拦截放行
        filterMap.put("/swagger-ui.html", "anon");
        filterMap.put("/swagger/**", "anon");
        filterMap.put("/swagger-resources/**", "anon");
        filterMap.put("/v2/**", "anon");
        filterMap.put("/webjars/**", "anon");
        filterMap.put("/configuration/**", "anon");
        filterMap.put("/doc.html","anon");
        //拦截所有路径, 它自动会跑到 AuthFilter这个自定义的过滤器里面
        filterMap.put("/**", "auth");
        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return shiroFilterFactoryBean;
    }

    /**
     * 配置securityManager的实现类，变向的配置了securityManager
     * @param authRealm
     * @return
     */
    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(AuthRealm authRealm) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        //关联realm
        defaultWebSecurityManager.setRealm(authRealm);

        //关闭shiro自带的session
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
        defaultWebSecurityManager.setSubjectDAO(subjectDAO);
        return defaultWebSecurityManager;
    }

    /**
     * 将自定义realm注入到 DefaultWebSecurityManager
     * @return
     */
    @Bean
    public AuthRealm authRealm() {
        return new AuthRealm();
    }


    /**
     * 通过调用Initializable.init()和Destroyable.destroy()方法,从而去管理shiro bean生命周期
     * @return
     */
    @Bean
    public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /**
     * 开启shiro权限注解
     * @param defaultWebSecurityManager
     * @return
     */
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
            DefaultWebSecurityManager defaultWebSecurityManager) {
        AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(defaultWebSecurityManager);
        return advisor;
    }
}
