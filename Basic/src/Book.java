import java.util.Scanner;
public class Book {
	private static Scanner anmol;

	public static void main(String[] args) {
		anmol = new Scanner(System.in);
		System.out.println("Enter first number:");
		int first=anmol.nextInt();
		System.out.println("Enter second number:");
		int second=anmol.nextInt();
		int sum=first+second;
		System.out.printf("The sum of %d and %d is %d.",first,second,sum);
	}
}
