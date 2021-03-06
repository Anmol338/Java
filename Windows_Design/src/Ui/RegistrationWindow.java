package Ui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import mylibs.Registration;

public class RegistrationWindow extends JFrame implements ActionListener {

	// Declare
	JLabel lblfname, lbllname, lblGender, lblAddress, lblPostCode, lblEmail, lblContact, lblCard, lblPassword,
			lblConPassword;
	JTextField txtfname, txtlname, txtAddress, txtPostCode, txtEmail, txtContact, txtCard;
	JPasswordField txtPassword, txtConPassword;
	JComboBox cmbGender;
	JButton btnReg, btnClose, btnLog;

	public RegistrationWindow() {
		setTitle(" Customer Registration Window");
		setBounds(500, 150, 400, 570);
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		// Initialize and memory allocation
		// JLabel Elements :-
		lblfname = new JLabel("First Name : ");
		lblfname.setBounds(10, 20, 120, 20);

		lbllname = new JLabel("Last Name : ");
		lbllname.setBounds(10, 60, 120, 20);

		lblGender = new JLabel("Gender : ");
		lblGender.setBounds(10, 100, 120, 20);

		lblAddress = new JLabel("Address : ");
		lblAddress.setBounds(10, 140, 120, 20);

		lblPostCode = new JLabel("Zip Code : ");
		lblPostCode.setBounds(10, 180, 120, 20);

		lblEmail = new JLabel("Email : ");
		lblEmail.setBounds(10, 220, 120, 20);

		lblContact = new JLabel("Contact : ");
		lblContact.setBounds(10, 260, 120, 20);

		lblCard = new JLabel("Credit Card : ");
		lblCard.setBounds(10, 300, 120, 20);

		lblPassword = new JLabel("Password : ");
		lblPassword.setBounds(10, 340, 120, 20);

		lblConPassword = new JLabel("Confirm Password : ");
		lblConPassword.setBounds(10, 380, 120, 20);

		// JTextField Elements :-
		txtfname = new JTextField();
		txtfname.setBounds(140, 20, 200, 25);

		txtlname = new JTextField();
		txtlname.setBounds(140, 60, 200, 25);

		txtAddress = new JTextField();
		txtAddress.setBounds(140, 140, 200, 25);

		txtPostCode = new JTextField();
		txtPostCode.setBounds(140, 180, 200, 25);

		txtEmail = new JTextField();
		txtEmail.setBounds(140, 220, 200, 25);

		txtContact = new JTextField();
		txtContact.setBounds(140, 260, 200, 25);

		txtCard = new JTextField();
		txtCard.setBounds(140, 300, 200, 25);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(140, 340, 200, 25);

		txtConPassword = new JPasswordField();
		txtConPassword.setBounds(140, 380, 200, 25);

		// JComboBox
		String opt[] = { "Male", "Female", "Others" };
		cmbGender = new JComboBox(opt);
		cmbGender.setBounds(140, 100, 200, 25);

		// JButton Elements :-
		btnReg = new JButton("Register");
		btnReg.setFocusable(false);
		btnReg.setBounds(80, 420, 90, 30);
		btnReg.addActionListener(this);

		btnClose = new JButton("Close");
		btnClose.setFocusable(false);
		btnClose.setBounds(200, 420, 90, 30);
		btnClose.addActionListener(this);

		btnLog = new JButton("Already a member");
		btnLog.setFocusable(false);
		btnLog.setBounds(110, 470, 150, 30);
		btnLog.addActionListener(this);

		// Adding label, text field, password field, Button into main frame
		add(lblfname);
		add(lbllname);
		add(lblGender);
		add(lblAddress);
		add(lblPostCode);
		add(lblEmail);
		add(lblContact);
		add(lblCard);
		add(lblPassword);
		add(lblConPassword);
		add(txtfname);
		add(txtlname);
		add(cmbGender);
		add(txtAddress);
		add(txtPostCode);
		add(txtEmail);
		add(txtContact);
		add(txtCard);
		add(txtPassword);
		add(txtConPassword);
		add(btnReg);
		add(btnClose);
		add(btnLog);

		// Frame visibility option
		setVisible(true);
	}

	// Action Perform when button event is performed
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			int a = JOptionPane.showConfirmDialog(this, "Are you sure?");
			if (a == JOptionPane.YES_OPTION) {
				this.setVisible(false);
				new Dashboard();
			}
		} else if (ae.getSource() == btnReg) {

			Registration registration = new Registration();
			registration.setFname(txtfname.getText());
			registration.setLname(txtlname.getText());
			registration.setGender(cmbGender.getSelectedItem().toString());
			registration.setAddress(txtAddress.getText());
			registration.setPostcode(Integer.parseInt(txtPostCode.getText()));
			registration.setEmail(txtEmail.getText());
			registration.setContact(txtContact.getText());
			registration.setCreditcard(txtCard.getText());
			registration.setPassword(txtPassword.getText());
			registration.setCpassword(txtConPassword.getText());
			
			System.out.println(registration.toString());
			
			new Dashboard();

		} else if (ae.getSource() == btnLog) {

		}
	}

	// Main Function
	public static void main(String[] args) {
		new RegistrationWindow();
	}

}
