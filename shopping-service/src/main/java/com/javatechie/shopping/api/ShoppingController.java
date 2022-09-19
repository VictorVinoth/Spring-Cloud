package com.javatechie.shopping.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

	@Autowired
	private RestTemplate template;

	@GetMapping("/payment/{amount}")
	public String processPayment(@PathVariable int amount) {
		String paymentURL = "http://PAYMENT-SERVICE/pay/" + amount;
		System.out.println("Entered into Shopping service");
		return template.getForObject(paymentURL, String.class);

	}

}
