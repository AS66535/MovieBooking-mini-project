package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.City;
import com.example.demo.modal.Movies;
import com.example.demo.service.MovieService;



@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MovieController
{
	@Autowired
	MovieService movieService;
	
	
	@PostMapping("/addmovie")
	public Movies AddMovies(@RequestBody Movies movies)
	{
		return this.movieService.addMovies(movies);
	}
	
	@GetMapping("/getmovielist")
	List<Movies> getMovieList()
	{
		return movieService.getMovieList();
	}
	
	

}
