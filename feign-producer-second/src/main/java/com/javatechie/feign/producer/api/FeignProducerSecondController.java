package com.javatechie.feign.producer.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignProducerSecondController {

	@GetMapping("/additionalbook")
	public String giveName() {
		return "ORACLE";
	}
}
