package com.revature.models;

import java.util.List;
import java.util.Objects;



public class Planet {
	

	private int id;
	private String name;
	private double mass; 
	private List<String> moons;
	
	
	public Planet() {
		super();
	}


	public Planet(int id, String name, double mass, List<String> moons) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.moons = moons;
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


	public double getMass() {
		return mass;
	}


	public void setMass(double mass) {
		this.mass = mass;
	}


	public List<String> getMoons() {
		return moons;
	}


	public void setMoons(List<String> moons) {
		this.moons = moons;
	}


	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", mass=" + mass + ", moons=" + moons + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, mass, moons, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Planet other = (Planet) obj;
		return id == other.id && Double.doubleToLongBits(mass) == Double.doubleToLongBits(other.mass)
				&& Objects.equals(moons, other.moons) && Objects.equals(name, other.name);
	}
	
	
	

	
	

}
