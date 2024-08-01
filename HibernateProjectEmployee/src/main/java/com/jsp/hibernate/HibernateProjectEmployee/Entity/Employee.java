package com.jsp.hibernate.HibernateProjectEmployee.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int EmployeeId;
	private String EmployeeName;
	private String EmployeeDesignation;
	private int EmployeeSal;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeDesignation() {
		return EmployeeDesignation;
	}

	public void setEmployeeDesignation(String employeeDesignation) {
		EmployeeDesignation = employeeDesignation;
	}

	public int getEmployeeSal() {
		return EmployeeSal;
	}

	public void setEmployeeSal(int employeeSal) {
		EmployeeSal = employeeSal;
	}

}
