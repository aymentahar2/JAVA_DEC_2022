package com.alaa.w2d2api.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.alaa.w2d2api.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	// this method retrieves all the books from the database
    List<Book> findAll();

}
