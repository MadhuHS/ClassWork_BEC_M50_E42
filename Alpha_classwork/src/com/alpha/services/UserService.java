package com.alpha.services;

import com.alpha.entities.User;

public interface UserService
{
	public void signup(User usr);
	public void login(String email,String password);
}
