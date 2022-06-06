package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.Screen;
import com.example.demo.modal.Theatre;

public interface ScreenRepo extends JpaRepository<Screen, Integer> 
{

	Theatre save(Theatre theatre);

	
	
	
	

	
	
}
