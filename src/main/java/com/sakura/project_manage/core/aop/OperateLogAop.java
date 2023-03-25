package com.sakura.project_manage.core.aop;

import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import com.sakura.project_manage.common.utils.CommonsUtil;
import com.sakura.project_manage.entity.OperateLogDetail;
import com.sakura.project_manage.entity.UserDetail;
import com.sakura.project_manage.mapper.generator.OperateLogDetailGeneratorMapper;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 李七夜
 * Created by 李七夜 on 2023/3/8 20:24
 * 使用AOP来记录用户操作日志
 */
@Slf4j
@Aspect
@Component
public class OperateLogAop {

    @Autowired
    private OperateLogDetailGeneratorMapper operateLogDetailGeneratorMapper;

    /**
     * 定义切面,所以请求Controller层的都会被记录
     */
    @Pointcut("execution(public * com.sakura.project_manage.web.controller.*.*.*(..))")
    public void pointcut() {

    }

    /**
     * 在被通知的方法调用之前和调用之后执行自定义的方法
     * @param joinPoint
     */
    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object[] args = joinPoint.getArgs();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        //1.获取目标类上的目标注解（可判断目标类是否存在该注解）
//        Api api = AnnotationUtils.findAnnotation(signature.getClass(), Api.class);
        //2.获取目标方法上的目标注解（可判断目标方法是否存在该注解）
        ApiOperation apiOperation = AnnotationUtils.findAnnotation(signature.getMethod(), ApiOperation.class);
        GetMapping getMapping = AnnotationUtils.findAnnotation(signature.getMethod(), GetMapping.class);
        //如果是get请求就不用记录了
        if (getMapping == null) {
            insertLog(apiOperation);
        }
        return joinPoint.proceed(args);
    }

    private void insertLog(ApiOperation apiOperation) {
        //获取当前登录的用户信息
        UserDetail userDetail = (UserDetail) SecurityUtils.getSubject().getPrincipal();
        OperateLogDetail operateLogDetail = new OperateLogDetail();
        operateLogDetail.setIpLocation(CommonsUtil.getLocalIP());
        operateLogDetail.setUserId(userDetail.getId());
        operateLogDetail.setOperateFunction(apiOperation.value());
        operateLogDetail.setOperateDesc(userDetail.getUserName() + "在" + apiOperation.value());
        try {
            operateLogDetailGeneratorMapper.insertSelective(operateLogDetail);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
