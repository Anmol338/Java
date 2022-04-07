package CUI;

import java.util.Scanner;

import Library.library;

public class cui {

	public static void main(String[] args) {
		int age;
		String fname, lname, email, password, gender, address;

		System.out.println("------------------Registration Form--------------------\n\n");

		System.out.println("Enter your first name: ");
		fname = new Scanner(System.in).nextLine();
		System.out.println("Enter your last name: ");
		lname = new Scanner(System.in).nextLine();
		System.out.println("Enter your age: ");
		age = new Scanner(System.in).nextInt();
		System.out.println("Enter your email: ");
		email = new Scanner(System.in).nextLine();
		System.out.println("Enter your password: ");
		password = new Scanner(System.in).nextLine();
		System.out.println("Enter your gender (Male/Female/Others): ");
		gender = new Scanner(System.in).nextLine();
		System.out.println("Enter your address: ");
		address = new Scanner(System.in).nextLine();

		library lib = new library(age,fname,lname,email,password,gender,address);
		System.out.println(lib.toString());
		System.out.println(lib.getFname());
	}

}
