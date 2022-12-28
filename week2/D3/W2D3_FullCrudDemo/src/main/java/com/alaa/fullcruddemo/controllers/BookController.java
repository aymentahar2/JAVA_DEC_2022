package com.alaa.fullcruddemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alaa.fullcruddemo.models.Book;
import com.alaa.fullcruddemo.services.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/")
	public String allBooks(Model model) {
		List <Book> allBooks  = bookService.allBooks();
		model.addAttribute("allMybooks", allBooks);
		return "books.jsp";
	}
	
	// CREATE 
//	@GetMapping("/create")
//	public String create(Model model) {
//		Book book = new Book();
//		model.addAttribute("book", book);
//		return "form.jsp";
//	}
	
	// CREATE using (DI)
		@GetMapping("/create")
		public String create(@ModelAttribute("book") Book book) {
			
			return "form.jsp";
		}
	
	
	
	
	// CREATE - redirect
//	@PostMapping("/createBook")
//	public String create(
//	    @RequestParam("title") String title,
//	    @RequestParam("author") String author,
//	    @RequestParam("pages") Integer pages,
//	    Model model) 
//	{
//	    // CODE TO MAKE A NEW BOOK AND SAVE TO THE DB
//	    Book book = new Book(title, author, pages);
//	    Book newBook = bookService.createBook(book);
//	    model.addAttribute(newBook);
//	    return "redirect:/";
//	}

		@PostMapping("/createBook")
		public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
			
			 if (result.hasErrors()) {
		            return "form.jsp";
		        } else {
		            bookService.createBook(book);
		            return "redirect:/";
		        }
		}
		// TO-DO RedirectAttributes "You have successfully create a book
		
		
		@GetMapping("/edit/{id}")
		public String updatePage(@PathVariable("id") Long bookId, Model model) {
			Book book= bookService.findBook(bookId);
			model.addAttribute("book", book);
			return "edit.jsp";
		}
		
		 @RequestMapping(value="/books/{id}", method=RequestMethod.PUT)
		    public String update(@Valid @ModelAttribute("book") Book book, BindingResult result) {
		        if (result.hasErrors()) {
		            return "edit.jsp";
		        } else {
		            bookService.updateBook(book);
		            return "redirect:/";
		        }
		    }
}
