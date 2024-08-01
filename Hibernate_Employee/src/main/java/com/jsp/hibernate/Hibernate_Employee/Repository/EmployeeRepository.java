package com.jsp.hibernate.Hibernate_Employee.Repository;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.Hibernate_Employee.Entity.Employee;

public class EmployeeRepository
{
	Configuration cfg=new Configuration().configure()
			          .addAnnotatedClass(Employee.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Scanner sc=new Scanner(System.in);
	
	public void addEmployee()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Employee employee=new Employee();
		System.out.println("Enter EmployeeId");
		employee.setEmployeeId(sc.nextInt());
		System.out.println("Enter EmployeeName");
		employee.setEmployeeName(sc.next());
		System.out.println("Enter CompanyName");
		employee.setCompanyName(sc.next());
		System.out.println("Enter Employee Salary");
		employee.setEmployeeSal(sc.nextInt());
		
		session.save(employee);
		
		tran.commit();
		session.close();
		sf.close();
	}
	public void findEmployee()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("Enter EmployeeId");
		Employee employee=session.get(Employee.class, sc.nextInt());
		System.out.println(employee);
		
		session.save(employee);
		
		tran.commit();
		session.close();
		sf.close();
	}
	public void updateEmployee()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("Enter EmployeeId");
		Employee employee=session.get(Employee.class, sc.nextInt());
		System.out.println("Enter CompanyName");
		employee.setCompanyName(sc.next());
		System.out.println("Enter Employee Salary");
		employee.setEmployeeSal(sc.nextInt());
		
		
		session.update(employee);
		System.out.println(employee);
		
		tran.commit();
		session.close();
		sf.close();
	}
	public void deleteEmployee()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("Enter EmployeeId to be Deleted");
		Employee employee=session.get(Employee.class, sc.nextInt());
		
		session.delete(employee);
		System.out.println("Employee Details deleted successfully....");
		
		tran.commit();
		session.close();
		sf.close();
	}
	
}
