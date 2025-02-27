package com.jsp.hibernate.HibernateProjectRetationalMapping1to1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	
    	Person person=new Person();
    	person.setPersonId(101);
    	person.setPersonName("Ram");
    	
    	Aadhar aadhar=new Aadhar();
    	aadhar.setAadharId(1);
    	aadhar.setAadhrNo(95432345);
    	
    	// adding Aadhar to person
    	 person.setAadhar(aadhar);
    	// adding person to Aadhar
    	 aadhar.setPerson(person);
    	
       Configuration cfg = new Configuration().configure().addAnnotatedClass(Person.class)
       								                      .addAnnotatedClass(Aadhar.class);
       SessionFactory sf = cfg.buildSessionFactory();
       Session session = sf.openSession();
       Transaction tran = session.beginTransaction();
       
       
       session.save(person);
       session.save(aadhar);
       
       tran.commit();
       session.close();
    }
}
