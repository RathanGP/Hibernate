package com.jsp.hibernate.HibernateProjectEmployee;

import com.jsp.hibernate.HibernateProjectEmployee.Repository.EmployeeRepository;

public class App 
{
    public static void main( String[] args )
    {
         EmployeeRepository emprepo = new EmployeeRepository();
         	emprepo.addEmployee();
         //emprepo.updateEmployee();
         //emprepo.deleteEmployee();
    }
}
