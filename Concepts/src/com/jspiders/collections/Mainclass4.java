package com.jspiders.collections;

import java.util.HashSet;

class User extends Object
{
	private int uid;
	private String name;

	public User(int uid, String name) {
		this.setUid(uid);
		this.setName(name);
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return uid;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (obj.hashCode() == this.uid) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	@Override
	public String toString() {
		return "uid : " + uid + " name : " + name;
	}
}

public class Mainclass4 
{
	public static void main(String[] args)
	{
		HashSet<User> hs1 = new HashSet<User>();

		User us1 = new User(1, "USER1");
		User us2 = new User(2, "USER2");
		User us3 = new User(1, "USER3");
		User us4 = new User(3, "USER4");

		hs1.add(us1);
		hs1.add(us2);
		hs1.add(us3);
		hs1.add(us4);

		// view all elements in collection
		System.out.println(hs1);
	}
}




