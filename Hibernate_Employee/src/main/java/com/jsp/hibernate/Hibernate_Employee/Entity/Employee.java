package com.jsp.hibernate.Hibernate_Employee.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	private int EmployeeId;
	private String EmployeeName;
	private String CompanyName;
	private int EmployeeSal;
	
	public int getEmployeeId()
	{
		return EmployeeId;
	}
	public void setEmployeeId(int EmployeeId)
	{
		this.EmployeeId=EmployeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public int getEmployeeSal() {
		return EmployeeSal;
	}
	public void setEmployeeSal(int employeeSal) {
		EmployeeSal = employeeSal;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", CompanyName=" + CompanyName
				+ ", EmployeeSal=" + EmployeeSal + "]";
	}
	
	
	
	
}
