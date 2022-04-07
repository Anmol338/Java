package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Complete {
	public static void main(String args[]) {
		System.out.println("Welcome to Your database");
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Enter you First Name");
			String f_name = keyboard.nextLine();
			System.out.println("Enter your Last Name");
			String l_name = keyboard.nextLine();
			System.out.println("Welcome" + " " + f_name + " " + l_name);

			System.out.println("Enter your Phone number");
			String phno = keyboard.nextLine();

			System.out.println("Enter your email id");
			String email = keyboard.nextLine();

			System.out.println("Enter your current city");
			String city = keyboard.nextLine();

			System.out.println("Enter you current State");
			String state = keyboard.nextLine();

			System.out.println("Enter you pin code");
			String pin = keyboard.nextLine();

			System.out.println("------------------------");
			System.out.println("Your Details are following.");

			System.out.println("Name :" + " " + f_name + " " + l_name);
			System.out.println("Phone :" + " " + phno);
			System.out.println("Email :" + " " + email);
			System.out.println("City :" + " " + city);
			System.out.println("State :" + " " + state);
			System.out.println("PIN code :" + " " + pin);

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/checking", "root", "");
			Statement stmt = con.createStatement();

			stmt.executeUpdate(
					"insert into empdetails(first_name,last_name,phone,email,city,state,pin)" + "values('"+f_name+"', '"+l_name+"', '"+phno+"', '"+email+"', '"+city+"', '"+state+"', '"+pin+"')");
			System.out.println("All Right , We got your entry");
			
		} catch (Exception e) {
			System.out.println("Connection timeout!!");
		}
	}
}