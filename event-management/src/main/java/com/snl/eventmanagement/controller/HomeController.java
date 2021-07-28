package com.snl.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/api")
public class HomeController {
 
	@Autowired
      Environment env;
	@Autowired
	
	@Value("$(mail.hostname)")
	String  s;
	
	
	@GetMapping("/getData")
	public ResponseEntity<String> getData() {
		
		String str=env.getProperty("myName");
		System.out.println("hello:  "+str);
		System.out.println("hello:  "+env);
		
		return new ResponseEntity<String>( s, HttpStatus.OK);
	}
}
