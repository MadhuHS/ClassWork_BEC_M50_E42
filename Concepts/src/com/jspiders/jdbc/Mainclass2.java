package com.jspiders.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class DbDemo {
	String dburl = "jdbc:mysql://localhost:3306/userdb";
	String dbUsername = "root";
	String dbPasssword = "root";

	Connection con = null;

	String insertStmt = "insert into userdb.appusers values (?,?,?,?)";

	// Step 1: Register and Open Connection
	public void openConnectionToDb() {
		try {
			con = DriverManager.getConnection(dburl, dbUsername, dbPasssword);
			System.out.println("Connected to userdb");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insert(String name, String email, String mob) {
		try {

			openConnectionToDb();
			// Step 2: Create
			PreparedStatement pstmt = con.prepareStatement(insertStmt);

			pstmt.setInt(1, 0);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, mob);

			// Step 3: Execute
			pstmt.executeUpdate();

			System.out.println("Record added to appuser table");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	public void update(String name, String email, String mob) {
		String updateStmt = "update userdb.appusers set name = ?,email = ? where mob = ?";

		try {
			openConnectionToDb();
			PreparedStatement pstmt = con.prepareStatement(updateStmt);
			pstmt.setString(1, name);
			pstmt.setString(2, email);
			pstmt.setString(3, mob);

			int count = pstmt.executeUpdate();
			System.out.println(count + " no of rows updated");
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}
	}

	public void deleteByEmail(String email) {
		String deleteStmt = "delete from userdb.appusers where email = ?";

		try {
			openConnectionToDb();
			PreparedStatement pstmt = con.prepareStatement(deleteStmt);
			pstmt.setString(1, email);

			int count = pstmt.executeUpdate();
			System.out.println(count + " records deleted from appuser table");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConnection();
		}

	}

	public void selectUserByEmail(String email)
	{

	}

	public void selectAllUsers() 
	{
       String selectAllStmt = "select * from userdb.appusers";
       
       try 
       {
    	openConnectionToDb();
		PreparedStatement pstmt = con.prepareStatement(selectAllStmt);
		
		ResultSet rSet  = pstmt.executeQuery(selectAllStmt);
		
		int count = 0;
		
		while(rSet.next() == true)
		{
			
			int uid = rSet.getInt("uid");
			String name = rSet.getString("name");
			String email = rSet.getString("email");
			String mob = rSet.getString("mob");
			
			System.out.println(uid+" "+name+" "+email+" "+mob);
	
			count++;
		}
		System.out.println(count+" records selected");
	   }
       catch (SQLException e)
       {
		e.printStackTrace();
	   }
       finally
       {
    	   closeConnection();
       }
	}

	// Step 4: Close Connection
	public void closeConnection() 
	{

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

		// d1.insert("user9", "user9@gmail.com", "9876543210");
		// d1.update("Appuser2","appuser2@gmail.com", "987766543211");

		//d1.deleteByEmail("user9@gmail.com");
		
		d1.selectAllUsers();

	}
}
