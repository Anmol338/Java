import java.util.Scanner;
public class Hello {
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Enter the First number:");
		int first=sc.nextInt();
		System.out.println("Enter the Second number:");
		int second=sc.nextInt();
		int sum=first+second;
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.printf("The sum is: %d and your name is %s.",sum,name);
	}
}
