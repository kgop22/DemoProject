//this service is used to perform different calculation operations. 
package com.demoSignup.myProject.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public String add(int a, int b)
	{
		return "Addition : "+(a+b);
	}
	
	public String Mult(int a, int b)
	{
		return "Multiplication : "+(a*b);
	}
	
	public String Sub(int a, int b)
	{
		return "Substraction : "+(a-b);
	}
	public String Div(int a, int b)
	{
		return "Division : "+(a/b);
	}

}
