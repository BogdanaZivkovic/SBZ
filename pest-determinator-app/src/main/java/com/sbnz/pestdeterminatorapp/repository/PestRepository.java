package com.sbnz.pestdeterminatorapp.repository;

import java.util.List;

import com.sbnz.pestdeterminatorapp.model.Pest;

public interface PestRepository {
	
	public List<Pest> findAll();
	
	public Pest findByName(String name);
	
}
