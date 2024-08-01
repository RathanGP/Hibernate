package com.jsp.hibernate.Hibernate_IPL.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Player
{
	@Id
	private int Playerid;
	private String PlayerName;
	private int PlayerAge;
	private String Nationality;
	private String IplTeam;
	private int IplSal;
	
	public int getPlayerid() {
		return Playerid;
	}
	public void setPlayerid(int playerid) {
		Playerid = playerid;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getPlayerAge() {
		return PlayerAge;
	}
	public void setPlayerAge(int playerAge) {
		PlayerAge = playerAge;
	}
	public String getNationality() {
		return Nationality;
	}
	public void setNationality(String nationality) {
		Nationality = nationality;
	}
	public String getIplTeam() {
		return IplTeam;
	}
	public void setIplTeam(String iplTeam) {
		IplTeam = iplTeam;
	}
	public int getIplSal() {
		return IplSal;
	}
	public void setIplSal(int iplSal) {
		IplSal = iplSal;
	}
	@Override
	public String toString() {
		return "Player [Playerid=" + Playerid + ", PlayerName=" + PlayerName + ", PlayerAge=" + PlayerAge
				+ ", Nationality=" + Nationality + ", IplTeam=" + IplTeam + ", IplSal=" + IplSal + "]";
	}
	

}






	