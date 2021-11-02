package com.jspiders.collections;

import java.util.LinkedList;

public class Mainclass6
{
	public static void main(String[] args)
	{
	   LinkedList<Integer> lnk = new LinkedList<Integer>();
       
       //insert
       lnk.add(20);
       lnk.add(10);
       lnk.add(null);
       lnk.add(30);
       lnk.add(50);
       lnk.add(20);
       lnk.add(null);
       lnk.add(40);
       
       System.out.println(lnk.get(0));
       
       //view all elements in collection
       System.out.println(lnk);
              
	}
}
