package com.zl.edu.dao.entity;

import java.util.Date;

public class Bargain {
    private Long bargainid;

    private Long courseid;

    private Long stuid;

    private Long teacherid;

    private Integer bargaincost;

    private Integer originalcost;

    private Date createtime;

    public Long getBargainid() {
        return bargainid;
    }

    public void setBargainid(Long bargainid) {
        this.bargainid = bargainid;
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

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public Integer getBargaincost() {
        return bargaincost;
    }

    public void setBargaincost(Integer bargaincost) {
        this.bargaincost = bargaincost;
    }

    public Integer getOriginalcost() {
        return originalcost;
    }

    public void setOriginalcost(Integer originalcost) {
        this.originalcost = originalcost;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}