package com.gagechan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan(basePackages = {"com.gagechan.dao"})
@EnableCaching
public class SeckillingShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeckillingShopApplication.class, args);
	}
}
