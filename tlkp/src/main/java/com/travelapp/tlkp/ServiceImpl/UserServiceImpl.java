package com.travelapp.tlkp.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelapp.tlkp.Service.UserService;
import com.travelapp.tlkp.entities.User;
import com.travelapp.tlkp.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository;
	
	

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}





	@Override
	public User addNewUser(User user) {
		return this.userRepository.save(user);
	}



	@Override
	public User findUserByEmail(String userEmail) {
		return userRepository.findUserByEmail(userEmail);
	}





	@Override
	public List<User> getAllUser() {
		return this.userRepository.findAll();
	}

}
