//this service will response 'Hello' in different languages 

package com.demoSignup.myProject.services;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String greetingInEnglish() {
		return "HELLO!!";
		
	}
	public String greetingInSpanish() {
		return "HOLA!!";
		
	}
	public String greetingInHindi() {
		return "NAMASTE!!";
		
	}

}
