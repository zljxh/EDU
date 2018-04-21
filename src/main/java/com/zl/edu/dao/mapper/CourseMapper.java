package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.Course;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by user on 2018/3/2.
 */

public interface CourseMapper {

    @Insert("  insert into course (courseid, teacherid, title,  image, createtime,updatetime, price, realprice, isfree, status) " +
            "values (#{course.courseid},#{course.teacherid},#{course.title},#{course.image},#{course.createtime},#{course.updatetime}," +
            "#{course.price},#{course.realprice},#{course.isfree},#{course.status})")
    int saveCourse(@Param("course")Course course);
}
