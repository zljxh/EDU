package com.zl.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zl.edu.dao.mapper")
public class EduApplication {

	public static void main(String [] args) {
		SpringApplication.run(EduApplication.class, args);
	}
}
