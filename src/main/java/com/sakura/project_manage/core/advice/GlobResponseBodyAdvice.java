package com.sakura.project_manage.core.advice;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import com.sakura.project_manage.common.utils.JsonResult;
import com.sakura.project_manage.common.utils.PageResult;

/**
 * @author 李七夜
 * 处理请求成功后统一返回处理类
 * 加上需要扫描的包
 * Created by 李七夜 on 2023/2/28 14:39
 */
@ControllerAdvice(basePackages = "com.sakura.project_manage.web.controller")
public class GlobResponseBodyAdvice implements ResponseBodyAdvice<Object> {

    /**
     * 是否开启功能
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    /**
     * 处理返回结果
     * @param o
     * @param methodParameter
     * @param mediaType
     * @param aClass
     * @param serverHttpRequest
     * @param serverHttpResponse
     * @return
     */
    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType,
            Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest,
            ServerHttpResponse serverHttpResponse) {
        if (o instanceof PageResult) {
            return o;
        }
        return JsonResult.success(o);
    }
}
