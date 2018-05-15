package com.zl.edu.common;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * Created by user on 2018/3/1.
 */
@JsonSerialize(include =  JsonSerialize.Inclusion.NON_NULL)
public class ReturnResult implements Serializable {
    public int code;//0:失败，1，成功
    public String msg;
    public Object data;

    public ReturnResult() {
    }

    public ReturnResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ReturnResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
