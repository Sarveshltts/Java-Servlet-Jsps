package com.ltts.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Config {
	public Connection getConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","root");
		return con;
	}
}
