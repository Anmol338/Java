//Package Include
package week2_2;

//Scanner Import
import java.util.Scanner;


//Class
public class Calculator {

	//Main Class
	public static void main(String[] args) {
		// Variable Declare
		int fNum, sNum, sum, diff, pro, div, rem, power;

		// Input section
		System.out.print("Enter the first number: ");
		fNum = Integer.parseInt(new Scanner(System.in).nextLine());
		System.out.print("Enter thesecond number: ");
		sNum = Integer.parseInt(new Scanner(System.in).nextLine());

		// Calculate
		sum = fNum + sNum;
		diff = fNum - sNum;
		pro = fNum * sNum;
		div = fNum / sNum;
		rem = fNum % sNum;
		power = (int) Math.pow(fNum, sNum);

		// Output
		System.out.println("The sum is" + sum);
		System.out.println("The diff is" + diff);
		System.out.println("The product is" + pro);
		System.out.println("The div is" + div);
		System.out.println("The remainder is" + rem);
		System.out.println("The power is" + power);
	}

}
