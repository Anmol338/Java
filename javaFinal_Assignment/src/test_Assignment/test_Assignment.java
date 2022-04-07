package test_Assignment;

import java.util.Scanner;

import Library.library;

public class test_Assignment {

	public static void main(String[] args) {
		int age;
		String name, contact;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name: ");
		name = sc.nextLine();

		System.out.println("Enter your age: ");
		age = sc.nextInt();

		System.out.println("Enter your contact: ");
		contact = new Scanner(System.in).nextLine();

		library lib = new library(age, name, contact);
		lib.Connection();
	}

}
