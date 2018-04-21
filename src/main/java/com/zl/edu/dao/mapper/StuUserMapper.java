package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.StuUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by user on 2018/3/1.
 */
public interface StuUserMapper {
    @Insert(" INSERT INTO stu_user(stuid,stuname,phone,email,sex,createtime,isvip) values(#{stuUser.stuid},#{stuUser.stuname},#{stuUser.phone}," +
            "#{stuUser.email},#{stuUser.sex},#{stuUser.createtime},#{stuUser.isvip}) ")
    int saveUser(@Param("stuUser") StuUser stuUser);

    @Select("select stuid from stu_user where email=#{email}")
    List<StuUser> selectUserByEmail(String email);

    @Update("update stu_user set passwrod=#{password} where email=#{email}")
    int updatePasswordByEmail(String email, String password);
}
