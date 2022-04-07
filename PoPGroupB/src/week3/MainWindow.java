package week3;

import javax.swing.JFrame; //Window
import javax.swing.JButton; //Button
import javax.swing.ImageIcon; //Icon
import java.awt.FlowLayout; // Layout

public class MainWindow {
	JFrame frame;// declare an object of JFrame
	JButton btnClose; // Object of Button

	// Default Constructor
	public MainWindow() {
		frame = new JFrame(); // new -> Memory Allocation JFrame() ->Initializer
		frame.setSize(500, 350); // width,height
		frame.setTitle("Calculator");
		// set icon
		ImageIcon icon = new ImageIcon("Anmol.png");
		frame.setIconImage(icon.getImage());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());

		// Button
		btnClose = new JButton();
		btnClose.setText("Close");

		frame.add(btnClose);

		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new MainWindow(); // Object initialization

	}

}
