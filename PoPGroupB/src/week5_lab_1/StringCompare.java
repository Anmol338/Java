package week5_lab_1;

import java.util.Scanner;

public class StringCompare {

	public static void main(String[] args) {
		System.out.println("Enter the first string : ");
		String str1 = new Scanner(System.in).nextLine();

		System.out.println("Enter the second string : ");
		String str2 = new Scanner(System.in).nextLine();
		
		int result = str1.compareToIgnoreCase(str2);
		
		if(result==-1) {
			System.out.println(str1+" and "+str2+" is not equal.");
		}else if(result==1) {
			System.out.println(str1+" and "+str2+" is not equal.");
		}else{
			System.out.println(str1+" and "+str2+" is equal.");
		}

	}

}
