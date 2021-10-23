package com.alpha.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			pstmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		closeConnection();
	}

	@Override
	public void selectUser(String email, String password)
	{
		System.out.println("selectUser() executed");
	}

	@Override
	public Repository getRepository() 
	{
		return null;
	}

}
