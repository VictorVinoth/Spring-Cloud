package com.javatechie.shopping.config.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ShoppingConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingConfigServerApplication.class, args);
	}

}
