package com.project.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.service.CustomerService;

@Controller
@RequestMapping("/")
public class WelcomeController {
	
	@Autowired
	CustomerService customerService;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		
		model.put("customerlist", customerService.findAll());
		
		return "home";
	}

}