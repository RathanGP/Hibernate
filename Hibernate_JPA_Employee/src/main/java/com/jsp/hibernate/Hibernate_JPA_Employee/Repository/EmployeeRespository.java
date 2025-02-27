package com.jsp.hibernate.Hibernate_JPA_Employee.Repository;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.Hibernate_JPA_Employee.Entity.Employee;

public class EmployeeRespository 
{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_config");
	Scanner sc=new Scanner(System.in);
	
	public void addEmployee()
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Employee employee=new Employee();
		System.out.println("Enter EmployeeId");
		employee.setEmployeeID(sc.nextInt());
		System.out.println("Enter Employee Name");
		sc.nextLine();
		employee.setEmployeeName(sc.nextLine());
		System.out.println("Enter Employee Company");
		sc.nextLine();
		employee.setCompany(sc.nextLine());
		System.out.println("Enter Employee Salary");
		employee.setSalary(sc.nextInt());
		
		em.persist(employee);
		
		et.commit();
		em.close();
	
		
	}
	public void findEmployee()
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Employee employee=new Employee();
		System.out.println("Enter the EMployeeID");
		employee.getEmployeeID();
		
		
	}

}
