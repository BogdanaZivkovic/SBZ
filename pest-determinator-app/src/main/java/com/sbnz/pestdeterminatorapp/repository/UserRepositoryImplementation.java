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
		
		List<Long> plants = new ArrayList<>();
		plants.add(1L);
		plants.add(2L);
		plants.add(3L);
		plants.add(4L);
		
		u.setPlants(plants);
		
		users.add(u);
	}
	
	public List<User> findAll() {
		return users;
	}
	
	public User findByUsername(String username) {
		for(User user : users) {
			if (user.getUsername().equals(username)) {
				System.out.println(user.getUsername());
				return user;
			}
		}
		return null;
	}
}
