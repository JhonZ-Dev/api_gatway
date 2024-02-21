package com.example.spring_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiGatewayApplication.class, args);
	}

}
