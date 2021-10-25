package com.alpha.frontend;

import java.util.Scanner;

import com.alpha.entities.User;
import com.alpha.services.UserServiceImpl;
import com.alpha.utils.Utilities;

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
		
		Utilities util = new Utilities();
		
		User usr = new User();//Entity class
		
		System.out.println("Enter your name without Special chars and Numbers: ");
		String usrName   = scn.next();
		boolean validUsrName = util.verifyName(usrName);
		
		
		System.out.println("Enter your Email ID : ");
		String usrEmail  = scn.next();
		boolean validUsrEmail = util.verifyEmailFormat(usrEmail);
		
		System.out.println("Enter your password min length 8 chars and atleast 1 spl char : ");
		String usrPassword = scn.next();
		boolean validUsrPassword = util.verifyPassword(usrPassword);
		
		System.out.println("Enter your mobile no : ");
		String usrMob = scn.next();
		
		System.out.println("Enter your Address : ");
		String usrAddrss = scn.next();
		
		System.out.println("Enter role : ");
		String usrRole = scn.next();
		
		if(validUsrName == true && validUsrEmail == true && validUsrPassword == true)
		{
		  usr.setUid(0);
		  usr.setName(usrName);
		  usr.setEmail(usrEmail);
		  usr.setPassword(usrPassword);
		  usr.setMob(usrMob);
		  usr.setAddress(usrAddrss);
		  usr.setRole(usrRole);
		
		  usrimpl.signup(usr);
		}
		
		else
		{
			if(validUsrName ==false)
			{
			  System.out.println("INAVLID USER NAME name should conatin only Alphabets from A-Z or a-z");
		      System.out.println("USERName : "+usrName);
			}
			else if(validUsrEmail == false)
			{
		      System.out.println("INVALID EMAIL ID please check format");
		      System.out.println("Email : "+usrEmail);
			}
			else if(validUsrPassword == false)
			{
			  System.out.println("PASSWORD should be of 8 chars with one SPL Char");
			  System.out.println("Password : "+usrPassword);
			}
			else
			{
				System.out.println("MULTIPLE DATA FORMAT IS INVALID");
			}
		}
	}

	public static void userLogin() {
		System.out.println("userLogin() executed");
		usrimpl.login("email", "password");
	}

	public static void main(String[] args) {
		menu();
	}
}
