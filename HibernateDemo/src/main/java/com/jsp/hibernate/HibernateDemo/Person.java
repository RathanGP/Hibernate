package com.jsp.hibernate.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person 
{
	@Id
	private int personId;
	private String personName;
	private int personSal;
	
	@OneToMany
	private List<Vehicle> vehicle;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonSal() {
		return personSal;
	}

	public void setPersonSal(int personSal) {
		this.personSal = personSal;
	}

	public List<Vehicle> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<Vehicle> vehicle) {
		this.vehicle = vehicle;
	}

	
	
}
