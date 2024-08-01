package com.jsp.hibernate.HibernateProjectSample;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student 
{
	@Id
	private int studentId;
	private String studentName;
	private String studentEmail;
	private int studentSal;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public int getStudentSal() {
		return studentSal;
	}
	public void setStudentSal(int studentSal) {
		this.studentSal = studentSal;
	}
	
}
