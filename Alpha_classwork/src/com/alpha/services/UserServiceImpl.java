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
	
	@Override
	public void signup(User usr)
	{
		userRepo = (UserRepository)repoMgr.getRepository("userrepo");
		System.out.println("UserServiceImpl-signup() executed");
		
		//BL
		
		boolean b1 = utils.verifyName(usr.getName());
		boolean b2 = utils.verifyEmailFormat(usr.getEmail());
		boolean b3 = utils.verifyPassword(usr.getPassword());
		
		String pwd = usr.getPassword();
		
		if(b1 == true && b2 == true && b3 == true)
		{
			userRepo.insertUser(usr);//Save user data to db
		}
	}

	@Override
	public void login(String email, String password)
	{
		System.out.println("UserServiceImpl-login() executed");	
		userRepo.selectUser(email, password);
	}

}
