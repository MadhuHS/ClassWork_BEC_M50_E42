package com.jspiders.exceptions;

class Sample5
{
	public static void test(int n1)
	{
		System.out.println("test() starts...");
		
		if(n1 >= 1 && n1<=10)
		{
		  System.out.println("Valid input");
		}
		else
		{
		  String errorMsg = n1+" is out of range";
		  
		  IllegalArgumentException ie = new IllegalArgumentException(errorMsg);
		  throw ie;
		}
		System.out.println("test() ends...");

		return;
	}
}

class Mainclass5
{
	public static void main(String[] args)
	{
		System.out.println("main() starts...");
        
		Sample5.test(50);

		System.out.println("main() ends...");
	}
}





