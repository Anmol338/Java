package Feb16;

import java.util.Scanner;

public class IfCondition3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("The number is one.");
		} else if(num==2){
			System.out.println("The number is two.");
		}else if(num==3) {
			System.out.println("The number is three.");
		}else {
			System.out.println("The number is something else than 1, 2, or 3.");
		}

	}
	
}
