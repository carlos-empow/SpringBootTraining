package com.springtraining.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MongoConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoConfigClientApplication.class, args);
	}

}
