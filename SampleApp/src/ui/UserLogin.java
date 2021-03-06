package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mylibs.User;
import mylibs.UserJDBC;

public class UserLogin extends JFrame implements ActionListener {

	JLabel lblUser, lblPass;
	JTextField txtUser, txtPass;
	JButton btnLogin, btnClose;

	String userName, password;

	public UserLogin() {
		setTitle("Sample App");
		setBounds(600, 250, 350, 300);
		setResizable(false);
		new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		lblUser = new JLabel("USER : ");
		lblUser.setBounds(10, 60, 90, 30);
		add(lblUser);

		txtUser = new JTextField();
		txtUser.setBounds(90, 60, 150, 30);
		add(txtUser);

		lblPass = new JLabel("PASS : ");
		lblPass.setBounds(10, 110, 90, 30);
		add(lblPass);

		txtPass = new JTextField();
		txtPass.setBounds(90, 110, 150, 30);
		add(txtPass);

		btnLogin = new JButton("LogIn");
		btnLogin.setBounds(50, 160, 100, 40);
		btnLogin.setFocusable(false);
		btnLogin.addActionListener(this);
		add(btnLogin);

		btnClose = new JButton("Close");
		btnClose.setBounds(170, 160, 100, 40);
		btnClose.setFocusable(false);
		btnClose.addActionListener(this);
		add(btnClose);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnLogin) {
			User user = new User();
			user.setLoginName(txtUser.getText()); 
			user.setLoginPassword(txtPass.getText());
			user = new UserJDBC().login(user);
			if (user.getUid() > 0) {
				if (user.getRole().equals("manager")) {
					// display manager window
					new ManagerWindow();
					this.setVisible(false);
				} else if (user.getRole().equals("staff")) {
					// display staff window
					new StaffWindow();
					this.setVisible(false);
				} else if (user.getRole().equals("customer")) {
					// display customer window
					new CustomerWindow();
					this.setVisible(false);
				} else if (user.getRole().equals("corpcustomer")) {
					// display corporate staff window
					new CorporateCustomerWindow();
					this.setVisible(false);
				}
			} else {
				System.out.println("Error: User name or password");
			}

		} else if (ae.getSource() == btnClose) {
			System.exit(0);
		}
	}





public static void main(String[] args) {
		new UserLogin();
	}

}
