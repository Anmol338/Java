package week2_2; //Package include

import java.util.Scanner; //Import Scanner

// Student Information
public class Student2 {

	public static void main(String[] args) {
		//Declare variables
		String title,fullname,grade;
		char section;
		int id,eng,math,science;
		
		//Vale Assign
		title="Student Info";
		System.out.print("Enter the id of the Student:- ");
		id = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter the fullname of student:- ");
		fullname = new Scanner(System.in).nextLine();
		System.out.print("Enter the grade of the Student:- ");
		grade= new Scanner(System.in).nextLine();
		System.out.print("Enter the section of the Student:- ");
		section= new Scanner(System.in).nextLine().charAt(0);
		System.out.print("Enter the obtained marks of english:- ");
		eng= Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter the obtained marks of math:- ");
		math= Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter the obtained marks of science:- ");
		science= Integer.parseInt(new Scanner(System.in).nextLine());
		
		//Access Value
		System.out.println("\n\n\n\n-----------------Student Infromation--------------------------");
		System.out.println(title);
		System.out.println("Name = "+fullname);
		System.out.println("Grade = "+grade);
		System.out.println("Section = "+section);
		System.out.println("Id = "+id);
		System.out.println("English = "+eng);
		System.out.println("Math = "+math);
		System.out.println("Science = "+science);
		
	}

}
