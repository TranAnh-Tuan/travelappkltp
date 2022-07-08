package com.travelapp.tlkp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travelapp.tlkp.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "select * from users where user_id = :id", nativeQuery = true)
	User findUserById(int id);
	
	@Query(value = "select * from users where user_email = :email", nativeQuery = true)
	User findUserByEmail(String email);

}