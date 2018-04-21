package com.zl.edu.dao.entity;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.Date;

@Data
public class Course {
    private Long courseid;

    @NotEmpty(message = "老师不能为空")
    private Long teacherid;

    @NotEmpty(message = "标题不能为空")
    private String title;

    @NotEmpty(message = "展示图不能为空")
    private String image;

    private Date createtime;

    private Date updatetime;
    @NotEmpty(message = "原始价格不能为空")
    private Integer price;

    @NotEmpty(message = "真实价格不能为空")
    private Integer realprice;

    @NotEmpty(message = "是否免费不能为空")
    private Integer isfree;

    private Integer status;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public Long getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(Long teacherid) {
        this.teacherid = teacherid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRealprice() {
        return realprice;
    }

    public void setRealprice(Integer realprice) {
        this.realprice = realprice;
    }

    public Integer getIsfree() {
        return isfree;
    }

    public void setIsfree(Integer isfree) {
        this.isfree = isfree;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}