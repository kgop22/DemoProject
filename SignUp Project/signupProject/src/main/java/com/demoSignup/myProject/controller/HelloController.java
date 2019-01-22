// This is the Controller class for HelloService service
package com.demoSignup.myProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoSignup.myProject.services.HelloService;

@RestController
@Component
public class HelloController {
	
	//Dependancy Injection
	@Autowired
	public HelloService helloService;
	
	//to call HelloService hello()
	@RequestMapping("/hello")		
	public String helloMessage(Model model) {			
			return helloService.hello();		
	}

}
