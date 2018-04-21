package com.zl.edu.service.impl;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.common.enums.AppEnum;
import com.zl.edu.common.exception.AppException;
import com.zl.edu.dao.entity.StuUser;
import com.zl.edu.dao.mapper.StuUserMapper;
import com.zl.edu.service.StuUserService;
import com.zl.edu.service.entity.ModifyPasswordForm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

import static com.zl.edu.util.KeyUtil.getItemId;

/**
 * Created by user on 2018/3/1.
 */
@Slf4j
@Service
public class StuUserServiceImpl implements StuUserService {
    @Autowired
    private StuUserMapper userMapper;

    @Override
    public ReturnResult register(StuUser stuUser) {
        List<StuUser> selectUserByEmail = userMapper.selectUserByEmail(stuUser.getEmail());
        if (selectUserByEmail != null && selectUserByEmail.size() > 0) {
            throw new AppException(AppEnum.REGISTER_EMAIL_HAS_USE);
        }
        stuUser.setStuid(getItemId());
        stuUser.setCreatetime(new Date());
        int result = userMapper.saveUser(stuUser);
        if (result == 1) {
            return new ReturnResult(1, "注册成功");
        }
        return new ReturnResult(0, "注册失败");
    }

    @Override
    public List<StuUser> getUserByEmail(String email) {
        return userMapper.selectUserByEmail(email);
    }

    @Override
    public ReturnResult modifyPassword(ModifyPasswordForm modifyPasswordForm) {
        int result = userMapper.updatePasswordByEmail(modifyPasswordForm.getEmail(), modifyPasswordForm.getPassword());
        if (result == 1) {
            return new ReturnResult(1, "密码修改成功");
        }
        return new ReturnResult(0, "密码修改失败");
    }
}
