package com.zl.edu.dao.entity;

import java.util.Date;

public class StuLearn {
    private Long stuid;

    private Long learnlong;

    private Date createtime;

    private Date updatime;

    public Long getStuid() {
        return stuid;
    }

    public void setStuid(Long stuid) {
        this.stuid = stuid;
    }

    public Long getLearnlong() {
        return learnlong;
    }

    public void setLearnlong(Long learnlong) {
        this.learnlong = learnlong;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatime() {
        return updatime;
    }

    public void setUpdatime(Date updatime) {
        this.updatime = updatime;
    }
}