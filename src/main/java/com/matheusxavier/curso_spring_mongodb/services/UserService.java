package com.matheusxavier.curso_spring_mongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusxavier.curso_spring_mongodb.domain.User;
import com.matheusxavier.curso_spring_mongodb.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}
