package com.jsp.hibernate.Hibernate_Student.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
	private int StudentId;
	private String StudentName;
	private String StudentEmail;
	private double StudentCGPA;
	private String College;
	
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
	public double getStudentCGPA() {
		return StudentCGPA;
	}
	public void setStudentCGPA(double studentCGPA) {
		StudentCGPA = studentCGPA;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentEmail=" + StudentEmail
				+ ", StudentCGPA=" + StudentCGPA + ", College=" + College + "]";
	}
	
	
}