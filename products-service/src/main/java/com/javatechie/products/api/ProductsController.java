package com.javatechie.products.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

	@GetMapping("/products/fetchallproducts")
	public List<String> getAllProducts() {
		return Stream.of("Laptop", "Furniture", "Grocery", "Mobiles").collect(Collectors.toList());
	}

}
