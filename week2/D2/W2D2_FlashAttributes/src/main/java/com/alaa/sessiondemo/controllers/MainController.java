package com.alaa.sessiondemo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {

	@RequestMapping("/")
	public String index(Model model) {
		
		int number = 45;
		model.addAttribute("aKey", number);
		return "index.jsp";
	}
	@RequestMapping("/test")
	public String test(Model model) {
		
	
		return "test.jsp";
	}
	
	@RequestMapping("/contact")
	public String contact( HttpSession session, Model model) {// Dependency Injection
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
							HttpSession s,
							RedirectAttributes flash) {
		
		System.out.println(email + ":" + msg);
		if(msg.length()< 5) {
			flash.addFlashAttribute("messageError","Message must be more 5 characters");
			return "redirect:/contact";
		}
		s.setAttribute("message", msg);
		s.setAttribute("email", email);
		
		return "redirect:/";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard() {
	
		return "/admin/dashboard.jsp";
	}
}
