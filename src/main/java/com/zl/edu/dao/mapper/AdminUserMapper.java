package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by user on 2018/3/13.
 */
public interface AdminUserMapper {

    @Insert(" insert into user (userid, username, sex,  password, mail, role, remark, tel) values (#{user.userid}," +
            "#{user.username},#{user.sex},#{user.password},#{user.mail},#{user.role},#{user.remark},#{user.tel})")
     int saveAdminUser(@Param("user") User user);

    @Select("select password from user where username=#{username}")
     List<User> isExistByUserName(@Param("username") String username);
}
