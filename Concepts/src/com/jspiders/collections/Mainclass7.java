package com.jspiders.collections;

import java.util.HashMap;

public class Mainclass7
{
	public static void main(String[] args)
	{
	  HashMap<String,Long> contacts = new HashMap<String,Long>();
       
       //insert
	   contacts.put("AAA", 9876543210l); 
	   contacts.put("DDD", 6792989102l);
	   contacts.put("BBB", 9876543210l);
	   contacts.put(null, 76217271723l);
	   contacts.put("EEE", 9929391931l);
	   contacts.put("CCC", 8916271921l);
	   
	   //view all elements in collection
	   System.out.println(contacts);
	   
	   //search-SUCCESS
	   System.out.println(contacts.get("CCC"));
	   
	   //search-FAIL
	   System.out.println(contacts.get("ZZZ"));
	  
	   //update
	   contacts.put("AAA", 8102819871l);
         
       //view all elements in collection
	   System.out.println(contacts);
      
              
	}
}
