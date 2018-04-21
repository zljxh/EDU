package com.zl.edu.service.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by user on 2018/3/14.
 */
@Data
public class AdminUserLoginForm {
    @NotEmpty(message = "用户名不能为空")
    private String adminname;
    @NotEmpty(message = "密码不能为空")
    private String password;

    private  Boolean online;

    public Boolean getOnline() {
        return online;
    }

    public void setOnline(Boolean online) {
        this.online = online;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
