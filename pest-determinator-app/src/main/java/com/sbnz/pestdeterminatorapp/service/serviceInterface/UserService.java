package com.sbnz.pestdeterminatorapp.service.serviceInterface;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.User;

public interface UserService {
	
	User findByUsername(String username);
	
    List<User> findAll();

    User save(User user);
}
