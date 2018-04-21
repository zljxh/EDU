package com.zl.edu.service;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.dao.entity.Course;
import com.zl.edu.dao.entity.CourseCategoryCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by user on 2018/3/2.
 */
@Repository
public interface CourseService {
    ReturnResult saveCourse(Course course, List<CourseCategoryCourse> categoryCourse);


}
