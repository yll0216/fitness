package com.fit.fitsys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.fit.fitsys.mapper")
public class FitSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitSysApplication.class, args);
	}

}
