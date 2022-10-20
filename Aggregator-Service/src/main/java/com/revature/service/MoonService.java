package com.revature.service;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.revature.model.Moon;

@Service
public class MoonService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	private String endpoint = "http://gateway:9000/moon-api/";

	public List<Moon> getMoonsFromOtherService(){
		URI uri = URI.create(endpoint + "moons");
		
		Moon[] allTheMoons = this.restTemplate.getForObject(uri, Moon[].class);
		
		List<Moon> moonList = Arrays.asList(allTheMoons);
		
		return moonList;
	}
}
