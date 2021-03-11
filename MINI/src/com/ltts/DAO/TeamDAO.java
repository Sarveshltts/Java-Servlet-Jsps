package com.ltts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ltts.config.Config;
import com.ltts.model.Team;

public class TeamDAO 
{
	public boolean insertteam(Team player) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into team values(?,?,?,?)");
		ps.setInt(1,player.getTid());
		ps.setString(2,player.getTname());
		ps.setString(3,player.getOname());
		ps.setString(4, player.getCname());
		
		Boolean b=ps.execute();
		return b;
	}
	public List<Team> getAllTeam() throws Exception{
		List<Team> li=new ArrayList<Team>();
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from team");
		ResultSet rs=ps.executeQuery();
		//Player p=new Player();
		while(rs.next()) {
			li.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		}
		return li;
		
	}
	public Team getAllTeamById(int id) throws Exception
	{
		Team t=new Team();
		List<Team> li=new ArrayList<Team>();
		li=getAllTeam();
		
		for(Team p1:li)
		{
			if(p1.getTid()==id)
			{
				t.setTid(id);
				t.setTname(p1.getTname());
				t.setOname(p1.getOname());
				t.setCname(p1.getCname());
			}
		}
		return t;
	}
	public Boolean updateteam(int id,String tname,String oname,String cname) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("UPDATE team SET teamname=?,ownername=?,coachname=? where teamid=?");
		ps.setString(1,tname);
		ps.setString(2, oname);
		ps.setString(3, cname);
		ps.setInt(4,id);
		Boolean b=ps.execute();
		return b;
	}
}
