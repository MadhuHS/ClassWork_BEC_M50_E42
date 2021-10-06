package com.jspiders.pkg5;

import com.jspiders.pkg4.Delta;

public class Mainclass extends Delta
{
	public static void main(String[] args)
	{
       Delta d1 = new Delta();//create object of Superclass
       
       System.out.println(d1.v1);//public-non-static-dm
       d1.test1();//public-non-static-FM
       
       Mainclass m1 = new Mainclass();//create object of Subclass
       
       System.out.println(m1.v2);//protected-non-static-dm
	   m1.test2();//protected-non-static-FM	   
	}
}





