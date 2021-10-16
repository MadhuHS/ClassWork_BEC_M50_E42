package com.jspiders.arrays;

public class Mainclass3
{
	public static void printArray(int[] ar1) 
	{
		// read and print ALL elements
		for (int index = 0; index < ar1.length; index++)
		{
			System.out.println(ar1[index]);
		}
		System.out.println();
	}

	public static void printEven(int[] ar2)
	{
		for (int index = 0; index < ar2.length; index++) 
		{
			if (ar2[index] % 2 == 0) 
			{
				System.out.println(ar2[index]);
			}
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int[] a1 = {100,105,110,115,120,125};
		printArray(a1);
		printEven(a1);

	}
}
