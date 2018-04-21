package com.zl.edu.service;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.service.entity.AddUserForm;
import com.zl.edu.service.entity.AdminUserLoginForm;

/**
 * Created by user on 2018/3/13.
 */
public interface AdminUserService {
    public ReturnResult saveAdminUser(AddUserForm userForm);

    public ReturnResult login(AdminUserLoginForm adminUserLoginForm);
}
