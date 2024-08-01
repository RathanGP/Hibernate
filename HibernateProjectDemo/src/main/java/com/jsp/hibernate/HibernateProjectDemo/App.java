package com.jsp.hibernate.HibernateProjectDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	cfg.addAnnotatedClass(Student.class);
    	SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
       
        Student student = session.get(Student.class, 101);
        student.setStudentSal(255000);
        student.setStudentEmail("rathan123@gmail.com");
        session.save(student);
        
        tran.commit();
        sf.close();
        session.close();
    }
}
