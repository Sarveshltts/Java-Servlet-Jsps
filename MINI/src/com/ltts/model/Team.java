package com.ltts.model;

public class Team 
{
	private int tid;
	private String tname;
	private String oname;
	private String cname;

	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public Team(int tid, String tname, String oname, String cname) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.oname = oname;
		this.cname = cname;

	}
	public Team() {
		super();
	}
	
}
