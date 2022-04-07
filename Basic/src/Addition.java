import java.util.Scanner;
import javax.swing.JFrame;
public class Addition {
	public static void main(String [] args) {
		JFrame frame=new JFrame();
		try (Scanner anmol = new Scanner(System.in)) {
			System.out.println("What is your name?");
			String name = anmol.nextLine();
			System.out.println("Your name is "+name);
		}
	}
}
