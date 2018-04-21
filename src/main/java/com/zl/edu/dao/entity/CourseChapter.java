package com.zl.edu.dao.entity;

public class CourseChapter {
    private Long chapterid;

    private Long courseid;

    private String title;

    private String timelong;

    private Integer isfree;

    private String url;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public String getTimelong() {
        return timelong;
    }

    public void setTimelong(String timelong) {
        this.timelong = timelong;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getChapterid() {
        return chapterid;
    }

    public void setChapterid(Long chapterid) {
        this.chapterid = chapterid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLong() {
        return timelong;
    }

    public void setLong(String timelong) {
        this.timelong = timelong == null ? null : timelong.trim();
    }

    public Integer getIsfree() {
        return isfree;
    }

    public void setIsfree(Integer isfree) {
        this.isfree = isfree;
    }
}