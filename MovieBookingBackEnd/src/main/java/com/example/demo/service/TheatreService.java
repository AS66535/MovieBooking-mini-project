package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ScreenRepo;
import com.example.demo.dao.TheatreRepo;
import com.example.demo.modal.City;
import com.example.demo.modal.Screen;
import com.example.demo.modal.Theatre;

@Service
public class TheatreService {

	@Autowired
	TheatreRepo theatreRepo;

	@Autowired
	ScreenRepo screenRepo;

	public List<Theatre> findByTheatreName(String theatre) {

		return theatreRepo.oncat(theatre);

	}

	public Theatre addTheatre(Theatre theatre) {
		return this.theatreRepo.save(theatre);
	}

}
