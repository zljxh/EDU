package com.zl.edu.service.entity;

import org.hibernate.validator.constraints.NotEmpty;

public class MenuAddEnitityForm {
    private Long parentid;
    private Integer isparentid;
    @NotEmpty(message = "菜单名称不能为空")
    private String title;
    @NotEmpty(message = "url不能为空")
    private String path;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
