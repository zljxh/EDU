package com.zl.edu.common.enums;

/**
 * Created by user on 2018/3/1.
 */
public enum BackendEnum {
    REGISTER_FAIL(0,"FAIL"),
    REGISTER_EMAIL_HAS_USE(2,"该邮箱已经注册过了"),
    REGISTER_EMAIL_NOT_EXIST(3,"你输入的邮箱不存在");
    private int code;
    private String msg;
    BackendEnum(int code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
