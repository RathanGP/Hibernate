package com.jsp.hibernate.Hibernate_JPA_Employee;

import com.jsp.hibernate.Hibernate_JPA_Employee.Repository.EmployeeRespository;

public class App 
{
    public static void main( String[] args )
    {
       EmployeeRespository emp=new EmployeeRespository();
       emp.findEmployee();
    }
}
