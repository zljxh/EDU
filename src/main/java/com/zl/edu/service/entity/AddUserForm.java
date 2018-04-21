package com.zl.edu.service.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * Created by user on 2018/3/13.
 */

public class AddUserForm {

    @NotEmpty(message = "用户名称不能为空")
    private String adminName;

    @NotNull(message = "用户性别不能为空")
    private Integer sex;

    @NotEmpty(message = "用户邮箱不能为空")
    private String email;

    @NotNull(message = "用户角色不能为空")
    private Integer adminRole;

    private String remark;

    @NotEmpty(message = "用户电话号码不能为空")
    private String phone;

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(Integer adminRole) {
        this.adminRole = adminRole;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
