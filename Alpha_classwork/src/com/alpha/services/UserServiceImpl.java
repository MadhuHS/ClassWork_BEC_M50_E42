package com.alpha.services;

import com.alpha.db.RepositoryManager;
import com.alpha.db.UserRepository;
import com.alpha.entities.User;

public class UserServiceImpl implements UserService 
{
	UserRepository userRepo;
	RepositoryManager repoMgr = new RepositoryManager();
	
	@Override
	public void signup(User usr)
	{
		userRepo = (UserRepository)repoMgr.getRepository("userrepo");
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
