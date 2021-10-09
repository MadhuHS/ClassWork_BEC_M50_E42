package com.jspiders.exceptions;

class Sample
{
   public static int test(int n1,int n2)
   {
	  System.out.println("test() starts...");
	  
	  int res = 0;
	  
	  try
	  {
	     res = n1 / n2;
	  }
	  catch(ArithmeticException ae)
	  {
		 System.out.println("ArithmeticException handled"); 
		 System.out.println("NUMBER CANNOT BE DIVIDED BY ZERO");
	  }
	  
	  System.out.println("test() ends...");
	  
	  return res;
   }
}

public class Mainclass 
{
	public static void main(String[] args)
	{	
      System.out.println("main() starts...");
      
      int res = Sample.test(50,0);
      
      System.out.println("res : "+res);
      
      System.out.println("main() ends...");
	}
}







