package com.zl.edu.service;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.StuUser;
import com.zl.edu.service.entity.ModifyPasswordForm;

import java.util.List;

/**
 * Created by user on 2018/3/1.
 */
public interface StuUserService {

    ReturnResult register(StuUser stuUser);

    List<StuUser> getUserByEmail(String email);

    ReturnResult modifyPassword(ModifyPasswordForm modifyPasswordForm);
}
