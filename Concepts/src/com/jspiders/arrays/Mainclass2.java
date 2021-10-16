package com.jspiders.arrays;

public class Mainclass2
{
	public static void main(String[] args)
	{
	   int[] a1 = new int[7];
	   
	   a1[0] = 100;
	   a1[1] = 105;
	   a1[2] = 110;
	   a1[3] = 115;
	   a1[4] = 120;
	   a1[5] = 125;
	   a1[6] = 130;
	   
	   System.out.println(a1[0]);//read and print 1 element
	   
	   System.out.println();
	   
	   //read and print ALL elements
	   for(int index = 0; index<a1.length; index++)
	   {
          System.out.println(a1[index]);
	   }
	   
	   System.out.println();
	   
	   //read all numbers and print Only even numbers
	   for(int index = 0; index<a1.length; index++)
	   {
		   if(a1[index] % 2 == 0)
		   {
		     System.out.println(a1[index]);
		   }
	   }

	}
}







