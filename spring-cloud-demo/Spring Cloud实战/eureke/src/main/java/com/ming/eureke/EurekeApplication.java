package com.ming.eureke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Spring Cloud Eureka 服务注册中心Demo
 */
@EnableEurekaServer //启动服务注册中心
@SpringBootApplication
public class EurekeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekeApplication.class, args);
	}
}
