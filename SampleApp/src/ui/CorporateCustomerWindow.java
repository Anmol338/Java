package ui;

import javax.swing.JFrame;

public class CorporateCustomerWindow extends JFrame{

	public CorporateCustomerWindow() {
		setTitle("Welcome To Corporate Customer Window");
		setBounds(550, 150, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CorporateCustomerWindow();
	}

}
