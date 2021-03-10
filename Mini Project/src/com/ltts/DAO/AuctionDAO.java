package com.ltts.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
