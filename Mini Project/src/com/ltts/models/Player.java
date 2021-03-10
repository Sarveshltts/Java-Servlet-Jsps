package com.ltts.model;

import java.sql.Date;

public class Player {
	
	private int Playerid;
	private String playername;
	private int teamid;
	private Date dob;
	private String skill;
	private int numberofmatches;
	private int runs;
	private int wickets;
	public Player(int playerid, String playername, int teamid, Date dob, String skill, int numberofmatches, int runs,
			int wickets, String country) {
		super();
		Playerid = playerid;
		this.playername = playername;
		this.teamid = teamid;
		this.dob = dob;
		this.skill = skill;
		this.numberofmatches = numberofmatches;
		this.runs = runs;
		this.wickets = wickets;
		this.country = country;
	}
	public int getTeamid() {
		return teamid;
	}
	public void setTeamid(int teamid) {
		this.teamid = teamid;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberofmatches() {
		return numberofmatches;
	}
	public void setNumberofmatches(int numberofmatches) {
		this.numberofmatches = numberofmatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	private String country;
	
	
	
	public Player() {
		super();
	}
	public int getPlayerid() {
		return Playerid;
	}
	public void setPlayerid(int playerid) {
		Playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}



}
