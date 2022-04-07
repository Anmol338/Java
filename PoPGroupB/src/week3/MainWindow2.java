package week3;

import javax.swing.JFrame; //Window
import javax.swing.JButton; //Button
import javax.swing.ImageIcon; //Icon
import java.awt.FlowLayout; // Layout
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow2 implements ActionListener {
	JFrame frame;// declare an object of JFrame
	JButton btnClose; // Object of Button

	// Default Constructor
	public MainWindow2() {
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

		btnClose.addActionListener(this);

		frame.add(btnClose);

		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MainWindow2(); // Object initialization

	}

}
