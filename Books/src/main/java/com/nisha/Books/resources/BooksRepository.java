package com.nisha.Books.resources;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nisha.Books.model.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

	@Query
	public List<Books> findByBookType(String bookType);
}
