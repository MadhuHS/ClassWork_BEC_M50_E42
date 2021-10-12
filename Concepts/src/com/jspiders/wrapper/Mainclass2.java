package com.jspiders.wrapper;

class Demo extends Object
{
	public void show()
	{
		System.out.println("this is show() of Demo");
	}
}

interface Run
{
	public void display();
}

public class Mainclass2 
{
	public static void test(Object n1)
	{
		System.out.println("n1 : "+n1);
	}
	
	public static void main(String[] args) 
	{
	   System.out.println("Program starts...");	
	     
	   Integer i1 = 20;
	   test(i1);
	   
	   Double d1 = 2.91;
	   test(d1);
	   
	   boolean b1 = true;
	   test(b1);
	   
	   String s1 = "hello";
	   test(s1);
	   
	   Demo ref1 = new Demo();
	   test(ref1);
	   
	   Run r1 = null;
	   test(r1);
	   
	   test(1000);
	   test(2.6);
	   test("jspiders");
	   test(true);
	   
	   System.out.println("Program ends...");	
	}
}




