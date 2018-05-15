package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.SysMenu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysMenuMapper {
    @Select("select * from sys_menu where isparentid=0")
    List<SysMenu> getAllParentMenu();

    @Select("select * form sys_menu where title=#{title} and path=#{path}")
    List<SysMenu> getMenuByTitleAndPath(@Param("title")String title,@Param("path")String path);

    @Insert(" insert into sys_menu (cateid, parentid, isparentid, \n" +
            "      sortorder, title, createtime, \n" +
            "      updatetime, path)\n" +
            "    values (#{cateid,jdbcType=BIGINT}, #{parentid,jdbcType=BIGINT}, #{isparentid,jdbcType=INTEGER}, \n" +
            "      #{sortorder,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, \n" +
            "      #{updatetime,jdbcType=TIMESTAMP}, #{path,jdbcType=VARCHAR})")
    int save(SysMenu sysMenu);
}
