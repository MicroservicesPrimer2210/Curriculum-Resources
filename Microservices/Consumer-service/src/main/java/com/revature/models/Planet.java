package com.revature.models;

import java.util.List;
import java.util.Objects;



public class Planet {
	

	private int id;
	private String name;
	private double mass; 
	private double orbitalRadius;
	private boolean rings;
	public Planet(int id, String name, double mass, double orbitalRadius, boolean rings) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
		this.orbitalRadius = orbitalRadius;
		this.rings = rings;
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
	public double getOrbitalRadius() {
		return orbitalRadius;
	}
	public void setOrbitalRadius(double orbitalRadius) {
		this.orbitalRadius = orbitalRadius;
	}
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", mass=" + mass + ", orbitalRadius=" + orbitalRadius
				+ ", rings=" + rings + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mass, name, orbitalRadius, rings);
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
				&& Objects.equals(name, other.name)
				&& Double.doubleToLongBits(orbitalRadius) == Double.doubleToLongBits(other.orbitalRadius)
				&& rings == other.rings;
	}
	
	
	

}
