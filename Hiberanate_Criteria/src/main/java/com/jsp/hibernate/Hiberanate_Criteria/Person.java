package com.jsp.hibernate.Hiberanate_Criteria;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person 
{
	@Id
	private int PersonId;
	private String PersonName;
	public int getPersonId() {
		return PersonId;
	}
	public void setPersonId(int personId) {
		PersonId = personId;
	}
	public String getPersonName() {
		return PersonName;
	}
	public void setPersonName(String personName) {
		PersonName = personName;
	}
	@Override
	public String toString() {
		return "Person [PersonId=" + PersonId + ", PersonName=" + PersonName + "]";
	}
	

}
