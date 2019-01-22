// this is simple HelloService to display message

package com.demoSignup.myProject.services;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String hello() {
		return "Hello from HelloService";
	}
}
