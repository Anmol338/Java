package March_2;

import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// Variables Declaration
		int sum = 0, avg = 0;

		// Array List
		ArrayList arr;
		arr = new ArrayList(); // Memory allocation and Initialize

		arr.add(100); // Adding value to the array
		arr.add(10); // Adding value to the array
		arr.add(5); // Adding value to the array
		arr.add(95); // Adding value to the array
		arr.add(50); // Adding value to the array

		// Calculating the sum of array
		for (int i = 0; i < arr.size(); i++) {
			sum += (int) (arr.get(i));
		}
		System.out.println("The sum of array is " + sum + ".");

		// Calculating the average of array
		avg = sum / arr.size();
		System.out.println("The average of array is " + avg + ".");

		// Finding max and min value in array
		int max = (int) arr.get(0);
		int min = (int) arr.get(0);
		
		//Max value
		for(int i=0;i<arr.size();i++) {
			if((int)arr.get(i)>max) {
				max = (int)arr.get(i);
			}
		}
		System.out.println("The max value in array is "+max+".");
		
		
		//Min value
		for(int i=0;i<arr.size();i++) {
			if((int)arr.get(i)<min) {
				min = (int)arr.get(i);
			}
		}
		System.out.println("The min value in array is "+min+".");
	}

}
