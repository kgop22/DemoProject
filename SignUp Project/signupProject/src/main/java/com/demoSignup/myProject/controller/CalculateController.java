//This controller is used to call CalculatorService to perform calculations

package com.demoSignup.myProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoSignup.myProject.services.CalculatorService;

@RestController
@Component
public class CalculateController {
	
	//dependancy injection
	@Autowired
	public CalculatorService calculatorservice;
	
	//to call add function to perform addition
	@RequestMapping("/calculator/addition")
	public String add(Model model) {
		return calculatorservice.add(40, 20);
	}

	//to call multi function to perform multiplication
	@RequestMapping("/calculator/multiplication")
	public String multi(Model model) {
		return calculatorservice.Mult(40, 20);
	}
	
	//to call sub function to perform substraction
	@RequestMapping("/calculator/substraction")
	public String substract(Model model) {
		return calculatorservice.Sub(40, 20);
	}
	
	//to call div function to perform division
	@RequestMapping("/calculator/division")
	public String div(Model model) {
		return calculatorservice.Div(40, 20);
	}
	
}
