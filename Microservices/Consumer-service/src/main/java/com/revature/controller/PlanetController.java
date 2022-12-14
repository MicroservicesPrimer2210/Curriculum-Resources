package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;
import com.revature.service.PlanetService;

@RestController
public class PlanetController {

	@Autowired
	PlanetService planetService;
	
	@GetMapping("/planets")
	public List<Planet> getPlanets(){
		return this.planetService.getPlanetsFromOtherService();
	}
	
	@PostMapping("/planet")
	public void createPlanet(@RequestBody Planet p) {
		this.planetService.createPlanet(p);
	}
}
