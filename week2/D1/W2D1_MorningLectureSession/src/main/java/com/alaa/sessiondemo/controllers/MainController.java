package com.alaa.sessiondemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model) {
		
		int number = 45;
		model.addAttribute("aKey", number);
		return "index.jsp";
	}
	
	@RequestMapping("/contact")
	public String contact(HttpSession session, Model model) {// Dependency Injection
		String name = "August";
		String  anotherName = "Annie";
		session.setAttribute("name", name);
		model.addAttribute("name", anotherName);
		return "contact.jsp";
	}
	
	@RequestMapping("/about")
	public String about(HttpSession sesh) {
		String someName = (String) sesh.getAttribute("name");
		System.out.println(someName);
		return "about.jsp";
	}
	
	@RequestMapping(value ="/processForm",  method=RequestMethod.POST)
	public String process(@RequestParam("email") String email,
							@RequestParam("message") String msg,
							HttpSession s) {
		
		System.out.println(email + ":" + msg);
		s.setAttribute("message", msg);
		s.setAttribute("email", email);
		
		return "redirect:/";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
	
		return "/admin/dashboard.jsp";
	}
}
