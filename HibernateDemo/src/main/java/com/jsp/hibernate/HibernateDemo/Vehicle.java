package com.jsp.hibernate.HibernateDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle
{
	@Id
	private int vehicleId;
	private String vehicleName;
	private int vehiclePrice;
	
	@ManyToOne
	private Person person;
	
	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public int getVehiclePrice() {
		return vehiclePrice;
	}
	public void setVehiclePrice(int vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	

}
