package com.javatechie.feign.consumer.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FEIGN-PRODUCER-SECOND")
public interface AdditionalBooksConsumer {

	@GetMapping("additionalbook")
	public String giveName();
}
