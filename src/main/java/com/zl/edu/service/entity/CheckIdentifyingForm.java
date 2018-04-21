package com.zl.edu.service.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by user on 2018/3/1.
 */
@Data
public class CheckIdentifyingForm {
    @NotEmpty(message = "邮箱不能为空")
    private String email;

    @NotEmpty(message = "验证码不能为空")
    private String identifying;
}
