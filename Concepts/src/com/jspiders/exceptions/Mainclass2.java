package com.jspiders.exceptions;

class Sample2
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
	  catch(ArithmeticException ae)
	  {
		 System.out.println("ArithmeticException handled"); 
		 System.out.println("NUMBER CANNOT BE DIVIDED BY ZERO");
	  }
	  catch(ArrayIndexOutOfBoundsException ae)
	  {
		 System.out.println("ArrayIndexOutOfBoundsException handled"); 
		 System.out.println("INVALID INDEX");
	  }
	  
	  System.out.println("test() ends...");
	  
	  return res;
   }
}

class Mainclass2
{
	public static void main(String[] args)
	{	
      System.out.println("main() starts...");
      
      int res = Sample2.test(50,10);
      
      System.out.println("res : "+res);
      
      System.out.println("main() ends...");
	}
}