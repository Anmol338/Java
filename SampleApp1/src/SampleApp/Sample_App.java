package SampleApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import MyLib.MyJDBC2;
import MyLib.myLib;

public class Sample_App extends JFrame implements ActionListener {

	JLabel lblUserName, lblPassword;
	JTextField txtUserName, txtPassword;
	JButton btnClose, btnLogIn;

	String userName, password;

	public Sample_App() {
		setTitle("Sample App");
		setBounds(600, 250, 350, 300);
		setResizable(false);
		new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		lblUserName = new JLabel("UserName:");
		lblUserName.setBounds(10, 60, 90, 30);
		add(lblUserName);

		txtUserName = new JTextField();
		txtUserName.setBounds(90, 60, 150, 30);
		add(txtUserName);

		lblPassword = new JLabel("Password:");
		lblPassword.setBounds(10, 110, 90, 30);
		add(lblPassword);

		txtPassword = new JTextField();
		txtPassword.setBounds(90, 110, 150, 30);
		add(txtPassword);

		btnClose = new JButton("Close");
		btnClose.addActionListener(this);
		btnClose.setBounds(50, 160, 100, 40);
		btnClose.setFocusable(false);
		add(btnClose);

		btnLogIn = new JButton("LogIn");
		btnLogIn.addActionListener(this);
		btnLogIn.setBounds(170, 160, 100, 40);
		btnLogIn.setFocusable(false);
		add(btnLogIn);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnLogIn) {
			userName = txtUserName.getText();
			password = txtPassword.getText();
			MyJDBC2 sch = new MyJDBC2();
			boolean result = sch.search(userName, password);
			if (result==true) {
				txtUserName.setText(null);
				txtPassword.setText(null);
			} else {

			}
		} else if (e.getSource() == btnClose) {
			System.exit(0);
		}

	}

	public static void main(String[] args) {
		new Sample_App();
	}

}
