package Student_Section;

import java.util.Scanner;

public class Student_Section {

	public static void main(String[] args) {
		int id;
		String name;
		double pop;
		double database;
		double networking;

		// Input Section
		System.out.println("Enter the student ID : ");
		id = Integer.parseInt(new Scanner(System.in).nextLine());

		System.out.println("Enter the name of the student : ");
		name = new Scanner(System.in).nextLine();

		System.out.println("Enter the marks obtained in pop : ");
		pop = Double.parseDouble(new Scanner(System.in).nextLine());

		System.out.println("Enter the marks obtained in pop : ");
		database = Double.parseDouble(new Scanner(System.in).nextLine());

		System.out.println("Enter the marks obtained in pop : ");
		networking = Double.parseDouble(new Scanner(System.in).nextLine());

		Student std = new Student(id, name, pop, database, networking);
		double total = std.getTotal();
		double avg = std.getAverage();
		String result = std.getResult();

		// Output
		System.out.println("Total Marks : " + total);
		System.out.println("Average Marks : " + avg);
		System.out.println("Result : " + result);

	}
}