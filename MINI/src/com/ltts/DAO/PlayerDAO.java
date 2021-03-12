package com.ltts.DAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.Config;
import com.ltts.model.Player;

public class PlayerDAO 
{
	
	public boolean insertplayer(Player player) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into player values(?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,player.getPlayerid());
		ps.setString(2,player.getPlayername());
		ps.setInt(3,player.getTeamid());
		ps.setDate(4, player.getDob());
		ps.setString(5,player.getSkill());
		ps.setInt(6,player.getNumberofmatches());
		ps.setInt(7,player.getRuns());
		ps.setInt(8,player.getWickets());
		ps.setString(9, player.getCountry());

		Boolean b=ps.execute();
		return b;
	}
	public List<Player> getAllPlayers() throws Exception{
		List<Player> li=new ArrayList<Player>();
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from player");
		ResultSet rs=ps.executeQuery();
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Player(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4),rs.getString(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getString(9)));
		}
		return li;
		
	}
	public Player getAllPlayerById(int id) throws Exception
	{
		Player p=new Player();
		List<Player> li=new ArrayList<Player>();
		li=getAllPlayers();
		
		for(Player p1:li)
		{
			if(p1.getPlayerid()==id)
			{
				p.setPlayerid(id);
				p.setPlayername(p1.getPlayername());
				p1.setTeamid(p1.getTeamid());
				p.setDob(p1.getDob());
				p.setSkill(p1.getSkill());
				p.setNumberofmatches(p1.getNumberofmatches());
				p.setRuns(p1.getRuns());
				p.setWickets(p1.getWickets());
				p.setCountry(p1.getPlayername());
			}
		}
		return p;
	}
	public Boolean updateplayer(int id,String pname,int tid,Date dob,String skill,int nom,int runs,int wickets,String count) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE player SET playername=?,teamid=?,dob=?,skill=?,noofmatches=?,runs=?,wickets=?,national=? where playerid=?");
		ps.setString(1,pname);
		ps.setInt(2, tid);
		ps.setDate(3, dob);
		ps.setString(4, skill);
		ps.setInt(5, nom);
		ps.setInt(6, runs);
		ps.setInt(7, wickets);
		ps.setString(8, count);
		ps.setInt(9,id);
		Boolean b=ps.execute();
		return b;
	}
	
}
