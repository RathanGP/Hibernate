package com.jsp.hibernate.Hiberanate_Criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
        Configuration cfg=new  Configuration().configure().addAnnotatedClass(Person.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        
       Criteria criteria = session.createCriteria(Person.class);
       criteria.add(Restrictions.gt("PersonId", 102));
       List<Person> personList=criteria.list();
       for(Person person:personList)
       {
    	   System.out.println(person);
       }
        
        
        tran.commit();
        session.close();
        sf.close();
        
    }
}
