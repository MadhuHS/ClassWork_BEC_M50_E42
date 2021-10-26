package com.alpha.services;

import com.alpha.db.RepositoryManager;
import com.alpha.db.UserRepository;
import com.alpha.entities.User;
import com.alpha.utils.Utilities;

public class UserServiceImpl implements UserService 
{
	UserRepository userRepo;
	RepositoryManager repoMgr = new RepositoryManager();
	
	Utilities utils = new Utilities();
	User usr;
	
	@Override
	public void signup(User usr)
	{
		userRepo = (UserRepository)repoMgr.getRepository("userrepo");
		System.out.println("UserServiceImpl-signup() executed");
		userRepo.insertUser(usr);//Save user data to db
	}

	@Override
	public void login(String email, String password)
	{
		System.out.println("UserServiceImpl-login() executed");	
		
		userRepo = (UserRepository)repoMgr.getRepository("userrepo");
		usr = userRepo.selectUser(email, password);
		
		System.out.println(usr.getName() + " Welcome to ALPHA HOTELS");
	}
}





