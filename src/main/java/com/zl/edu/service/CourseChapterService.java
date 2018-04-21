package com.zl.edu.service;

import com.zl.edu.common.ReturnResult;
import com.zl.edu.service.entity.CourseChapterForm;

/**
 * Created by user on 2018/3/9.
 */
public interface CourseChapterService {

    public ReturnResult saveCourseChapter(CourseChapterForm chapterForm);
}
