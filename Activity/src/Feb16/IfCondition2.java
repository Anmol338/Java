package Feb16;

import java.util.Scanner;

public class IfCondition2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the n: ");
		int speed = sc.nextInt();

		if (speed < 2015) {
			System.out.println("Ancient History");
		} else {
			System.out.println("Modern");
		}

	}

}
