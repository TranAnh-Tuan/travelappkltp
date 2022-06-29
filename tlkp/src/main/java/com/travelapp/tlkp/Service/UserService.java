package com.travelapp.tlkp.Service;

import com.travelapp.tlkp.entities.User;

public interface UserService {

	public User getUserById(int id);
	
	public User addNewUser(User user);
	
	User findUserByEmail(String email);
}
