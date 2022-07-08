package com.travelapp.tlkp.Service;

import java.util.List;

import com.travelapp.tlkp.entities.User;

public interface UserService {

	
	public User addNewUser(User user);
	
	public User findUserByEmail(String userEmail);
	
	public List<User> getAllUser();
}
