package ui;

import javax.swing.JFrame;

public class CustomerWindow extends JFrame{

	public CustomerWindow() {
		setTitle("Welcome To Customer Window");
		setBounds(550, 150, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CustomerWindow();
	}

}
