package com.alpha.test;

import com.alpha.db.HotelRepositoryImpl;
import com.alpha.entities.Hotel;
import com.alpha.utils.Utilities;

public class AlphaAppTest 
{
   public static void testHotelRepsoitory()
   {
	   HotelRepositoryImpl h1 = new HotelRepositoryImpl();
	   Hotel[] hotels = h1.selectAllHotels();
	   
	   System.out.println("hotels : "+hotels);
	   
	   System.out.println("no. of hotels : "+hotels.length);
	   
	   for (int i = 0; i < hotels.length; i++) 
	   {
		   System.out.println(hotels[i].getHotelName());
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
