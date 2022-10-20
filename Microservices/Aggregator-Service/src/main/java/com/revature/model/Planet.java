package com.revature.model;

import java.util.List;
import java.util.Objects;

public class Planet {
	

	private int id;
	private String name;
	private double mass; 
	private List<Moon> myMoons;
	public Planet(int id, String name, double mass, List<Moon> myMoons) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.myMoons = myMoons;
	}
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
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
	public List<Moon> getMyMoons() {
		return myMoons;
	}
	public void setMyMoons(List<Moon> myMoons) {
		this.myMoons = myMoons;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", mass=" + mass + ", myMoons=" + myMoons + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mass, myMoons, name);
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
				&& Objects.equals(myMoons, other.myMoons) && Objects.equals(name, other.name);
	}
	
	
}
