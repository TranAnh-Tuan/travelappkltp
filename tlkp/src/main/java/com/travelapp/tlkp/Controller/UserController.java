package com.travelapp.tlkp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travelapp.tlkp.Service.UserService;
import com.travelapp.tlkp.entities.User;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	private UserService userService;
	
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}



	@PostMapping
	public User addNewUser(@RequestBody User user) {
		return this.userService.addNewUser(user);	
	}
	
	
	@GetMapping("/detail")
	public User getUserByEmail(@RequestBody String userEmail) {
		return this.userService.findUserByEmail(userEmail);
	}
	
	@GetMapping
	public List<User> getAllUser(){
		return this.userService.getAllUser();
	}
	
	
	


}
