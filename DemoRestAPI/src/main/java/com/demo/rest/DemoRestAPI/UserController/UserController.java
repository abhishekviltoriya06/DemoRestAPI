package com.demo.rest.DemoRestAPI.UserController;

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
import com.demo.rest.DemoRestAPI.Domain.User;
import com.demo.rest.DemoRestAPI.Service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	 public UserController(UserService userservice) {
		 this.userservice=userservice;
	 }
	 @RequestMapping(value = "/getUsers", method = RequestMethod.GET, headers = "Accept=application/json")
	    public List getData() {
		 	List listofUsers = userservice.getUsers();
	        return listofUsers;
	    }
	 @RequestMapping(value = "/addUsers", method = RequestMethod.POST, headers = "Accept=application/json")
	    public void addData(@RequestBody User user) {
	 
	        userservice.addUsers(user);
	 }
	 
	 @RequestMapping(value = "/updateUsers", method = RequestMethod.PUT, headers = "Accept=application/json")
	    public void updateCountry(@RequestBody User user) {
		 userservice.updateUser(user);
	    }
	 
	    @RequestMapping(value = "/deleteUsers/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	    public void deleteCountry(@PathVariable("id") int id) {
	    	userservice.deleteUser(id);  
	    } 
}
