package com.alpha.db;

import com.alpha.entities.User;

public interface UserRepository extends Repository
{
	public void insertUser(User usr);
	public void selectUser(String email,String password);
}
