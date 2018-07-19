package com.gagechan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.gagechan.dao"})
public class SeckillingShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillingShopApplication.class, args);
	}
}
