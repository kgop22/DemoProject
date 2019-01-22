//this controller is used to call WelcomeService
package com.demoSignup.myProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoSignup.myProject.services.WelcomeService;


@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@Component
public class WelcomeController {
	
	//Dependancy Injection
	@Autowired
	public WelcomeService welcomeservice;
	
	// to display welcome message
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to learn different world languages";
	}

	//to call english() in welcomeService
	@RequestMapping("/english")
	public String hello(Model model) {
		return welcomeservice.greetingInEnglish();
	}
	
	//to call spanish() in welcomeService
	@RequestMapping("/spanish")
	public String spanish(Model model) {
		return welcomeservice.greetingInSpanish();
	}
	
	//to call hindi() in welcomeService
	@RequestMapping("/hindi")
	public String india(Model model) {
		return welcomeservice.greetingInHindi();
	}

}



