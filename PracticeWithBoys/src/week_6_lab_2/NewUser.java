package week_6_lab_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Chaitra7.my_Lib;

public class NewUser implements ActionListener {

	my_Lib lib = new my_Lib(); // Initialize and memory allocation

	String username, password, con_password;

	JFrame frame;
	JLabel lblUser, lblPassword, lblRePassword;
	JTextField txtUser, txtPassword, txtRePassword;
	JButton btnClose, btnSave;

	public NewUser() {
		frame = new JFrame("New User");
		frame.setSize(300, 250);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblUser = new JLabel();
		lblUser.setText("User :");
		lblUser.setBounds(10, 10, 80, 20);

		txtUser = new JTextField();
		txtUser.setBounds(125, 10, 130, 20);
		txtUser.addActionListener(this);

		lblPassword = new JLabel();
		lblPassword.setText("Password :");
		lblPassword.setBounds(10, 50, 80, 20);

		txtPassword = new JTextField();
		txtPassword.setBounds(125, 50, 130, 20);
		txtPassword.addActionListener(this);

		lblRePassword = new JLabel();
		lblRePassword.setText("Confirm Password :");
		lblRePassword.setBounds(10, 100, 120, 20);

		txtRePassword = new JTextField();
		txtRePassword.setBounds(125, 100, 130, 20);
		txtRePassword.addActionListener(this);

		btnClose = new JButton("Close");
		btnClose.setFocusable(false);
		btnClose.setBounds(30, 150, 80, 30);
		btnClose.addActionListener(this);

		btnSave = new JButton("Save");
		btnSave.setFocusable(false);
		btnSave.setBounds(130, 150, 80, 30);
		btnSave.addActionListener(this);

		frame.setLayout(null);
		frame.add(lblUser);
		frame.add(txtUser);
		frame.add(lblPassword);
		frame.add(txtPassword);
		frame.add(lblRePassword);
		frame.add(txtRePassword);
		frame.add(btnClose);
		frame.add(btnSave);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnClose) {
			frame.setVisible(false);
		} else if (e.getSource() == btnSave) {
			username = txtUser.getText();
			password = txtPassword.getText();
			con_password = txtRePassword.getText();
			lib.registration(username, password, con_password);
		}

	}

	public static void main(String[] args) {
		new NewUser();
	}

}
