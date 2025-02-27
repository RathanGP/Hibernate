package com.jsp.hibernate.HibernateProjectRetationalMapping1to1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Aadhar
{
	@Id
	private int AadharId;
	private int AadhrNo;
	
	@OneToOne
	private Person Person;
	
	public Person getPerson() {
		return Person;
	}
	public void setPerson(Person person) {
		Person = person;
	}
	public int getAadharId() {
		return AadharId;
	}
	public void setAadharId(int aadharId) {
		AadharId = aadharId;
	}
	public int getAadhrNo() {
		return AadhrNo;
	}
	public void setAadhrNo(int aadhrNo) {
		AadhrNo = aadhrNo;
	}

}
