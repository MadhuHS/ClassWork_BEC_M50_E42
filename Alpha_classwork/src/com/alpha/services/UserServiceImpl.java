package com.alpha.services;

import com.alpha.entities.User;

public class UserServiceImpl implements UserService 
{
	@Override
	public void signup(User usr)
	{
		System.out.println("UserServiceImpl-signup() executed");
	}

	@Override
	public void login(String email, String password)
	{
		System.out.println("UserServiceImpl-login() executed");	
	}

}
