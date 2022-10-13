package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;
import com.revature.repo.PlanetRepo;

@RestController
@RequestMapping("/api")
public class PlanetController {

	@Autowired
	PlanetRepo planetRepo;
	
	@GetMapping("/planets")
	public List<Planet> getAllPlanets() {
		return this.planetRepo.findAll();
	}
	
	@GetMapping("/planet/{name}")
	public Planet getPlanetByName(@PathVariable String name) {
		return this.planetRepo.findByName(name);
	}
	
	@PostMapping("/planet")
	public void insertPlanet(@RequestBody Planet p) {
		this.planetRepo.save(p);
	}
	
}
