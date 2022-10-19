package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Planet;
import com.revature.service.PlanetService;

@RestController
public class PlanetAndMoonController {

	@Autowired
	PlanetService planetService;
	
	@GetMapping("/planets")
	public List<Planet> getPlanets(){
		return this.planetService.getPlanetsFromOtherService();
	}
}
