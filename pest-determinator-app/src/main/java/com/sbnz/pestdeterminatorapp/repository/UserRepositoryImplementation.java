package com.sbnz.pestdeterminatorapp.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sbnz.pestdeterminatorapp.model.User;

@Repository
public class UserRepositoryImplementation implements UserRepository{
	
	private List<User> users = new ArrayList<User>();
	
	public UserRepositoryImplementation() {
		User u = new User();
		u.setUsername("student");
		u.setPassword("ftn");
		users.add(u);
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findByUsername(String username) {
		for(User user : users) {
			if (user.getUsername().equals(username)) {
				return user;
			}
		}
		return null;
	}
}
