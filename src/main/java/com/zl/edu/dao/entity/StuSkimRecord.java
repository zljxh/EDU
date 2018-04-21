package com.zl.edu.dao.entity;

import java.util.Date;

public class StuSkimRecord {
    private Long stuid;

    private Long courseid;

    private Long cateid;

    private Integer skimNum;

    private Date lastskimtime;

    public Long getStuid() {
        return stuid;
    }

    public void setStuid(Long stuid) {
        this.stuid = stuid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getCateid() {
        return cateid;
    }

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }

    public Integer getSkimNum() {
        return skimNum;
    }

    public void setSkimNum(Integer skimNum) {
        this.skimNum = skimNum;
    }

    public Date getLastskimtime() {
        return lastskimtime;
    }

    public void setLastskimtime(Date lastskimtime) {
        this.lastskimtime = lastskimtime;
    }
}