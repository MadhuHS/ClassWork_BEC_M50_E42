package com.jspiders.collections;

import java.util.Vector;

class Hotel
{
	private String hotelName;
	
	public Hotel(String hotelName)
	{
		this.hotelName = hotelName;
	}
	
	public String getHotelName()
	{
		return hotelName;
	}
	
	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}
}

public class Mainclass2
{
	public static void main(String[] args)
	{
       Vector<Hotel> a1 = new Vector<Hotel>();
       
       Hotel h1 = new Hotel("hotel1");
       Hotel h2 = new Hotel("hotel2");
       Hotel h3 = new Hotel("hotel3");
       
       //insert-Object-Reference
       a1.add(h1);
       a1.add(h2);
       
       //insert-Object-Reference at specified INDEX
       a1.add(0,h3);
       
       for (int i = 0; i < a1.size(); i++)
       {
		  System.out.println(a1.get(i).getHotelName());
	   }
       
       System.out.println("");
       //Read-Print-Object-Value
       System.out.println(a1.get(0).getHotelName());
       
       //Read-Update-Object
       a1.get(0).setHotelName("NEW-HOTEL");
          
       //Read-Print-Object-Value
       System.out.println(a1.get(0).getHotelName());
       
       
       boolean b1 =a1.contains(h3);
       System.out.println(b1);
       
       //Delete-Object
       a1.remove(0);
       
       b1 =a1.contains(h3);
       System.out.println(b1);
      
       
       //Read-Print-Object-Value
       System.out.println(a1.get(0).getHotelName());
	}
}










