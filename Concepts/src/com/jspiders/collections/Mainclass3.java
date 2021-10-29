package com.jspiders.collections;

import java.util.LinkedHashSet;

public class Mainclass3
{
	public static void main(String[] args)
	{
       LinkedHashSet<Integer> hs1 = new LinkedHashSet<Integer>();
       
       //insert
       hs1.add(10);
       hs1.add(null);
       hs1.add(20);
       hs1.add(30);
       hs1.add(null);
       hs1.add(10);
       hs1.add(40);
       
       //view all elements in collection
       System.out.println(hs1);
              
	}
}
