package com.zl.edu.controller.backend;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.service.AdminUserService;
import com.zl.edu.service.entity.AdminUserLoginForm;
import com.zl.edu.service.entity.AddUserForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by user on 2018/3/9.
 */
@Controller
@RequestMapping("/backend")
public class BackendUserController extends BaseBackendController {
    @Autowired
    private AdminUserService adminUserService;
    @GetMapping("/login")
    public String login() {
        return PAGE_PREFIX + "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public ReturnResult userLogin(@Valid AdminUserLoginForm adminUserLoginForm, BindingResult result){
        if (result.hasErrors()){
            return new ReturnResult(0,result.getFieldError().getDefaultMessage());
        }
        ReturnResult result1=adminUserService.login(adminUserLoginForm);
        return result1;
    }

    @GetMapping("/adduser")
    public String register(){
        return PAGE_PREFIX+"adduser";
    }

    @PostMapping(value = "/adduser")
    @ResponseBody
    public ReturnResult addUser(@Valid AddUserForm userForm, BindingResult result){

        return adminUserService.saveAdminUser(userForm);
    }

    @GetMapping("/loginout")
    public String loginOut(){
        return PAGE_PREFIX+"login";
    }
}
