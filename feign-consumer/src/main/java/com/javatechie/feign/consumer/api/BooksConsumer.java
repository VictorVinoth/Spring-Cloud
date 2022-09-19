package com.javatechie.feign.consumer.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FEIGN-PRODUCER")
public interface BooksConsumer {
	
	@GetMapping("/books")
	public List<String> getBooks();

}
