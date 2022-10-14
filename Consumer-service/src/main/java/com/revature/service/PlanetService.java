package com.revature.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Planet;

@Service
public class PlanetService {
	
	private final RestTemplate restTemplate; //This is what we are going to use to consume our planet-service 
	
	public PlanetService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	public List<Planet> getPlanetsFromOtherService(){
		URI uri = URI.create("http://localhost:9000/planet-api/planets");
		
		Planet[] allThePlanets = this.restTemplate.getForObject(uri, Planet[].class);
		
		List<Planet> planetList = Arrays.asList(allThePlanets);
		
		return planetList;
	}

}
