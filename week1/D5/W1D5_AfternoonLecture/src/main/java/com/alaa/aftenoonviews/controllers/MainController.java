package com.alaa.aftenoonviews.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(Model model) {
		String name = "Alex";
		int age = 88;
		String resp = "<div><h1>sqmdhf</h1><script>alert('You have been hacked')</script></div>";
		model.addAttribute("x", name);
		model.addAttribute("AlexAge", age);
		model.addAttribute("msg", resp);
		return "index.jsp";
	}
	
	@RequestMapping("/home")
	public String home(Model model) {
		String quote = "There no place like Home !";
		ArrayList <String> homeList = new ArrayList<String>();
		homeList.add("kitchen");
		homeList.add("Bathroom");
		homeList.add("Living Room");
		homeList.add("BedRoom");
		
		model.addAttribute("quote",quote);
		model.addAttribute("roomList", homeList);
		return "home.jsp";
	}
}
