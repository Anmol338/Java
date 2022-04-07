//Package Include
package homeWork;

//Import Scanner 
import java.util.Scanner;

//ArrayHomework class
public class ArrayHomework {

	// Main method
	public static void main(String[] args) {
		// Declaration
		final int max = 5; // Read only integer
		int sum = 0;
		int avg = 0;
		int temp;

		// Array declaration
		int nums[] = new int[5];

		// Input and assigned the value in array
		for (int i = 0; i < max; i++) {
			System.out.println("Enter the number in a[" + i + "] = ");
			nums[i] = Integer.parseInt(new Scanner(System.in).nextLine());
		}

		// Adding the values of array
		for (int i = 0; i < max; i++) {
			sum += nums[i];
		}

		// Average
		avg = sum / max;

		// Output the sum and average
		System.out.println("Sum of array is " + sum);
		System.out.println("Average of array is " + avg);

		// Ascending array in ascending order
		for (int i = 0; i < max; i++) {
			for (int j = i + 1; j < max; j++) {
				if (nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		// Output the Min value
		System.out.println("The minium value in array is " + nums[0]);

		// Output the max value
		System.out.println("The maximum value in array is " + nums[max - 1]);

		// Output value after Ascending
		System.out.println("After Ascending");
		for (int i = 0; i < max; i++) {
			System.out.println(nums[i]);
		}

		// Descending array in decending order
		for (int i = 0; i < max; i++) {
			for (int j = i + 1; j < max; j++) {
				if (nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}

		// Output value after Descending
		System.out.println("After Descending");
		for (int i = 0; i < max; i++) {
			System.out.println(nums[i]);
		}

		System.out.println("Enter the numeric value you want to search in array : ");
		int hold= Integer.parseInt(new Scanner(System.in).nextLine());
		int counter = 0;
		for (int i = 0; i < max; i++) {
			if(nums[i]==hold) {
				counter++;
			}
		}
		
		if(counter==1) {
			System.out.println(hold+" is available in array.");
		}else {
			System.out.println(hold+" is not available in array.");
		}

	}

}
