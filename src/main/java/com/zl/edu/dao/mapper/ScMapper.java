package com.zl.edu.dao.mapper;

import com.zl.edu.dao.entity.Sc;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by user on 2018/3/7.
 */
public interface ScMapper {

    @Insert(" insert into sc (s,c,score) values (#{sc.s},#{sc.c},#{sc.score})")
    int saveSc(@Param("sc") Sc sc);

}
