package com.zl.edu.common.exception;

import com.zl.edu.common.enums.AppEnum;

/**
 * Created by user on 2018/3/1.
 */
public class AppException extends RuntimeException {
    private Integer code;

    public AppException(AppEnum appEnum){
        super(appEnum.getMsg());
    this.code=appEnum.getCode();
    }

    public AppException( Integer code,String message) {
        super(message);
        this.code = code;
    }
}
