package com.jspiders.wrapper;

public class Mainclass 
{
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");	
	   
	   Integer i1 = 10;//Auto-boxing
	   System.out.println(i1);
	   
	   Double d1 = 82.1;//Auto-boxing
	   System.out.println(d1);
	   
	   int v1 = i1;//Auto-unboxing
	   System.out.println(v1);
	   
	   double v2 = d1;//Auto-unboxing
	   System.out.println(v2);
	   
	   Object obj  = i1;
	   Object obj2 = d1;
	   
	   Object obj3 = 1234;
	   System.out.println(obj3);
	   
	   Integer i2 = 10;
	   Integer i3 = 25; 
	   
	   int sum = i2 + i3;
	   System.out.println("sum : "+sum);
	   
	   System.out.println("Program ends...");	
	}
}




