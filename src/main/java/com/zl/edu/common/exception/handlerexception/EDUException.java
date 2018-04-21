package com.zl.edu.common.exception.handlerexception;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.common.exception.AppException;
import com.zl.edu.common.exception.BackendException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by user on 2018/3/1.
 */
@ControllerAdvice
public class EDUException {

    @ExceptionHandler(value = AppException.class)
    @ResponseBody
    public ReturnResult handlerAppException(AppException e){
        return new ReturnResult(0,e.getMessage());
    }

    @ExceptionHandler(value = BackendException.class)
    @ResponseBody
    public ReturnResult handlerBackendException(BackendException e){
        return new ReturnResult(0,e.getMessage());
    }
}
