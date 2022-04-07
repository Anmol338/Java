package Week2;
//Step-1 import library
import java.util.Scanner; //Scanner class is responsible to read value from keyboard
//Read value from Keyboard
//Display value to screen

public class BasicIO {

	public static void main(String[] args) {
		//Read value from keyboard
		//Display value on screen
		
		String str1;
		System.out.print("Enter your name please: ");
//		str1= read value from keyboard
		//Step-2 read value from keyboard
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.nextLine();
		System.out.print("Welcome "+str1);
	}

}
