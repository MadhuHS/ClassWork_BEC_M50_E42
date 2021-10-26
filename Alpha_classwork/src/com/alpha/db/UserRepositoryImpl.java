package com.alpha.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.alpha.entities.User;

public class UserRepositoryImpl implements UserRepository 
{
	Connection dbCon = null;
	
	public void openConnection()
	{
	  String dburl  = "jdbc:mysql://localhost:3306/alphahotels";	
	  String dbUser = "root";
	  String dbPass = "root";
	  
	  try 
	  {
		if(dbCon == null)
		{
		 dbCon = DriverManager.getConnection(dburl,dbUser,dbPass);
		}
	  } 
	  catch (SQLException e)
	  {
		e.printStackTrace();
	  }
	  
	}
	
	public void closeConnection()
	{
		try 
		{
			dbCon.close();
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void insertUser(User usr)
	{
		openConnection();
		System.out.println("insertUser() executed");
	
		try
		{
			PreparedStatement pstmt = dbCon.prepareStatement(SQLQuery.insertUser);
			
			pstmt.setInt(1, 0);
			pstmt.setString(2, usr.getName());
			pstmt.setString(3, usr.getEmail());
			pstmt.setString(4, usr.getPassword());
			pstmt.setString(5, usr.getMob());
			pstmt.setString(6, usr.getAddress());
			pstmt.setString(7, usr.getRole());
				
			pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			System.out.println("ERROR!!! User with "+usr.getEmail()+" ALREADY REGISTERED");
			
			System.out.println("PLEASE LOGIN");
		}
		closeConnection();
	}

	@Override
	public User selectUser(String email, String password)
	{
		System.out.println("selectUser() executed");
		
		openConnection();
		
		try 
		{
			PreparedStatement pstmt =dbCon.prepareStatement(SQLQuery.selectUser);
			
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			
			ResultSet res =  pstmt.executeQuery();
			
			res.next();
			
			String usrName   = res.getString("name");
			String usrEmail  = res.getString("email");
			String usrMob    = res.getString("mob");
			String usrAddrss = res.getString("address");
			String usrRole   = res.getString("role");
			
			User usr = new User();
			
			usr.setName(usrName);
			usr.setEmail(usrEmail);
			usr.setMob(usrMob);
			usr.setAddress(usrAddrss);
			usr.setRole(usrRole);
			
			System.out.println("user login done");
			
			return usr;// return User Object
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Repository getRepository() 
	{
		return null;
	}

}
