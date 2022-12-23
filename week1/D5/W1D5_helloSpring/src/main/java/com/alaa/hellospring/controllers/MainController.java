package com.alaa.hellospring.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/api")
	public String index() {
		return "Hello Ninjas!";
	}

	@RequestMapping("/api/cool")
	public String cool() {
		System.out.println("This is Working !!!");
//		return "This is cool 🚀";
		return "<h1>This is cool</h1><hr><p>hello again</p>";
	}

	// ==== Query Parameters ====
	// http://localhost:8080/search?q=texthere
	@RequestMapping("/search")
	public String search(@RequestParam(value = "q") String someVar) {
		return "Your Searched for " + someVar;

	}

	// === Path Variables ===

	// http://localhost:8080/find/var1
//	@RequestMapping("/find/{var1}")
//	public String find() {
//		return "You Found Me!";
//	}

//	@RequestMapping("/find/{var1}/{bob}")
//	public String find(@PathVariable("var1") String var1, @PathVariable("bob") String x) {
//		return "You Found Me " + var1 + " " + x;
//	}
	
	@RequestMapping("/find/{name}/{bob}/{num}")
	public String find(@PathVariable("name") String name,
						@PathVariable("bob") String x,
						@PathVariable("num") int num) {
		if (num > 10) {
			
			return name + " has too many " + num + " things";
		}
		return "You Found Me " + name + " " + x + " " + num;
	}
}
