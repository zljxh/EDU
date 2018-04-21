package com.zl.edu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//禁止springboot自动加载持久化bean
@EnableAutoConfiguration(exclude={JpaRepositoriesAutoConfiguration.class})
@SpringBootTest
public class EduApplicationTests {

	@Test
	public void contextLoads() {
	}

}
