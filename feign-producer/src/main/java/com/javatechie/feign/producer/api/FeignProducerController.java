package com.javatechie.feign.producer.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignProducerController {

	@GetMapping("/books")
	public List<String> getAllBooks(){
		System.out.println("Inside Producer....");
		return Stream.of("JAVA","PHP","PYTHON").collect(Collectors.toList());
	}
}
