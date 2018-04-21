package com.zl.edu.common.exception;

import com.zl.edu.common.enums.AppEnum;

/**
 * Created by user on 2018/3/1.
 */
public class BackendException extends RuntimeException {
    private Integer code;

    public BackendException(AppEnum appEnum){
        super(appEnum.getMsg());
    this.code=appEnum.getCode();
    }

    public BackendException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
