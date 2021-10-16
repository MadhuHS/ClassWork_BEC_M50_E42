package com.jspiders.arrays;

public class Mainclass
{
	public static void main(String[] args)
	{
	   //Array declration Syntax : dataType[] arrayName;
       int[] a1;
       
       //Array creation Syntax : arrayName = new datatype[]length;
       a1 = new int[7];
       
       //Array initlization Syntax : dataType[] arrayName;
       a1[2] = 110;
       a1[5] = 125;
       
       //Array utilization
       int res = a1[2] / 5;
       System.out.println("res : "+res);
      
       System.out.println("Array element at index 5 : "+a1[5]);
	}
}
