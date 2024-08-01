package com.jsp.hibernate.HibernateDemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Person person=new Person();
    	person.setPersonId(1);
    	person.setPersonName("Rathan");
    	person.setPersonSal(55000);
    	
    	Vehicle  vehicle1=new Vehicle();
    	vehicle1.setVehicleId(101);
    	vehicle1.setVehicleName("BMW");
    	vehicle1.setVehiclePrice(900000);
    	
    	Vehicle  vehicle2=new Vehicle();
    	vehicle2.setVehicleId(102);
    	vehicle2.setVehicleName("Benz");
    	vehicle2.setVehiclePrice(980000);
    	
    	 List<Vehicle> vehicle=new ArrayList<>();
    	 vehicle.add(vehicle1);
    	 vehicle.add(vehicle2);
    	 
    	 person.setVehicle(vehicle);
    	
    	 vehicle1.setPerson(person);
    	 vehicle2.setPerson(person);
    	
       Configuration cfg=new Configuration().configure()
    		   .addAnnotatedClass(Person.class)
    		   .addAnnotatedClass(Vehicle.class);
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tran = session.beginTransaction();
       
       session.save(person);
       session.save(vehicle1);
       session.save(vehicle2);
       
       
       tran.commit();
       session.close();
       sf.close();
    }
}
