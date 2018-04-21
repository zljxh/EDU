package com.zl.edu.dao.entity;

public class CourseRecord {
    private Long courseid;

    private Integer skims;

    private Integer learns;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Integer getSkims() {
        return skims;
    }

    public void setSkims(Integer skims) {
        this.skims = skims;
    }

    public Integer getLearns() {
        return learns;
    }

    public void setLearns(Integer learns) {
        this.learns = learns;
    }
}