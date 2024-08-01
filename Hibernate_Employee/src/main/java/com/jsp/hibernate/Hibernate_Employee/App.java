package com.jsp.hibernate.Hibernate_Employee;

import com.jsp.hibernate.Hibernate_Employee.Repository.EmployeeRepository;

public class App 
{
    public static void main( String[] args )
    {
       EmployeeRepository emp=new EmployeeRepository();
       emp.findEmployee();
    }
}
