package com.revature.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.models.Moon;

public interface MoonRepo extends JpaRepository<Moon, Integer>{
	
	List<Moon> findAll();
	
	Moon findByName(String name);
	
	Moon save(Moon m);
	
	void delete(Moon m);

}
