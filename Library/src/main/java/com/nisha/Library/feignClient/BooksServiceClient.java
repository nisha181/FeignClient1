package com.nisha.Library.feignClient;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nisha.Library.model.Books;

@FeignClient(name = "books-service", url = "http://localhost:8081/books")
public interface BooksServiceClient {
        
	@GetMapping
	public List<Books> getAll();

	@GetMapping("/booksbyid/{id}")
	public Optional<Books> getById(@PathVariable int id);

	@GetMapping("/bookstype/{type}")
	public List<Books> getByType(@PathVariable String type);
}