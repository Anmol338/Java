package ui;

import javax.swing.JFrame;

public class StaffWindow extends JFrame {

	public StaffWindow() {
		setTitle("Welcome To Staff Window");
		setBounds(550, 150, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		setVisible(true);
	}

	public static void main(String[] args) {
		new StaffWindow();
	}

}
