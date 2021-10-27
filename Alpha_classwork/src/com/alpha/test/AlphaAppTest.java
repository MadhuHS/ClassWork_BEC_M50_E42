package com.alpha.test;

import java.util.List;

import com.alpha.db.HotelRepositoryImpl;
import com.alpha.entities.Hotel;
import com.alpha.utils.Utilities;

public class AlphaAppTest 
{
   public static void testHotelRepsoitory()
   {
	   HotelRepositoryImpl h1 = new HotelRepositoryImpl();
	   
	   List<Hotel> hotels = h1.selectAllHotels();
	   
	   System.out.println("no. of hotels : "+hotels.size());
	   
	   for (int index = 0; index < hotels.size(); index++) 
	   {
		   System.out.println(hotels.get(index).getHotelName());
       }
	   
   }
   
   public static void testUtilities()
   {
	      Utilities util = new Utilities();
		  
		  boolean res; 
		  
		  res = util.verifyName("ALPHA"); 
		  System.out.println("res : "+res);
		  
		  
		  res = util.verifyEmailFormat("ALPHA123@gmail.com"); 
		  System.out.println("res : "+res);
		  
		  
		  res = util.verifyPassword("abc1234%");
		  System.out.println("res : "+res);
   }
   public static void main(String[] args) 
   {
	   testHotelRepsoitory();
   }
}
