package com.sbnz.pestdeterminatorapp.model;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String username;
	private String password;
	private List<Long> plants = new ArrayList<>();
	
	public User() {
	}
	
	public User(String username, String password, List<Long> plants) {
		super();
		this.username = username;
		this.password = password;
		this.plants = plants;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Long> getPlants() {
		return plants;
	}
	public void setPlants(List<Long> plants) {
		this.plants = plants;
	}
}
