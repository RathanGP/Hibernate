package com.jsp.hibernate.Hibernate_Query;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
	@Id
	private int StudentId;
	private String Studentname;
	private int StudentMarks;
	public int getStudentMarks() {
		return StudentMarks;
	}
	public void setStudentMarks(int studentMarks) {
		StudentMarks = studentMarks;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", Studentname=" + Studentname + ", StudentMarks=" + StudentMarks
				+ "]";
	}
	

}
