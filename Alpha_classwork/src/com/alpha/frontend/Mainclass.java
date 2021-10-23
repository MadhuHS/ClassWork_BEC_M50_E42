package com.alpha.frontend;

import java.util.Scanner;

import com.alpha.entities.User;
import com.alpha.services.UserServiceImpl;

public class Mainclass
{
	static Scanner scn = new Scanner(System.in);
	static UserServiceImpl usrimpl = new UserServiceImpl();

	public static void menu() {
		System.out.println("1. Signup");
		System.out.println("2. Login");
		System.out.println("Any other key for exit");

		int choice = 0;

		choice = scn.nextInt();

		switch (choice) {
		case 1:
			System.out.println("signup selected");
			userSignup();
			break;
		case 2:
			System.out.println("login selected");
			userLogin();
			break;
		default:
			System.out.println("exit");
		}
	}

	public static void userSignup()
	{
		System.out.println("userSignup() executed");
		
		User usr = new User();//Entity class
		
		System.out.println("Enter your name : ");
		String usrName   = scn.next();
		
		System.out.println("Enter your Email ID : ");
		String usrEmail  = scn.next();
		
		System.out.println("Enter your password : ");
		String usrPassword = scn.next();
		
		System.out.println("Enter your mobile no : ");
		String usrMob = scn.next();
		
		System.out.println("Enter your Address : ");
		String usrAddrss = scn.next();
		
		System.out.println("Enter role : ");
		String usrRole = scn.next();
		
		usr.setUid(0);
		usr.setName(usrName);
		usr.setEmail(usrEmail);
		usr.setPassword(usrPassword);
		usr.setMob(usrMob);
		usr.setAddress(usrAddrss);
		usr.setRole(usrRole);
		
		usrimpl.signup(usr);
	}

	public static void userLogin() {
		System.out.println("userLogin() executed");
		usrimpl.login("email", "password");
	}

	public static void main(String[] args) {
		menu();
	}
}
