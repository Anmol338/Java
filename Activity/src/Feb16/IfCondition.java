package Feb16;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your speed: ");
		int speed = sc.nextInt();

		if (speed > 100) {
			System.out.println("You are speeding beyound the limit. Please slow down your speed!!");
		} else {
			System.out.println("You are followig the traffic role. Thank You");
		}

	}

}
