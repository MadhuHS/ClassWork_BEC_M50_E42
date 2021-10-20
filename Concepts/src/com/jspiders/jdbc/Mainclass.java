package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mainclass 
{
	public static void main(String[] args)
	{
		String dburl = "jdbc:mysql://localhost:3306/userdb";
		String dbUsername = "root";
		String dbPasssword = "root";
		
		Connection con = null;
		
		//Step 1: Register and  Open Connection
		try 
		{
			con = DriverManager.getConnection(dburl,dbUsername, dbPasssword);
			System.out.println("Connected to userdb");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		//Step 2: Create
		
		//Step 3: Execute
		
		//Step 4: Process
		
		//Step 5: Close Connection
		try
		{
			con.close();
			System.out.println("Disconnected from userdb");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}

	}
}
