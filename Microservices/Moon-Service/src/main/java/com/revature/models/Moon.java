package com.revature.models;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Domain Driven Development is building classess and models for the specific domain. 
//  Rather than trying to build a unified, universally agreed models and classes, we just 
// build our classes and models specially for each service. 

@Entity 
@Table(name="moons")
public class Moon {
	
	@Id
	@Column(name = "moon_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id; 
	
	private String name;
	
	@Column(name="my_planet", nullable = false)
	private String myPlanet;

	public Moon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moon(int id, String name, String myPlanet) {
		super();
		this.id = id;
		this.name = name;
		this.myPlanet = myPlanet;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyPlanet() {
		return myPlanet;
	}

	public void setMyPlanet(String myPlanet) {
		this.myPlanet = myPlanet;
	}

	@Override
	public String toString() {
		return "Moon [id=" + id + ", name=" + name + ", myPlanet=" + myPlanet + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, myPlanet, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Moon other = (Moon) obj;
		return id == other.id && Objects.equals(myPlanet, other.myPlanet) && Objects.equals(name, other.name);
	}
	
	

}
