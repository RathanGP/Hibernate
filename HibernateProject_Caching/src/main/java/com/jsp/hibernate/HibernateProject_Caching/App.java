package com.jsp.hibernate.HibernateProject_Caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	
      Configuration cfg=new Configuration().configure().addAnnotatedClass(Product.class);
      SessionFactory sf = cfg.buildSessionFactory();
      Session session = sf.openSession();
      Transaction tran = session.beginTransaction();
      
      
      
      Product product1=session.get(Product.class, 102);
      System.out.println(product1);
      
      Product product2=session.get(Product.class, 102);
      System.out.println(product2);
      
      
      tran.commit();
      session.close();
      
      System.out.println();
      
      
      Session session1 = sf.openSession();
      Transaction tran1 = session1.beginTransaction();
      
      
      
      Product product3=session1.get(Product.class, 102);
      System.out.println(product3);
      
      Product product4=session1.get(Product.class, 102);
      System.out.println(product4);
      
      
      tran1.commit();
      session1.close();
      
      System.out.println();
    }
}
