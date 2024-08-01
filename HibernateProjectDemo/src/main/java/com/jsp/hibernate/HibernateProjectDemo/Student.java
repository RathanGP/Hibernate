package com.jsp.hibernate.HibernateProjectDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int StudentId;
	private String StudentName;
	private String StudentEmail;
	private int StudentSal;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public int getStudentSal() {
		return StudentSal;
	}
	public void setStudentSal(int studentSal) {
		StudentSal = studentSal;
	}
	
	

}
