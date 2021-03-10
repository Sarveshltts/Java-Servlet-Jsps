package com.ltts.model;

public class Team 
{
	private int tid;
	private String tname;
	private String oname;
	private String cname;
	private int pid;
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
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Team(int tid, String tname, String oname, String cname, int pid) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.oname = oname;
		this.cname = cname;
		this.pid = pid;
	}
	public Team() {
		super();
	}
	
}
