package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Planet;
import com.revature.repo.PlanetRepo;

@RestController
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
	public Planet insertPlanet(@RequestBody Planet p) {
		return this.planetRepo.save(p);
	}
	
	@DeleteMapping("/planet/{name}")
	public void deletePlanet(@PathVariable String name) {
		Planet p = this.planetRepo.findByName(name);
		
		this.planetRepo.delete(p);
		
	}
	
}
