package com.demo.welcome;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

	@RequestMapping("/Welcome")
	public ResponseEntity<String> WelcomeAPI(){
		String welcomeMsg = "Welcome to gethub repository. Now will be deployed to jenkins";
		return new ResponseEntity<String>(welcomeMsg, HttpStatus.ACCEPTED);
	}
	
//	@RequestMapping("/Welcome")
//	public String WelcomeMsg() {
//		String msg = "Hello There";
//		return msg;
//	}
	

}
