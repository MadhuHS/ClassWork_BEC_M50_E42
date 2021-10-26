package com.alpha.frontend;

import java.util.Scanner;

import com.alpha.services.UserServiceImpl;

public class LoginPage
{
	static UserServiceImpl usrimpl = new UserServiceImpl();;
	
	public static void userLogin()
	{
		System.out.println("userLogin() executed");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your email");
		String usrEmail = scn.next();
		
		System.out.println("Enter your password");
		String usrPassword = scn.next();
		
		usrimpl.login(usrEmail,usrPassword);
	}

}
