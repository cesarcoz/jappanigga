package com.jappanigga.dto;

import java.util.Date;

public class Match {
	
	private int id;
	private City location;
	private Date date;
	private Team team1;
	private Team team2;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public City getLocation() {
		return location;
	}
	public void setLocation(City location) {
		this.location = location;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	public Match() {
		super();
	}
	public Match(int id, City location, Date date, Team team1, Team team2) {
		super();
		this.id = id;
		this.location = location;
		this.date = date;
		this.team1 = team1;
		this.team2 = team2;
	}
	
	

}
