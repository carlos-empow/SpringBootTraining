package com.springtraining.edgeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.springtraining.filters.SimplePostFilter;
import com.springtraining.filters.SimplePreFilter;

@EnableZuulProxy
@SpringBootApplication
public class EdgeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeServiceApplication.class, args);
	}
	
	@Bean
	public SimplePreFilter simplePrefilter() {
		return new SimplePreFilter();
	}
	
	@Bean
	public SimplePostFilter simplePostFilter() {
		return new SimplePostFilter();
	}

}
