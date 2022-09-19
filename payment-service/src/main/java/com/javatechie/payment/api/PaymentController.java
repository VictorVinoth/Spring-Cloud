package com.javatechie.payment.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@GetMapping("/pay/{price}")
	public String processPayment(@PathVariable int price) {
		return "Payment for amount" +price +" is successful!";
	}

}
