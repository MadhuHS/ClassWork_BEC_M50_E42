package com.jspiders.pkg2;

import com.jspiders.pkg1.Sample;

public class Demo
{
	public static void main(String[] args)
	{
       Sample.test1();
       
       Sample s1 = new Sample();
       
       s1.test2();
       
       com.jspiders.pkg3.Sample.test1();
       
       com.jspiders.pkg3.Sample s2 = new com.jspiders.pkg3.Sample();
	}
}
