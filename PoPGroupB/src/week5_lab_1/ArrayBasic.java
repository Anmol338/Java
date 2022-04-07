package week5_lab_1;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		final int max = 5; // final -> read only variable
		int sum = 0, avg = 0;
		int nums[] = new int[5]; // declare and initialize

		// read values
		for (int i = 0; i < max; i++) {
			System.out.println("Enter value");
			nums[i] = Integer.parseInt(new Scanner(System.in).nextLine());
		}

		// Calculate sum
		for (int i = 0; i < max; i++) {
			sum += nums[i];
		}
		
		//Calculate average
		avg=sum/max;

		// Display value
		for (int i = 0; i < max; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("Sum is : "+sum);
		System.out.println("Average is : "+avg);
	}
}
