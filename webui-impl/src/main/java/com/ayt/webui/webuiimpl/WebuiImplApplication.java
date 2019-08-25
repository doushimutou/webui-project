package com.ayt.webui.webuiimpl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages ="com.ayt.webui.webuimapper.mapper")
public class WebuiImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebuiImplApplication.class, args);
	}

}
