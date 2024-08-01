package com.jsp.hibernate.Hibernate_Query;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		Query<Student> query=session.createQuery("UPDATE Student s SET s.StudentMarks=:marks WHERE s.StudentId=:id");
		query.setParameter("marks", 55);
		query.setParameter("id", 101);
		int rowupdated=query.executeUpdate();
		System.out.println(rowupdated);
		
		
		
		
		tran.commit();
		session.close();
		sf.close();
    }
}
