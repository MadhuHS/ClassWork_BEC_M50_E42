package com.jspiders.collections;

import java.util.ArrayList;

public class Mainclass
{
	public static void main(String[] args)
	{
       ArrayList<Integer> a1 = new ArrayList<Integer>();
       
       a1.add(25);
       a1.add(null);
       a1.add(25);
       a1.add(null);
       
       int res = 5 * a1.get(0); 
      
       System.out.println(res);
      
       System.out.println(a1.get(0));
       
       for (int index = 0; index < a1.size(); index++)
       {
		  System.out.println(a1.get(index));
	   }
	}
}
