package com.jsp.hibernate.Hibernate_JPA_Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee
{
	@Id
	private int EmployeeID;
	private String EmployeeName;
	private String Company;
	private int Salary;
	public int getEmployeeID() {
		return EmployeeID;
	}
	public void setEmployeeID(int employeeID) {
		EmployeeID = employeeID;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeID=" + EmployeeID + ", EmployeeName=" + EmployeeName + ", Company=" + Company
				+ ", Salary=" + Salary + "]";
	}



}