package com.travelapp.tlkp.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.travelapp.tlkp.Service.UserService;
import com.travelapp.tlkp.entities.User;
import com.travelapp.tlkp.repository.UserRepository;



public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}



	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User addNewUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public User findUserByEmail(String email) {
		return userRepository.findUserByEmail(email);
	}

}
