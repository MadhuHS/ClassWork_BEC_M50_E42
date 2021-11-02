package com.jspiders.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Hotel extends Object implements Comparable<Hotel> {
	private String hotelName;
	private double hotelCost;

	public Hotel(String hotelName, double hotelCost) {
		this.hotelName = hotelName;
		this.setHotelCost(hotelCost);
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getHotelCost() {
		return hotelCost;
	}

	public void setHotelCost(double hotelCost) {
		this.hotelCost = hotelCost;
	}

	@Override
	public String toString() {
		return "name : " + hotelName + " cost : " + hotelCost;
	}

	@Override
	public int compareTo(Hotel htl) {
		String name1 = htl.getHotelName();
		String name2 = this.getHotelName();

		int res = name2.compareTo(name1);

		return res;
	}
}

public class Mainclass2 {
	
	public static void treeSetDemo()
	{
		TreeSet<Hotel> ts1 = new TreeSet<Hotel>();

		Hotel h1 = new Hotel("AAA", 3000.0);
		Hotel h2 = new Hotel("DDD", 1000.0);
		Hotel h3 = new Hotel("AAA", 4000.0);
		Hotel h4 = new Hotel("BBB", 5000.0);
		Hotel h5 = new Hotel("EEE", 1000.0);

		ts1.add(h1);// add()--->h1.compareTo
		ts1.add(h2);// add()--->h1.compareTo
		ts1.add(h3);// add()--->h1.compareTo
		ts1.add(h4);// add()--->h1.compareTo
		ts1.add(h5);// add()--->h1.compareTo

		System.out.println(ts1);
	}
	
	public static void treeSetComparatorDemo()
	{
		Hotel h1 = new Hotel("AAA", 3000.0);
		Hotel h2 = new Hotel("DDD", 1000.0);
		Hotel h3 = new Hotel("AAA", 4000.0);
		Hotel h4 = new Hotel("BBB", 5000.0);
		Hotel h5 = new Hotel("EEE", 1000.0);
		
		Comparator<Hotel> comp = (Hotel ht1, Hotel ht2) -> {
			double cs1 = ht1.getHotelCost();
			double cs2 = ht2.getHotelCost();

			int diff = (int) (cs1 - cs2);

			return diff;
		};

		TreeSet<Hotel> ts2 = new TreeSet<Hotel>(comp);
		ts2.add(h1);// add()--->h1.compareTo
		ts2.add(h2);// add()--->h1.compareTo
		ts2.add(h3);// add()--->h1.compareTo
		ts2.add(h4);// add()--->h1.compareTo
		ts2.add(h5);// add()--->h1.compareTo
		
		System.out.println(ts2);
	}
	
	
	public static void priorityQueueDemo()
	{
		Hotel h1 = new Hotel("AAA", 3000.0);
		Hotel h2 = new Hotel("DDD", 1000.0);
		Hotel h3 = new Hotel("AAA", 4000.0);
		Hotel h4 = new Hotel("BBB", 5000.0);
		Hotel h5 = new Hotel("EEE", 1000.0);
		
		
		PriorityQueue<Hotel> pq1 = new PriorityQueue<Hotel>();
		pq1.add(h1);// add()--->h1.compareTo
		pq1.add(h2);// add()--->h1.compareTo
		pq1.add(h3);// add()--->h1.compareTo
		pq1.add(h4);// add()--->h1.compareTo
		pq1.add(h5);// add()--->h1.compareTo
		
		System.out.println("size : "+pq1.size());
		while(pq1.size() != 0)
		{
		  System.out.println(pq1.poll());
		}
		System.out.println("size : "+pq1.size());
	}
	
	public static void priorityQueueComparatorDemo()
	{

		Hotel h1 = new Hotel("AAA", 3000.0);
		Hotel h2 = new Hotel("DDD", 1000.0);
		Hotel h3 = new Hotel("AAA", 4000.0);
		Hotel h4 = new Hotel("BBB", 5000.0);
		Hotel h5 = new Hotel("EEE", 1000.0);
		

		Comparator<Hotel> comp = (Hotel ht1, Hotel ht2) -> {
			double cs1 = ht1.getHotelCost();
			double cs2 = ht2.getHotelCost();

			int diff = (int) (cs1 - cs2);

			return diff;
		};
		
		PriorityQueue<Hotel> pq2 = new PriorityQueue<Hotel>(comp);
		pq2.add(h1);// add()--->h1.compareTo
		pq2.add(h2);// add()--->h1.compareTo
		pq2.add(h3);// add()--->h1.compareTo
		pq2.add(h4);// add()--->h1.compareTo
		pq2.add(h5);// add()--->h1.compareTo
		
		System.out.println("size : "+pq2.size());
		while(pq2.size() != 0)
		{
		  System.out.println(pq2.poll());
		}
		System.out.println("size : "+pq2.size());
		
	}
		
	public static void main(String[] args)
	{	
	  treeSetDemo();
	  priorityQueueDemo();
	}
}






