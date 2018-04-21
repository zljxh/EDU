package com.zl.edu.service.impl;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.Course;
import com.zl.edu.dao.entity.CourseCategoryCourse;
import com.zl.edu.dao.mapper.CourseCategoryCourseMapper;
import com.zl.edu.dao.mapper.CourseMapper;
import com.zl.edu.service.CourseService;
import com.zl.edu.util.KeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by user on 2018/3/2.
 */
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseCategoryCourseMapper categoryCourseMapper;

    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public ReturnResult saveCourse(Course course, List<CourseCategoryCourse> categoryCourse) {
        course.setCourseid(KeyUtil.getItemId());
        course.setStatus(1);
        Date date = new Date();
        course.setCreatetime(date);
        course.setUpdatetime(date);
        int  courseResult = courseMapper.saveCourse(course);
//        categoryCourse.setCourseid(course.getCourseid());
//        int categoryCourseResult=categoryCourseMapper.save(categoryCourse);
//        if (courseResult == 1&&categoryCourseResult==1) {
//            return new ReturnResult(1, "添加成功");
//        }
        return new ReturnResult(0, "添加失败");
    }
}
