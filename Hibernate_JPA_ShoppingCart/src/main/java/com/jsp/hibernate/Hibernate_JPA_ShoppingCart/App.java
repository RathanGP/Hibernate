package com.jsp.hibernate.Hibernate_JPA_ShoppingCart;

import com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Respository.ShoppingCartRepository;

public class App 
{
    public static void main( String[] args )
    {
       ShoppingCartRepository scr=new ShoppingCartRepository();
       scr.findAllProductByUserEmail();
    }
}