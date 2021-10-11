package com.jspiders.exceptions;

class Sample3
{
   public static int test(int n1,int n2)
   {
	  System.out.println("test() starts...");
	  
	  int res = 0;
	  int[] a1 = {30,10,20,70};//---> [30|10|20|70] ub=3 lb=0
	  
	  try
	  {
	     res = n1 / n2;
	     System.out.println("array element at index "+res+" : "+a1[res]);
	     
	  }
	  catch(Exception e)
	  {
		 System.out.println("Exception handled");
		 e.printStackTrace();
	  }
	  finally
	  {
		  System.out.println("finally block executed");
	  }
	
	  System.out.println("test() ends...");
	  
	  return res;
   }
}

class Mainclass3
{
	public static void main(String[] args)
	{	
      System.out.println("main() starts...");
      
      int res = Sample3.test(50,0);
      
      System.out.println("res : "+res);
      
      System.out.println("main() ends...");
	}
}