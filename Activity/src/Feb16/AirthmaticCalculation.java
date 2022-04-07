package Feb16;

import java.util.Scanner;

public class AirthmaticCalculation {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in); // new -> Memory allocation and Scanner() ->Initializer

				int num1; // Instant Variable
				int num2; // Instant Variable
				int sum,diff,pro,div; // Instant Variable

				//Input
				System.out.println("Enter the first number:");
				num1 = sc.nextInt();
				
				System.out.println("Enter the second number:");
				num2 = sc.nextInt();
				
				//Addition
				sum=num1+num2;
				
				//Difference
				diff=num1-num2;
				
				//Product
				pro=num1*num2;
				
				//Division
				div=num1/num2;
				
				//Output
				System.out.println("The sum of "+num1+" + "+num2+" is "+sum+".");
				System.out.println("The difference of "+num1+" - "+num2+" is "+diff+".");
				System.out.println("The product of "+num1+" * "+num2+" is "+pro+".");
				System.out.println("The quotation of "+num1+" / "+num2+" is "+div+".");
				
			}

}
