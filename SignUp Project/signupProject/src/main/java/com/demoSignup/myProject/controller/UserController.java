//This controller is used to call UserRepository to get all user names..

package com.demoSignup.myProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demoSignup.myProject.repository.UserRepository;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	//dependancy injection 
	@Autowired
	 UserRepository userRepository;	
	 
	 @RequestMapping
	 public String toTest() {
	  return "Welcome to Java Inspires...";
	 }
	 
	 // this method is used to get all user's name
	 @RequestMapping("/getusernames")
	 public List<String> getAllUserNames() {
	  return userRepository.getAllUserNames();
	 

}
}
