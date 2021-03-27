package com.snl.eventmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
 
	
	@GetMapping("/getData")
	public String getData() {
		return "sunil";
	}
}
