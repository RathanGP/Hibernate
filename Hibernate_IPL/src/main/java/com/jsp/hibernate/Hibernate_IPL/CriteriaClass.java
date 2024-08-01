package com.jsp.hibernate.Hibernate_IPL;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.jsp.hibernate.Hibernate_IPL.entity.Player;



public class CriteriaClass
{
	public static void main(String[] args) 
	{
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Player.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();

		//Criteria
		//Criteria c=session.createCriteria(Player.class);
		//c.add(Restrictions.gt("Playerid", 104));
		//c.add(Restrictions.lt("Playerid", 103));
		//c.add(Restrictions.between("Playerid", 103, 106));
//		List<Player> playerList=c.list();
//		for(Player p:playerList)
//		{
//			System.out.println(p);
//		}
		
		//Hql
//		Query<Player> query=session.createQuery("Select p from Player p");
//		List<Player> playerList1=query.list();
//		for(Player p:playerList1)
//		{
//			System.out.println(p);
//		}
		
		
		//Building Criteriaquery
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Player> criteriaQuery = builder.createQuery(Player.class);
		Root<Player> root = criteriaQuery.from(Player.class);
		criteriaQuery.select(root);
		criteriaQuery.where(builder.between(root.get("Playerid"), 103,106));
								
		//Executing the CriteraQuery
		Query<Player> query=session.createQuery(criteriaQuery);
		List<Player> player=query.list();
		for(Player players:player)
		{
			System.out.println(players);
		}
		
		
		tran.commit();
		session.close();
		sf.close();
		
	}

}
