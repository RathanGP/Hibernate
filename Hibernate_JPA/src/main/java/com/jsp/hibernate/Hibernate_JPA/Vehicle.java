package com.jsp.hibernate.Hibernate_JPA;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehicle
{
	@Id
	private int VehicleId;
	private String VehicleName;
	public int getVehicleId() {
		return VehicleId;
	}
	public void setVehicleId(int vehicleId) {
		VehicleId = vehicleId;
	}
	public String getVehicleName() {
		return VehicleName;
	}
	public void setVehicleName(String vehicleName) {
		VehicleName = vehicleName;
	}
	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + VehicleId + ", VehicleName=" + VehicleName + "]";
	}
	
	
}
