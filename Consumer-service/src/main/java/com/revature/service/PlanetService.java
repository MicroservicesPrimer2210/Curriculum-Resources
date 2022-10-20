package com.revature.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.models.Planet;

import io.github.resilience4j.retry.annotation.Retry;

@Service
public class PlanetService {
	
	private final RestTemplate restTemplate; //This is what we are going to use to consume our planet-service 
	
	private String endpoint = "http://gateway:9000/planet-api/";
	
	public PlanetService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@Retry(name = "planetSearch", fallbackMethod = "backupPlan")
	public List<Planet> getPlanetsFromOtherService(){
		URI uri = URI.create(endpoint + "planets");
		
		Planet[] allThePlanets = this.restTemplate.getForObject(uri, Planet[].class);
		
		List<Planet> planetList = Arrays.asList(allThePlanets);
		
		return planetList;
	}
	
	public List<Planet> backupPlan(Exception e){
		e.printStackTrace();
		List<Planet> fakePlanets = new ArrayList<>();
		fakePlanets.add(new Planet());
		return fakePlanets;
	}
	
	public boolean createPlanet(Planet p) {
		URI uri = URI.create(endpoint + "planet");
		
		this.restTemplate.postForObject(uri, p, Planet.class);
		
		
		
		return true;
		
	}
	
	

}
