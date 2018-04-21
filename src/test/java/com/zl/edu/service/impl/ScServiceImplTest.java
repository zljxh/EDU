package com.zl.edu.service.impl;

import com.zl.edu.service.ScService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by user on 2018/3/7.
 */
@SpringBootTest
@Slf4j
@MapperScan("com.zl.edu.dao.mapper")
@EnableAutoConfiguration(exclude={
        JpaRepositoriesAutoConfiguration.class//禁止springboot自动加载持久化bean
})
@RunWith(SpringRunner.class)
public class ScServiceImplTest {
    @Autowired
    private ScService scService;
    @Test
    public void saveSc() throws Exception {
    scService.saveSc();
    }

}