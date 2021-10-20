package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Mainclass 
{
	public static void main(String[] args)
	{
		String dburl = "jdbc:mysql://localhost:3306/userdb";
		String dbUsername = "root";
		String dbPasssword = "root";
		
		Connection con = null;
		
		String insertStmt = "insert into userdb.appusers values (?,?,?,?)";
		
		//Step 1: Register and Open Connection
		try 
		{
			con = DriverManager.getConnection(dburl,dbUsername, dbPasssword);
			System.out.println("Connected to userdb");
			
			//Step 2: Create
			PreparedStatement pstmt = con.prepareStatement(insertStmt);
			
			pstmt.setInt(1, 0);
			pstmt.setString(2, "user7");
			pstmt.setString(3, "user8@gmail.com");
			pstmt.setString(4, "98765432710");
			System.out.println(pstmt);
			
			//Step 3: Execute
			pstmt.executeUpdate();
			
			System.out.println("Record added to appuser table");
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
		
		//Step 4: Close Connection
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
