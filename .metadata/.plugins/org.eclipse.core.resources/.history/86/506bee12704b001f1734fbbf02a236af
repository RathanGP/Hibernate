package com.jsp.hibernate.Hibernate_JPA;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App 
{
    public static void main( String[] args )
    {
    
    	Vehicle vehicle=new Vehicle();
    	vehicle.setVehicleId(101);
    	vehicle.setVehicleName("BMW M1000RR");
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_config");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        Scanner sc=new Scanner(System.in);
        
        et.begin();
        
//        Query query = em.createQuery("update Vehicle v set v.VehicleName=?1 where v.VehicleId=?2");
//        System.out.println("Enter the Value to be updated");
//        query.setParameter(1, sc.next());
//        query.setParameter(2, sc.nextInt());
//        query.getResultList();
        em.merge(vehicle);
        
        
        et.commit();
        em.close();
        emf.close();
        
    }
}
