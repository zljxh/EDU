package com.zl.edu.controller.app;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.common.exception.AppException;
import com.zl.edu.dao.entity.StuUser;
import com.zl.edu.service.StuUserService;
import com.zl.edu.service.entity.CheckIdentifyingForm;
import com.zl.edu.service.entity.ModifyPasswordForm;
import com.zl.edu.util.ListUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

import static com.zl.edu.common.enums.AppEnum.REGISTER_EMAIL_NOT_EXIST;

/**
 * Created by user on 2018/3/1.
 */
@Slf4j
@Controller
@RequestMapping(value = "/app/user")
public class AppUserController extends BaseAppController {

    @Autowired
    private StuUserService userService;

    /**
     * 登录
     * @return
     */
    @PostMapping("/login")
    @ResponseBody
    public ReturnResult login() {
        return new ReturnResult(0, "success");
    }

    /**
     * 注册
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping("/register")
    @ResponseBody
    public ReturnResult register(@Valid StuUser user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new AppException(0, bindingResult.getFieldError().getDefaultMessage());
        }
        ReturnResult result = userService.register(user);
        return result;
    }

    /**
     * 获取验证码
     * @param email
     * @return
     */
    @PostMapping("/getidentifying")
    @ResponseBody
    public ReturnResult getidentifying(String email) {
        if (ListUtil.isEmpty(userService.getUserByEmail(email))) {
            throw new AppException(REGISTER_EMAIL_NOT_EXIST);
        }
        //发送邮件
        return new ReturnResult(1, "验证码已发送到您的邮箱");
    }

    /**
     * 验证验证码
     * @param checkIdentifyingForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/checkidentifying")
    @ResponseBody
    public ReturnResult checkidentifying(@Valid CheckIdentifyingForm checkIdentifyingForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new AppException(0, bindingResult.getFieldError().getDefaultMessage());
        }
        //验证验证码的有效性及正确性
        return new ReturnResult(1, "验证成功");
    }

    /**
     * 修改密码
     * @param modifyPasswordForm
     * @param bindingResult
     * @return
     */
    @PostMapping("/modifypassword")
    @ResponseBody
    public ReturnResult modifypassword(@Valid ModifyPasswordForm modifyPasswordForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new AppException(0, bindingResult.getFieldError().getDefaultMessage());
        }
        return userService.modifyPassword(modifyPasswordForm);
    }


}
