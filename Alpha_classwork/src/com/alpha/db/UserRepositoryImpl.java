package com.alpha.db;

import com.alpha.entities.User;

public class UserRepositoryImpl implements UserRepository 
{
	@Override
	public void insertUser(User usr) {
		
		System.out.println("insertUser() executed");

	}

	@Override
	public void selectUser(String email, String password) {
		System.out.println("selectUser() executed");

	}

}
