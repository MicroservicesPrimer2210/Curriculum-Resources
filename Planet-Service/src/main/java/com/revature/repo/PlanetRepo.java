package com.revature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Planet;

public interface PlanetRepo extends JpaRepository<Planet, Integer> {
	
	List<Planet> findAll();
	
	Planet findByName(String name);
	
	
	Planet save(Planet p);
	
	void delete(Planet p);

}
