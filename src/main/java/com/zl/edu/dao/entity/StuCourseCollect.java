package com.zl.edu.dao.entity;

import java.util.Date;

public class StuCourseCollect {
    private Long collectid;

    private Long courseid;

    private Long stuid;

    private Date createtime;

    public Long getCollectid() {
        return collectid;
    }

    public void setCollectid(Long collectid) {
        this.collectid = collectid;
    }

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getStuid() {
        return stuid;
    }

    public void setStuid(Long stuid) {
        this.stuid = stuid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}