package com.jspiders.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class Mainclass5
{
	public static void main(String[] args)
	{
       Comparator<Integer> ref = (Integer i1, Integer i2)->
    		                     {
    		                    	System.out.println("i1 : "+i1);
    		                    	System.out.println("i2 : "+i2);
    	                            int diff = i2 - i1;
    	                            System.out.println("diff : "+diff);
    	                            return diff;
    		                     };
		
	   TreeSet<Integer> ts1 = new TreeSet<Integer>(ref);
       
       //insert
       ts1.add(20);
       ts1.add(10);
       ts1.add(30);
       ts1.add(50);
       ts1.add(20);
       ts1.add(40);
       
       //view all elements in collection
       System.out.println(ts1);
              
	}
}
