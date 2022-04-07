//Package Included
package Week2;

//Import JFrame
import javax.swing.JFrame; //Window

//Main Window
public class MainWindow3 {
	JFrame frame; //Declare
	
	public MainWindow3() {
		frame = new JFrame(); //Initialize
		frame.setSize(350,250); //Set size (width, height)
		frame.setResizable(false);
		frame.setTitle("My Windows-2");
		frame.setVisible(true); //Set visible
	}
	
	public static void main(String [] args) {
		new MainWindow3();
	}
}
