package com.jspiders.exceptions;

class Sample4 
{
	public static int test(int n1, int n2)throws InterruptedException
	{
		System.out.println("test() starts...");

		int res = 0;

		Thread.sleep(n1);

		System.out.println("test() ends...");

		return res;
	}
}

class Mainclass4
{
	public static void main(String[] args)
	{
		System.out.println("main() starts...");
        
		try
		{
		int res = Sample4.test(50, 0);
		System.out.println("res : " + res);
		}
		catch (Exception e)
		{
			System.out.println("Exception handled");
			e.printStackTrace();
		}

		System.out.println("main() ends...");
	}
}





