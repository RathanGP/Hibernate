package com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Respository;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.query.Query;

import com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Entity.Address;
import com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Entity.Cart;
import com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Entity.Product;
import com.jsp.hibernate.Hibernate_JPA_ShoppingCart.Entity.User;

public class ShoppingCartRepository
{
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql_config");
	Scanner sc=new Scanner(System.in);
	
	public void addProduct()
	{
		Product product=new Product();
		System.out.println("Enter Product Id");
		product.setProductId(sc.nextInt());
		System.out.println("Enter Product Name");
		product.setProductName(sc.next());
		System.out.println("Enter Product Brand");
		product.setProductBrand(sc.next());
		System.out.println("Enter Product Price");
		product.setProductPrice(sc.nextInt());
		
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		
		em.persist(product);
		
		tran.commit();
		em.close();
	}
	public void addUser()
	{
		User user=new User();
		System.out.println("Enter User Id");
		user.setUserId(sc.nextInt());
		System.out.println("Enter User Name");
		user.setUserName(sc.next());
		System.out.println("Enter User Email");
		user.setUserEmail(sc.next());
		
		Address address=new Address();
		System.out.println("Enter Address Id");
		address.setAddressId(sc.nextInt());
		System.out.println("Enter Location");
		address.setLocation(sc.next());
		System.out.println("Enter City");
		address.setCity(sc.next());
		
		Cart cart=new  Cart();
		System.out.println("Enter Cart ID");
		cart.setCartId(sc.nextInt());
		
		user.setAddress(address);
		user.setCart(cart);
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		
		em.persist(user);
		em.persist(address);
		em.persist(cart);
		
		tran.commit();
		em.close();
		
	}
	public void findUserById()
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		
		System.out.println("Enter the Id which you want..?");
		User user=em.find(User.class, sc.nextInt());
		System.out.println(user);
		
		tran.commit();
		em.close();	
	}
	public void findUserByAddressId()
	{	
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		
	}
	public void addProductToCart()
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
		tran.begin();
		
		Product product=em.find(Product.class, sc.nextInt());
		if(product!=null)
		{
			System.out.println("Enter User ID");
			User user=em.find(User.class, sc.nextInt());
			if(user!=null)
			{
				Cart cart=user.getCart();
				cart.getProduct().add(product);
				em.merge(cart);
			}
			else
			{
				System.err.println("User not found by ID");
			}
		}
		else
		{
			System.err.println("Product not found by ID");
		}
		
		tran.commit();
		em.close();
		
	}
	public void findAllProductByUserEmail()
	{
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<User> cq = cb.createQuery(User.class);
		Root<User> root = cq.from(User.class);
		cq.where(cb.equal(root.get("UserEmail"),sc.next()));
		
		Query query=(Query) em.createQuery(cq);
		User user=(User) query.getSingleResult();
		
		Cart cart=user.getCart();
		List<Product> products = cart.getProduct();
		for(Product product:products)
		{
			System.out.println(product);
		}
		
		em.getTransaction().commit();
		em.close();	
	}
}
