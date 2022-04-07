package Week_4_Lab2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class LogIn implements ActionListener{
	JFrame frame;
	JLabel lblUser, lblName, lblAddress, lblGender;
	JTextField txtUser, txtName, txtAddress;
	JRadioButton btnMale, btnFemale;
	

	public LogIn() {
		frame = new JFrame();
		frame.setTitle("Student Login");
		frame.setSize(350, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblUser = new JLabel();
		lblUser.setText("ID : ");
		
		txtUser = new JTextField();
		txtUser.setColumns(20);
		
		lblName = new JLabel();
		lblName.setText("Name : ");
		
		txtName = new JTextField();
		txtName.setColumns(20);
		
		lblAddress = new JLabel();
		lblAddress.setText("Address : ");
		
		txtAddress = new JTextField();
		txtAddress.setColumns(20);
		
		lblGender = new JLabel();
		lblGender.setText("Gender : ");
		
		btnMale = new JRadioButton();
		btnMale.setText("Male");
		btnMale.addActionListener(this);
		
		btnFemale = new JRadioButton();
		btnFemale.setText("Female");
		
		frame.setLayout(new GridLayout(5,2));
		frame.add(lblUser);
		frame.add(txtUser);
		frame.add(lblName);
		frame.add(txtName);
		frame.add(lblAddress);
		frame.add(txtAddress);
		frame.add(lblGender);
		frame.add(btnMale);
		frame.add(new JLabel());
		frame.add(btnFemale);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnMale) {
			btnFemale.setEnabled(false);
		}else if(ae.getSource()==btnFemale) {
			btnMale.setEnabled(false);
		}
	}

	public static void main(String[] args) {
		new LogIn();
	}

}
