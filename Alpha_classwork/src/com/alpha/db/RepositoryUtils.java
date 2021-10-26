package com.alpha.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RepositoryUtils {

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
}
