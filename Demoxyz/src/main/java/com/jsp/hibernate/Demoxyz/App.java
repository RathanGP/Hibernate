package com.jsp.hibernate.Demoxyz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Person person1=new Person();
    	person1.setPersonId(1);
    	person1.setPersonName("Jack");
    	
    	Aadhar aadhar1=new Aadhar();
    	aadhar1.setAadharId(101);
    	aadhar1.setAadharNumber(987765543);
    	
    	
    	
    	person1.setAadhar(aadhar1);
    	aadhar1.setPerson(person1);
    	
        Configuration cfg=new Configuration().configure().
        		addAnnotatedClass(Person.class)
        		.addAnnotatedClass(Aadhar.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        
        session.save(person1);
        
        session.save(aadhar1);
      
        
        tran.commit();
        session.close();
    }
}
