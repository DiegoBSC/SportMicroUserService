package com.sport.system.play.sportuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SportUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportUserServiceApplication.class, args);
	}

}
