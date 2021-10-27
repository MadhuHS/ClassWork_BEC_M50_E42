package com.jspiders.collections;

import java.util.ArrayList;

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
       ArrayList<Hotel> a1 = new ArrayList<Hotel>();
       
       Hotel h1 = new Hotel("hotel1");
       Hotel h2 = new Hotel("hotel2");
       
       //insert-Object-Reference
       a1.add(h1);
       a1.add(h2);
       
       //Read-Print-Object-Value
       System.out.println(a1.get(0).getHotelName());
       
       //Read-Update-Object
       a1.get(0).setHotelName("NEW-HOTEL");
          
       //Read-Print-Object-Value
       System.out.println(a1.get(0).getHotelName());
       
       //Delete-Object
       a1.remove(0);
       
       //Read-Print-Object-Value
       System.out.println(a1.get(0).getHotelName());
	}
}










