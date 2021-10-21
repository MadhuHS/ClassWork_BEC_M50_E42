package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class DbDemo 
{
	String dburl = "jdbc:mysql://localhost:3306/userdb";
	String dbUsername = "root";
	String dbPasssword = "root";

	Connection con = null;

	String insertStmt = "insert into userdb.appusers values (?,?,?,?)";


	// Step 1: Register and Open Connection
	public void openConnectionToDb() {
		try 
		{
			con = DriverManager.getConnection(dburl, dbUsername, dbPasssword);
			System.out.println("Connected to userdb");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	public void insert(String name, String email, String mob) {
		try {
			// Step 2: Create
			PreparedStatement pstmt = con.prepareStatement(insertStmt);

			pstmt.setInt(1, 0);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, mob);

			// Step 3: Execute
			pstmt.executeUpdate();

			System.out.println("Record added to appuser table");

		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

	public void update(String name, String email, String mob)
	{
     String updateStmt = "update userdb.appusers set name = ?,email = ? where mob = ?";

	  try 
	  {
		PreparedStatement pstmt = con.prepareStatement(updateStmt);
		pstmt.setString(1, name);
		pstmt.setString(2, email);
		pstmt.setString(3, mob);
		
		int count = pstmt.executeUpdate();
		System.out.println(count+" no of rows updated");
	  } 
	   
	  catch (SQLException e)
	  {
		e.printStackTrace();
	  }
	}

	public void deleteByEmail(String email)
	{
       
	}

	public void selectUserByEmail(String email) {

	}

	public void selectAllUsers() {

	}

	//Step 4: Close Connection
	public void closeConnection() {

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

public class Mainclass2
{
	public static void main(String[] args) 
	{
       DbDemo d1 = new DbDemo();
       
       d1.openConnectionToDb();
       
       //d1.insert("user9", "user9@gmail.com", "9876543210");
       d1.update("Appuser2","appuser2@gmail.com", "987766543211");
      
       d1.closeConnection();
	}
}







