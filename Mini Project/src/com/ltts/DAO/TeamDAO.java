package com.ltts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ltts.config.Config;
import com.ltts.model.Team;

public class TeamDAO 
{
	public boolean insertteam(Team player) throws Exception
	{
		Config c=new Config();
		Connection con=c.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into team values(?,?,?,?,?)");
		ps.setInt(1,player.getTid());
		ps.setString(2,player.getTname());
		ps.setString(3,player.getOname());
		ps.setString(4, player.getCname());
		ps.setInt(5,player.getPid());
		
		Boolean b=ps.execute();
		return b;
	}
}
