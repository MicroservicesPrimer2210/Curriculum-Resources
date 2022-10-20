package com.revature.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Moon;
import com.revature.model.Planet;

import io.github.resilience4j.retry.annotation.Retry;

@Service
public class PlanetService {
	
	private String endpoint = "http://gateway:9000/planet-api/";
	
	private final RestTemplate restTemplate; //This is what we are going to use to consume our planet-service 
	
	private MoonService moonService;
	
	public PlanetService(RestTemplate restTemplate, MoonService moonService) {
		this.restTemplate = restTemplate;
		this.moonService = moonService;
	}
	
	//fallbackmethod, the method should be in the same class, with an extra argument for the exception
	@Retry(name = "planetBackend", fallbackMethod = "backupPlan")
	public List<Planet> getPlanetsFromOtherService(){
		URI uri = URI.create(endpoint+ "planets");
		
		Planet[] allThePlanets = this.restTemplate.getForObject(uri, Planet[].class);
		
		List<Planet> planetList = Arrays.asList(allThePlanets);
		
		//DRY - Don't repeat yourself
		List<Moon> moonList = moonService.getMoonsFromOtherService();
		
		for(Planet p: planetList) {
			List<Moon> planetMoonList = new ArrayList<>();
			for(Moon m: moonList) {
				
				if(m.getMyPlanet().equals(p.getName())) {
					planetMoonList.add(m);
				}
			}
			
			p.setMyMoons(planetMoonList);
		}
		
		return planetList;
	}
	
	@Retry(name = "backupBackup", fallbackMethod = "backUpPlanToBackUpPlan")
	public List<Planet> backupPlan(Exception e){
		e.printStackTrace();
		List<Planet> fakePlanets = new ArrayList<>();
		fakePlanets.add(new Planet());
		return fakePlanets;
	}
	
	
	public List<Planet> backUpPlanToBackUpPlan(Exception e,Exception e2){
		return null;
	};
	

}

