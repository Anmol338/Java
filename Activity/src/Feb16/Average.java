package Feb16;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // new -> Memory allocation and Scanner() ->Initializer

		int num1; // Instant Variable
		int num2; // Instant Variable
		int num3; // Instant Variable
		int avg; // Instant Variable

		//Input
		System.out.println("Enter the first number:");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number:");
		num2 = sc.nextInt();
		
		System.out.println("Enter the third number:");
		num3 = sc.nextInt();
		
		//Addition
		avg=(num1+num2+num3)/3;
		
		//Output
		System.out.println("The average of "+num1+", "+num2+", "+num3+" is "+avg+".");

	}

}
