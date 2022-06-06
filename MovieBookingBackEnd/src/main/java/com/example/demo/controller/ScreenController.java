package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.modal.Screen;
import com.example.demo.modal.Movies;

import com.example.demo.service.ScreenService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ScreenController {
	@Autowired
	ScreenService screenService;

	@PostMapping("/addscreen")
	public Screen AddScreen(@RequestBody Screen screen) {
		return this.screenService.addScreen(screen);
	}

	@GetMapping("/getscreenlist")
	List<Screen> getScreenList() {
		return screenService.getScreenList();
	}
}
