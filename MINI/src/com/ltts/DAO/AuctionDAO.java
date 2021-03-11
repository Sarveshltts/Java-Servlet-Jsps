package com.ltts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.Config;
import com.ltts.model.Auction;

public class AuctionDAO 
{
	public boolean insertauction(Auction player) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into auction values(?,?,?,?,?)");
		ps.setInt(1,player.getAucid());
		ps.setInt(2,player.getTid());
		ps.setInt(3,player.getPid());
		ps.setInt(4,player.getYear());
		ps.setInt(5,player.getCost());
		
		Boolean b=ps.execute();
		return b;
	}
	public List<Auction> getAllAuction() throws Exception{
		List<Auction> li=new ArrayList<Auction>();
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from auction");
		ResultSet rs=ps.executeQuery();
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Auction(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getInt(5)));
		}
		return li;
		
	}
	public Auction getAllAuctionById(int id) throws Exception
	{
		Auction p=new Auction();
		List<Auction> li=new ArrayList<Auction>();
		li=getAllAuction();
		
		for(Auction p1:li)
		{
			if(p1.getAucid()==id)
			{
				p.setAucid(id);
				p.setTid(p1.getTid());
				p.setPid(p1.getPid());
				p.setYear(p1.getYear());
				p.setCost(p1.getCost());
			}
		}
		return p;
	}
	public Boolean updateAuction(int id,int tid,int pid,int year,int cost) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE auction SET teamid=?,playerid=?,year=?,cost=? where auctionid=?");
		ps.setInt(1,tid);
		ps.setInt(2, pid);
		ps.setInt(3, year);
		ps.setInt(4, cost);
		ps.setInt(5,id);
		Boolean b=ps.execute();
		return b;
	}
}
