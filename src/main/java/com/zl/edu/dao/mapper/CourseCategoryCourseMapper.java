package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.CourseCategoryCourse;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by user on 2018/3/2.
 */
public interface CourseCategoryCourseMapper {
    @Insert("insert into course_category_course (cateid, courseid) values (#{categoryCourse.cateid},#{categoryCourse.courseid}) ")
    int save(@Param("categoryCourse") CourseCategoryCourse categoryCourse);

//    @Insert("insert into course_category_course (cateid, courseid) values (#{categoryCourse.cateid},#{categoryCourse.courseid}) ")
//    int save(@Param("categoryCourse") List<CourseCategoryCourse> categoryCourse);

}
