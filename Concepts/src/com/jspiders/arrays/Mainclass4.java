package com.jspiders.arrays;

class User
{
	int uid;
	String name;
	long   mob;
	
	public User()
	{
		
	}

	public User(int uid, String name, long mob) {
		super();
		this.uid = uid;
		this.name = name;
		this.mob = mob;
	}
	
	public void showUser()
	{
		System.out.println("Name : "+name);
		System.out.println("Mob  : "+mob);
	}	
}

public class Mainclass4
{
	public static void main(String[] args)
	{
       User[] users = new User[3];
       
       users[0] =  new User(1234,"User1",9987661712l);
       users[1] =  new User(1212,"User2",7817281929l); 
       users[2] =  new User(1291,"User3",5181927192l); 
       
  
       System.out.println(users);
       
       for(int index=0; index<=users.length-1; index++)
       {
          users[index].showUser();
       }
       
	}
}










