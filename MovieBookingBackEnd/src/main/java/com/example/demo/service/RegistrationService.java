package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ResistrationRepo;
import com.example.demo.modal.User;


@Service
public class RegistrationService
{

	@Autowired
	
	
	private ResistrationRepo repository;
	
	public User saveUser(User user)
	{
		return repository.save(user);
	}
	
public User fetchUserByEmail(String email) {
		
		return repository.findByEmail(email);
	}
	
	public User fetchUserByEmailAndUserPassword(String email , String userPassword)
	{
		return repository.findByEmailAndUserPassword(email, userPassword);
	}
}
