package com.nisha.Library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisha.Library.feignClient.BooksServiceClient;
import com.nisha.Library.model.Books;

@RestController
@RequestMapping("/library")
public class LibraryController {
	
	@Autowired
	BooksServiceClient booksServiceClient;
	
	@GetMapping
	public List<Books> getAll(){
		return booksServiceClient.getAll();
	}
	
	@GetMapping("/BookByType/{type}")
	public List<Books> getByType(@PathVariable String type ) {
		return booksServiceClient.getByType(type);
	}

}
