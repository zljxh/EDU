package com.zl.edu.dao.entity;

import java.util.Date;

public class SysMenu {
    private Long cateid;

    private Long parentid;

    private Integer isparentid;//0是父节点，1，子节点

    private Integer sortorder;

    private String title;

    private Date createtime;

    private Date updatetime;

    private String path;

    public Long getCateid() {
        return cateid;
    }

    public void setCateid(Long cateid) {
        this.cateid = cateid;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Integer getIsparentid() {
        return isparentid;
    }

    public void setIsparentid(Integer isparentid) {
        this.isparentid = isparentid;
    }

    public Integer getSortorder() {
        return sortorder;
    }

    public void setSortorder(Integer sortorder) {
        this.sortorder = sortorder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}