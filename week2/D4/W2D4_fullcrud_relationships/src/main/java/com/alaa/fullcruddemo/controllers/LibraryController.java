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

import com.alaa.fullcruddemo.models.Book;
import com.alaa.fullcruddemo.models.Library;
import com.alaa.fullcruddemo.services.LibraryService;

@Controller
public class LibraryController {
	
	@Autowired 
	private LibraryService libraryService;
	
	
	// Show List of Libraries
	@GetMapping("/libraries")
	public String allLibraries(Model model) {
		List <Library> allLibraries = libraryService.allLiraries();
		model.addAttribute("allLibs", allLibraries);
		return "library/libraries.jsp";
	}
	
	// Get Libraries - GET
	@GetMapping("/library/new")
	public String createLib(@ModelAttribute("library") Library lib, Model model) {
		List<Library> allLibs = libraryService.allLiraries();
		model.addAttribute("allLibraries",allLibs);
		return "library/libForm.jsp";
	}
	
	// Create a Library - POST
	@PostMapping("/createLib")
	public String processForm(@Valid @ModelAttribute("library") Library library,
			BindingResult result, Model model) {
		
		 if (result.hasErrors()) {
			 List<Library> allLibs = libraryService.allLiraries();
				model.addAttribute("allLibraries",allLibs);
	            return "library/libForm.jsp";
	        } else {
	            libraryService.createLibrary(library);
	            return "redirect:/";
	        }
	}
	
	@GetMapping("/library/{id}")
	public String showOneLibrary(@PathVariable("id") Long libraryId, Model model) {
		Library oneLib =  libraryService.findLibrary(libraryId);
		model.addAttribute("library", oneLib);
		return "library/oneLib.jsp";
	}
	
}
