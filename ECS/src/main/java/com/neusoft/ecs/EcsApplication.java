package com.neusoft.ecs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//注解 - Mapper接口的扫描基础包
@MapperScan(basePackages={"com.neusoft.ecs.cm.mapper", "com.neusoft.ecs.um.mapper", "com.neusoft.ecs.om.mapper"})
public class EcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcsApplication.class, args);
	}

}
