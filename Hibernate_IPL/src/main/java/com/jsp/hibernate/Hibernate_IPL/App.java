package com.jsp.hibernate.Hibernate_IPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.hibernate.Hibernate_IPL.rep.PlayerRepository;

public class App 
{
    public static void main( String[] args )
    {
       PlayerRepository rep=new PlayerRepository();
       rep.addPlayer();
    }
}
