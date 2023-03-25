package com.sakura.project_manage.core.handler;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sakura.project_manage.common.enums.EnumJsonResultMsg;
import com.sakura.project_manage.common.exception.ErrorException;
import com.sakura.project_manage.common.utils.JsonResult;

import lombok.extern.slf4j.Slf4j;

/**
 * 处理全局的异常,
 * @author 李七夜
 * @version 1.0
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 处理所有Exception异常
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public JsonResult<Object> handleException(Exception e) {
        log.error("Exception:{}", e.getMessage());
        e.printStackTrace();
        if (e instanceof AuthorizationException) {
            return JsonResult.error(EnumJsonResultMsg.USER_NO_QX);
        }
        return JsonResult.error("系统异常");
    }

    /**
     * 处理所有Throwable异常
     */
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public JsonResult<Object> handleException(Throwable e) {
        log.error("Throwable:{}", e.getMessage());
        e.printStackTrace();
        return JsonResult.error("系统异常");
    }

    @ExceptionHandler(ErrorException.class)
    @ResponseBody
    public JsonResult<Object> errorException(ErrorException e) {
        log.error("ErrorException:{}", e.getMsg());
        return JsonResult.<Object>of(e);
    }

}
