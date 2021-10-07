package com.jspiders.functional;

@FunctionalInterface
interface Run2
{
	public double sum(double n1,double n2,double n3,double n4);
}

class Sample2
{
	public static void findAvg(Run2 ref)
	{
		double res = ref.sum(10, 20, 30, 40);
		double avg = res/4;
		
		System.out.println(avg);
	}
}

public class Mainclass2
{
	static Run2 ref = (double n1,double n2,double n3,double n4)->
	                  {
		               double res = n1 + n2 + n3 + n4;
		               return res;
	                  };
	
	public static void main(String[] args)
	{
		Sample2.findAvg(ref);
	}
}





