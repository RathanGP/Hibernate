package com.jsp.hibernate.Hibernate_Student;

import com.jsp.hibernate.Hibernate_Student.Repository.StudentRepository;

public class App 
{
    public static void main( String[] args )
    {
        StudentRepository StudentRep=new StudentRepository();
        StudentRep.deleteStudent();
    }
}
