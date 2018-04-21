package com.zl.edu.dao.entity;

import java.util.Date;

public class CourseBasic {
    private Long courseid;

    private String content;

    private String url;

    private Date createtime;

    private Integer isaccount;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsaccount() {
        return isaccount;
    }

    public void setIsaccount(Integer isaccount) {
        this.isaccount = isaccount;
    }
}