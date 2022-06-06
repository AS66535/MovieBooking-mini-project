package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MoviesRepo;
import com.example.demo.modal.City;
import com.example.demo.modal.Movies;

@Service
public class MovieService
{

	@Autowired
	MoviesRepo repo;
	
	
	
	public 	Movies addMovies(Movies movies)
	{
		return this.repo.save(movies);
	}

	public List<Movies> getMovieList() 
	{
		
		
	
		 
		return repo.findAll();
		 
	}
	
	

}
