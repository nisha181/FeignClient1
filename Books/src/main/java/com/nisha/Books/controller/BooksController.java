package com.nisha.Books.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nisha.Books.model.Books;
import com.nisha.Books.resources.BooksRepository;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	BooksRepository booksRepository;

	@GetMapping
	public List<Books> getAll() {
		return booksRepository.findAll();
	}

	@GetMapping("/booksbyid/{id}")
	public Optional<Books> getById(@PathVariable int id) {
		return booksRepository.findById(id);
	}

	@GetMapping("/bookstype/{type}")
	public List<Books> getByType(@PathVariable String type) {
		return booksRepository.findByBookType(type);
	}

}
