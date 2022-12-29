package com.alaa.fullcruddemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alaa.fullcruddemo.models.Library;
import com.alaa.fullcruddemo.repositories.LibraryRepository;

@Service
public class LibraryService {

	//CRUD
	@Autowired
	private LibraryRepository libraryRepo;
	// READ ALL
    public List<Library> allLiraries() {
        return libraryRepo.findAll();
    }
    // CREATE ONE
    public Library createLibrary(Library lib) {
        return libraryRepo.save(lib);
    }
    // READ ONE
    public Library findLibrary(Long id) {
        Optional<Library> optionalLibrary = libraryRepo.findById(id);
        
        if(optionalLibrary.isPresent()) {
            return optionalLibrary.get();
        } else {
            return null;
        }
//        optionalBook.isPresent() ? return optionalBook.get() : return null;
    }
    
    // UPDATE BOOK
    public Library updateLibrary(Library lib) {
    	return libraryRepo.save(lib);
    }
    
    //TODO DELETE method
    
    public void deleteLibrary(Long id) {
    	libraryRepo.deleteById(id);
    }
}
