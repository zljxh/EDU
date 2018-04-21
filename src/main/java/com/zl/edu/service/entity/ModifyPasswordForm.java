package com.zl.edu.service.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by user on 2018/3/1.
 */
@Data
public class ModifyPasswordForm {
    @NotEmpty(message = "新密码不能为空")
    private String password;
    @NotEmpty(message = "确认密码不能为空")
    private String confirmpassword;
    @NotEmpty(message = "邮箱不能为空")
    private String email;


}
