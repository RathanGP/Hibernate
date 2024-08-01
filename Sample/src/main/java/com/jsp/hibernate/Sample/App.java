package com.jsp.hibernate.Sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Student student=new Student();
    	student.setStudentId(1);
    	student.setStudentName("James");
    	
    	Course course1=new Course();
    	course1.setCourseId(101);
    	course1.setCourseName("Java Full stack");
    	
    	Course course2=new Course();
    	course2.setCourseId(102);
    	course2.setCourseName("Python Full stack");
    	
    	List<Course> course=new ArrayList<>();
    	course.add(course1);
    	course.add(course2);
    	
    	student.setCourse(course);
    	
    	course1.setStudent(student);
    	course2.setStudent(student);
    	
        Configuration cfg=new Configuration().configure()
        		.addAnnotatedClass(Student.class)
        		.addAnnotatedClass(Course.class);
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tran = session.beginTransaction();
        
        session.save(student);
        session.save(course1);
        session.save(course2);
        
        tran.commit();
        session.close();
        sf.close();
    }
}
