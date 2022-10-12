package com.revature.models;

import java.util.Objects;



public class Planet {
	

	private int id;
	private String name;
	private double mass; 
	
	
	public Planet() {
		super();
	}
	private double oribitalRadius;
	private boolean rings;
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
	public double getOribitalRadius() {
		return oribitalRadius;
	}
	public void setOribitalRadius(double oribitalRadius) {
		this.oribitalRadius = oribitalRadius;
	}
	public boolean isRings() {
		return rings;
	}
	public void setRings(boolean rings) {
		this.rings = rings;
	}
	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", mass=" + mass + ", oribitalRadius=" + oribitalRadius
				+ ", rings=" + rings + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, mass, name, oribitalRadius, rings);
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
				&& Double.doubleToLongBits(oribitalRadius) == Double.doubleToLongBits(other.oribitalRadius)
				&& rings == other.rings;
	}
	
	

}
