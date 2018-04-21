package com.zl.edu.service.entity;

import com.zl.edu.dao.entity.CourseChapter;
import lombok.Data;

import java.util.List;

/**
 * Created by user on 2018/3/9.
 */
@Data
public class CourseChapterForm {

    private List<CourseChapter> catalogList;
}
