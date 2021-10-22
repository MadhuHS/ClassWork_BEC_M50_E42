package com.alpha.entities;

//Entity
public class User
{
	private int    uid;
	private String name;
	private String email;
	private String password;
	private String mob;
	private String address;
	private String role;

	public User()
	{

	}

	public User(int uid, String name, String email, String password, 
			    String mob, String address, String role) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mob = mob;
		this.address = address;
		this.role = role;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
}