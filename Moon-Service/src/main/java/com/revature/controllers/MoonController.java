package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Moon;
import com.revature.repo.MoonRepo;

@RestController
public class MoonController {
	
	@Autowired
	MoonRepo repo;

	@GetMapping("/moons")
	public List<Moon> getAllPlanets() {
		return this.repo.findAll();
	}
	
	@PostMapping("/moon")
	public Moon insertPlanet(@RequestBody Moon p) {
		return this.repo.save(p);
	}
	
	@DeleteMapping("/moon/{name}")
	public void deletePlanet(@PathVariable String name) {
		Moon p = this.repo.findByName(name);
		
		this.repo.delete(p);
		
	}
}
