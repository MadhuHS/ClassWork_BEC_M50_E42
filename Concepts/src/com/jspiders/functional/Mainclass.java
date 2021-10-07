package com.jspiders.functional;

@FunctionalInterface
interface Run
{
	public void count(int n);
}

public class Mainclass 
{
	public static void main(String[] args)
	{
		//ascending
		Run r1 = (int n)->
		  {
		    System.out.println("asecnding order");
		  
		    for(int i=1; i<=n; i++)
		    {
			 System.out.println(i);
		    }
		 };
		 
		 //descending 
		 Run r2 = (int n)->
		 {
			 System.out.println("descending order");
			 
			for (int j = n; j >= 1; j--)
			{
			  System.out.println(j);	
			}
		 };
		 
		 r1.count(5);
		 r2.count(5);
	}
}











