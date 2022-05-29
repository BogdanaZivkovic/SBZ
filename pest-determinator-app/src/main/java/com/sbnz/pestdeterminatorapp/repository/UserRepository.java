package com.sbnz.pestdeterminatorapp.repository;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.User;

public interface UserRepository {
	
	public User findByUsername(String username);
	
	public List<User> findAll();
}
