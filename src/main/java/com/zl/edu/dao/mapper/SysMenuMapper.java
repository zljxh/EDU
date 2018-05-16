package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.SysMenu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysMenuMapper {

    @Select("select * from sys_menu where isparentid=0 and validate=1 ")
    List<SysMenu> getAllParentMenu();

    @Select("select * from sys_menu where title=#{title} and path=#{path} and validate=1")
    List<SysMenu> getMenuByTitleAndPath(@Param("title")String title,@Param("path")String path);

    @Insert(" insert into sys_menu (cateid, parentid, isparentid, \n" +
            "      sortorder, title, createtime, \n" +
            "      updatetime, path,validate)\n" +
            "    values (#{cateid,jdbcType=BIGINT}, #{parentid,jdbcType=BIGINT}, #{isparentid,jdbcType=INTEGER}, \n" +
            "      #{sortorder,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, #{createtime,jdbcType=TIMESTAMP}, \n" +
            "      #{updatetime,jdbcType=TIMESTAMP}, #{path,jdbcType=VARCHAR},#{validate,jdbcType=INTEGER})")
    int save(SysMenu sysMenu);

    @Delete("update set sys_menu validate=0 where cateid=#{id}")
    int delete(@Param("id") long cateid);

    @Select("SELECT \n" +
            "  s.parentid,\n" +
            "  s.cateid,\n" +
            "  s.isparentid,\n" +
            "  s.title,\n" +
            "  s.createtime,\n" +
            "  s.path,\n" +
            "  (\n" +
            "    CASE\n" +
            "      WHEN s.isparentid = 1 \n" +
            "      THEN \n" +
            "      (SELECT \n" +
            "        sm.title \n" +
            "      FROM\n" +
            "        sys_menu sm\n" +
            "      WHERE sm.cateid = s.parentid LIMIT 1) \n" +
            "      ELSE \"父类\" \n" +
            "    END\n" +
            "  ) AS parenttitle\n" +
            "FROM\n" +
            "  sys_menu s\n" +
            "WHERE validate = 1 ")
    List<SysMenu> getAllMenus();
}
