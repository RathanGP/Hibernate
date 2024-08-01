package com.jsp.hibernate.HibernateProjectStudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Product.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		Product product = session.get(Product.class, 0);
		
		
		session.delete(product);
		
		//session.save(product);

		tran.commit();
		session.close();
		sf.close();
    }
}
