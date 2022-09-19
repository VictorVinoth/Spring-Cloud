package com.javatechie.feign.producer.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FeignProducerSecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignProducerSecondApplication.class, args);
	}

}
