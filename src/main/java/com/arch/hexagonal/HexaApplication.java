package com.arch.hexagonal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class 	HexaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexaApplication.class, args);
	}

}
