package com.javatechie.products.client.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ProductsClientApplication {

	@Autowired
	private RestTemplate productresttemplate;
	
	@Value("${products.service.url}")
	private String productsURL;
	
	
	@GetMapping("/products")
	public List<String> getProducts() {
		System.out.println("Entered into ShoppingController - Products service");
		return productresttemplate.getForObject(productsURL, List.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ProductsClientApplication.class, args);
	}

	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
}
