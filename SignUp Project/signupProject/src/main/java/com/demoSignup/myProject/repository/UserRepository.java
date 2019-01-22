// this class is used to execute query and get data from DB
package com.demoSignup.myProject.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	
	//Dependancy injection
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	 // this method returns list of user's firstNames from userinfo table
	public List<String> getAllUserNames() 
	{
		  List<String> userNameList = new ArrayList<>();
		  
		  userNameList.addAll(jdbcTemplate.queryForList("select userFirstName from userdb.userinfo;", String.class));
		  
		  return userNameList;
	}
}
