package com.jspiders.pkg4;

public class Delta 
{
	public    int    v1 = 913;
	protected double v2 = 9.23;
	          long   v3 = 19199929192l;
	private   String v4 = "jspiders";        
	
	public void test1()
	{
		System.out.println("this is public-test1() of Delta");
		System.out.println(v4);
	}
	
	protected void test2()
	{
		System.out.println("this is protected-test2() of Delta");
		System.out.println(v4);
	}
	
	void test3()
	{
		System.out.println("this is pkg-level-test3() of Delta");
		System.out.println(v4);
	}
	
	
	private void test4()
	{
		System.out.println("this is private-test4() of Delta");
		System.out.println(v4);
	}
}
