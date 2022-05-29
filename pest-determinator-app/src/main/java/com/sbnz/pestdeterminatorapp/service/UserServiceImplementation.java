package com.sbnz.pestdeterminatorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbnz.pestdeterminatorapp.model.Plant;
import com.sbnz.pestdeterminatorapp.model.User;
import com.sbnz.pestdeterminatorapp.repository.PlantRepository;
import com.sbnz.pestdeterminatorapp.repository.UserRepository;
import com.sbnz.pestdeterminatorapp.service.serviceInterface.UserService;

@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private PlantRepository plantRepository;

	@Override
	public User findByUsername(String username) {
		User user = userRepository.findByUsername(username);
		List<Plant> plants = plantRepository.findAll();
		user.setPlants(plants);
		
		return user;
	}

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User save(User user) {
		//TODO implement
		return null;
	}
}
