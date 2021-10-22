package com.alpha.services;

import com.alpha.db.UserRepositoryImpl;
import com.alpha.entities.User;

public class UserServiceImpl implements UserService 
{
	UserRepositoryImpl userRepo = new UserRepositoryImpl();
	
	@Override
	public void signup(User usr)
	{
		System.out.println("UserServiceImpl-signup() executed");
		userRepo.insertUser(usr);
	}

	@Override
	public void login(String email, String password)
	{
		System.out.println("UserServiceImpl-login() executed");	
		userRepo.selectUser(email, password);
	}

}
