package com.jspiders.pkg4;

public class Sample extends Delta
{
	public static void main(String[] args) 
	{
		Delta dt = new Delta();

		System.out.println(dt.v1);// public-non-static-dm
		dt.test1();// public-non-static-FM
		
		System.out.println(dt.v2);// protected-non-static-dm
		dt.test2();// protected-non-static-FM
		
		System.out.println(dt.v3);// pkg-level-non-static-dm
		dt.test3();// pkg-level-non-static-FM	
	}
	
}
