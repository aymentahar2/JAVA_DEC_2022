package com.alaa.fullcruddemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alaa.fullcruddemo.models.Book;
import com.alaa.fullcruddemo.repositories.BookRepository;

@Service
public class BookService {
// CRUD
	   // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
}
    
    
    // READ ALL
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    // CREATE ONE
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    // READ ONE
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
//        optionalBook.isPresent() ? return optionalBook.get() : return null;
    }
    
    // UPDATE BOOK
    public Book updateBook(Book b) {
    	return bookRepository.save(b);
    }
    
    //TODO DELETE method
    
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
}
