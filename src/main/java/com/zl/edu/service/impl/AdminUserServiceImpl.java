package com.zl.edu.service.impl;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.User;
import com.zl.edu.dao.mapper.AdminUserMapper;
import com.zl.edu.service.AdminUserService;
import com.zl.edu.service.entity.AddUserForm;
import com.zl.edu.service.entity.AdminUserLoginForm;
import com.zl.edu.util.KeyUtil;
import com.zl.edu.util.ListUtil;
import com.zl.edu.util.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.zl.edu.util.MD5Utils.ecode;

/**
 * Created by user on 2018/3/13.
 */
@Slf4j
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public ReturnResult saveAdminUser(AddUserForm userForm) {
        if (!ListUtil.isEmpty(adminUserMapper.isExistByUserName(userForm.getAdminName()))){
            return new ReturnResult(0,"该用户已存在");
        }
        User user=new User();
        user.setUserid(KeyUtil.getItemId());
        user.setUsername(userForm.getAdminName());
        user.setMail(userForm.getEmail());
        user.setRole(userForm.getAdminRole());
        user.setSex(userForm.getSex());
        user.setTel(userForm.getPhone());
        user.setRemark(userForm.getRemark());
        user.setPassword(ecode("123456"));
        int result=adminUserMapper.saveAdminUser(user);
        if (result==1) {
        return new ReturnResult(1,"添加成功");
        }
        return new ReturnResult(0,"添加失败");
    }

    @Override
    public ReturnResult login(AdminUserLoginForm adminUserLoginForm) {
        List<User> users=adminUserMapper.isExistByUserName(adminUserLoginForm.getAdminname());
        if (ListUtil.isEmpty(users)){
            return new ReturnResult(0,"该用户不存在");
        }
        User user=users.get(0);
        if (MD5Utils.ecode(adminUserLoginForm.getPassword()).equals(user.getPassword())){
            return new ReturnResult(1,"登录成功");
        }
        return new ReturnResult(0,"用户名密码匹配");
    }
}
