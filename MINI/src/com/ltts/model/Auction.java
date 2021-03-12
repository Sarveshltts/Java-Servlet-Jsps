package com.ltts.model;

public class Auction 
{
	private int aucid;
	private int pid;
	private int tid;
	private int year;
	private int cost;
	public int getAucid() {
		return aucid;
	}
	public void setAucid(int aucid) {
		this.aucid = aucid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Auction(int aucid, int pid, int tid, int year, int cost) {
		super();
		this.aucid = aucid;
		this.pid = pid;
		this.tid = tid;
		this.year = year;
		this.cost = cost;
	}
	public Auction() {
		super();
	}
	
	
}
