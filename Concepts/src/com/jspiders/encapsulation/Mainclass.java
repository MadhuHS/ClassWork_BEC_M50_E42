package com.jspiders.encapsulation;

//Entity
class User 
{
	private int uid;//write
	private String name;//write read
	private String email;//write read
	private String pwd;//write 
	private long mob;//write read
	
	public User()
	{
		
	}

	public User(String name, String email, String pwd, long mob)
	{
		this.name = name;
		this.email = email;
		this.pwd = pwd;
		this.mob = mob;
	}
	
	public void setPwd(String pwd)
	{
		this.pwd = pwd;//intilize or re-intilize
	}
	
	public void setUid(int uid)
	{
		this.uid = uid;//intilize or re-intilize
	}
	
	public void setEmail(String email)//write
	{
		this.email = email;//intilize or re-intilize
	}
	
	public String getEmail()//read
	{
		return email;
	}
	
	public String getName()//read
	{
		return name;
	}
	
	public long getMob()//read
	{
		return mob;
	}
	
	

}

//Service
class UserService 
{
	User userDto;
	
    public void signup(String name, String email, 
    		           String pwd, long mob)
    {
    	
      userDto = new User(name, email, pwd, mob);
      userDto.setUid(100);
      System.out.println("User created");
    }
    
    public void showProfile()
    {
    	System.out.println(userDto.getName());
    	System.out.println(userDto.getEmail());   	
    }
    
    public void updatePassword(String newPassword)
    {
    	userDto.setPwd(newPassword);
    }
}

public class Mainclass 
{
	public static void main(String[] args)
	{
       UserService us = new UserService();
       
       us.signup("User1", "user1@gmail.com", "1234", 9898987723l);
       
       
       us.showProfile();
	}
}




