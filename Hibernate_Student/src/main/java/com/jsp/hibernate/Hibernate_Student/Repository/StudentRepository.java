package com.jsp.hibernate.Hibernate_Student.Repository;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.jsp.hibernate.Hibernate_Student.Entity.Student;

public class StudentRepository 
{
	Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class);
	SessionFactory sf=cfg.buildSessionFactory();
	Scanner sc=new Scanner(System.in);
	
	public void addStudent()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Student student=new Student();
		System.out.println("Enter StudentID");
		student.setStudentId(sc.nextInt());
		System.out.println("Enter Student Name");
		student.setStudentName(sc.next());
		System.out.println("Enter Student Email");
		student.setStudentEmail(sc.next());
		System.out.println("Enter Student CGPA");
		student.setStudentCGPA(sc.nextDouble());
		System.out.println("Enter Student College");
		student.setCollege(sc.next());
		
		session.save(student);
		
		tran.commit();
		session.close();
		sf.close();
	}
	public void findStudentById()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		System.out.println("Enter StudentID to find Student");
		Student student=session.get(Student.class, sc.nextInt());
		
		System.out.println(student);
		session.save(student);
		
		tran.commit();
		session.close();
		sf.close();
		
	}
	public void findStudentByEmail()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Query<Student> query=session.createQuery("from Student s where s.StudentEmail=?1");
		System.out.println("enter the emailId of student");
		query.setParameter(1, sc.next());
		List<Student> studentList=query.list();
		
		for(Student student:studentList)
		{
			System.out.println(student);
		}
		
		tran.commit();
		session.close();
		sf.close();
		
	}
	public void findStudentByName()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Query<Student> query=session.createQuery("from Student s where s.StudentName=?1");
		System.out.println("Enter the Student Name");
		query.setParameter(1, sc.next());
		List<Student> studentList=query.list();
		for(Student student:studentList)
		{
			System.out.println(student);
		}
		
		tran.commit();
		session.close();
		sf.close();
	}
	public void updateStudentCGPA()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Query<Student> query=session.createQuery("from Student s where s.College=?1");
		System.out.println("Enter the College");
		query.setParameter(1, sc.next());
		List<Student> studentList=query.list();
		System.out.println(studentList);
		
		for(Student student:studentList)
		{
			int id=student.getStudentId();
			double currentCGPA=student.getStudentCGPA();
			
			Query<Student>  query2= session.createQuery("update Student s set s.StudentCGPA=?1 where s.StudentId=?2");
			System.out.println("Enter the updated cgpa");
			query2.setParameter(1, currentCGPA+3.5);
			query2.setParameter(2, id);
			query2.executeUpdate();
		}
		
		tran.commit();
		session.close();
		sf.close();
		
	}
	public void deleteStudent()
	{
		Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		Query<Student> query=session.createQuery("delete from Student s where s.StudentId=?1");
		System.out.println("Enter StudentId to be Deleted");
		query.setParameter(1, sc.nextInt());
		query.executeUpdate();
		
		tran.commit();
		session.close();
		sf.close();
		
	}
	
}