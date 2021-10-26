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

		switch (choice)
		{
		case 1:
			System.out.println("signup selected");
			SignupPage.userSignup();
			break;
		case 2:
			System.out.println("login selected");
			LoginPage.userLogin();
			break;
		default:
			System.out.println("exit");
		}
	}
	public static void main(String[] args) {
		menu();
	}
}
