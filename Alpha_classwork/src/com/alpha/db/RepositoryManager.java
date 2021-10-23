package com.alpha.db;

public class RepositoryManager
{
	public Repository getRepository(String repositoryName)
	{
		System.out.println("get the "+repositoryName);
		
		switch(repositoryName)
		{
		  case "userrepo"      : Repository repo = new UserRepositoryImpl();
			                     return repo;
		                   
		 // case "hotelrepo"   : return new HotelRepositoryImpl() break;
		  
		 // case "roomrepo"    : return new RoomRepositoryImpl();
		  
		 // case "bookingrepo" : return new BookingRepositoryImpl();
		  
		  default : return null; 
		}
	}
}
