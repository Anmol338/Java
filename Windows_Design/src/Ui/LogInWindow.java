package Ui;

import java.awt.Color;

//import library
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

// LogInWindow Class
public class LogInWindow extends JFrame {

	// Declaration
	JLabel lblLogIn, lblUname, lblPass;
	JTextField txtUname, txtPass;
	JButton btnLogIn, btnReg, btnClose;

	// LogInWindow
	public LogInWindow() {
		setTitle("LogIn Window"); // Title
		setBounds(500, 150, 450, 500); // Size of Window
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Default Close Operation
		setLayout(null); // Set Layout

		// Initialize and Memory Allocation
		lblLogIn = new JLabel("Log In");
		lblLogIn.setBounds(200, 30, 100, 30);
		
		lblUname = new JLabel("User Name : ");
		lblUname.setBounds(10, 100, 100, 30);

		lblPass = new JLabel("Password : ");
		lblPass.setBounds(10, 180, 100, 30);

		txtUname = new JTextField();
		txtUname.setBounds(150, 100, 200, 30);

		txtPass = new JTextField();
		txtPass.setBounds(150, 180, 200, 30);

		btnLogIn = new JButton();

		btnReg = new JButton();

		btnClose = new JButton();

		// Adding all the items to the main frame
		add(lblLogIn);
		add(lblUname);
		add(lblPass);
		add(txtUname);
		add(txtPass);
		add(btnLogIn);
		add(btnReg);
		add(btnClose);

		setVisible(true); // Visibility
	}

	// Main Function
	public static void main(String[] args) {
		// Declaration and Initializer
		new LogInWindow();
	}

}
