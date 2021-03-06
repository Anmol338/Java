package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mylibs.MyJDBC;
import mylibs.Person;

public class JDBC_Test extends JFrame implements ActionListener {

	JLabel lblName, lblAddress;
	JTextField txtName, txtAddress;
	JButton btnClose, btnSave;

	public JDBC_Test() {
		setTitle("Insert Record");
		setBounds(600, 250, 350, 300);
		setResizable(false);
		new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		lblName = new JLabel("Name:");
		lblName.setBounds(10, 60, 50, 30);
		add(lblName);

		txtName = new JTextField();
		txtName.setBounds(90, 60, 150, 30);
		add(txtName);

		lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 110, 50, 30);
		add(lblAddress);

		txtAddress = new JTextField();
		txtAddress.setBounds(90, 110, 150, 30);
		add(txtAddress);

		btnClose = new JButton("Close");
		btnClose.addActionListener(this);
		btnClose.setBounds(50, 160, 100, 40);
		btnClose.setFocusable(false);
		add(btnClose);

		btnSave = new JButton("Save");
		btnSave.addActionListener(this);
		btnSave.setBounds(170, 160, 100, 40);
		btnSave.setFocusable(false);
		add(btnSave);

		setVisible(true);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String name, address;
//
//		if (e.getSource() == btnSave) {
//			name = txtName.getText();
//			address = txtAddress.getText();
//			System.out.println(name+" , "+address);
//			Person person = new Person(name,address);
//			System.out.println(person.toString());
//			MyJDBC jdbc = new MyJDBC();
//			boolean result=jdbc.Insert(person);
//			if (result==true) {
//				JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
//				System.out.println("Record Inserted Successfully.");
//			} else {
//				JOptionPane.showMessageDialog(null,"Record Inserted Failed","Alert",JOptionPane.WARNING_MESSAGE);
//				System.out.println("Failed to insert record.");
//			}
//			
//		} else if(e.getSource()==btnClose){
//			  int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
//			  if(a==JOptionPane.YES_OPTION){  
//			      System.exit(0);
//			  }
//		}
//
//	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	public static void main(String[] args) {
		new JDBC_Test();
	}

}
