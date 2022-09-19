package com.javatechie.feign.consumer.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignConsumerController {

	@Autowired
	private BooksConsumer booksConsumer;

	@Autowired
	private AdditionalBooksConsumer additionalBooksConsumer;

	@GetMapping("/data")
	public List<String> booksData() {
		System.out.println("inside Consumer");
		List<String> originalBooks = booksConsumer.getBooks();

		String extraBook = additionalBooksConsumer.giveName();
		originalBooks.add(extraBook);

		return originalBooks;
	}
}
