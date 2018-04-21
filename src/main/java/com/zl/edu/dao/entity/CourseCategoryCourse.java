package com.zl.edu.dao.entity;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

public class CourseCategoryCourse implements Serializable{
    @NotEmpty(message = "课程类别不能为空")
    private Long cateid;

    private Long courseid;

    public Long getCateid() {
        return cateid;
    }

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }
}