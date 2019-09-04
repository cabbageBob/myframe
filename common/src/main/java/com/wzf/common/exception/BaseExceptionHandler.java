package com.wzf.common.exception;

import com.wzf.common.api.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

@RestControllerAdvice
@Slf4j
public class BaseExceptionHandler {

    @ExceptionHandler(BaseException.class)
    public Result<?> handlerBaseException(BaseException e){
        log.error(e.getMessage(),e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public Result<?> noHandlerFoundException(Exception e){
        log.error(e.getMessage(), e);
        return Result.error(404, "路径不存在，请检查路径是否正确");
    }

    //	@ExceptionHandler(NoHandlerFoundException.class)
//	public ModelAndView handlerNoFoundException(Exception e) {
//		log.error(e.getMessage(), e);
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("/exceptionPage");
//		modelAndView.addObject("message",e.getMessage())
//		return modelAndView;
//	}

    /**
     * 主键冲突异常
     * @param e
     * @return
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Result<?> handleDuplicateKeyException(DuplicateKeyException e){
        log.error(e.getMessage(), e);
        return Result.error("数据库中已存在该记录");
    }

    @ExceptionHandler(AccessDeniedException.class)
    public Result<?> handleAuthorizationException(AccessDeniedException e){
        log.error(e.getMessage(), e);
        return Result.noauth("权限不足，请联系管理员");
    }

    @ExceptionHandler(Exception.class)
    public Result<?> handleException(Exception e){
        log.error(e.getMessage(), e);
        return Result.error(e.getMessage());
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public Result<?> HttpRequestMethodNotSupportedException(Exception e){
        log.error(e.getMessage(), e);
        return Result.error("没有权限，请联系管理员授权");
    }
}
