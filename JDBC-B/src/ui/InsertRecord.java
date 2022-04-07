package ui;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mylibs.MyJDBC2;
import mylibs.Person;

public class InsertRecord extends JFrame implements ActionListener {
	
	JLabel lblID, lblName, lblAddress;
	JTextField txtID, txtName, txtAddress;
	JButton btnClose, btnSave;
	
	public InsertRecord() {
		lblID=new JLabel("ID: ");
		lblName=new JLabel("NAME: ");
		lblAddress=new JLabel("ADDRESS: ");
		
		txtID=new JTextField(20);
		txtName=new JTextField(20);
		txtAddress=new JTextField(20);
		
		btnClose=new JButton("CLOSE");
		btnSave=new JButton("SAVE");
		
		btnClose.addActionListener(this);//Event Register
		btnSave.addActionListener(this);
				
		setTitle("Insert New Record");
		setSize(350,200);
		setResizable(false);
		setLayout(new GridLayout(4, 2));
		add(lblID);
		add(txtID);
		add(lblName);
		add(txtName);
		add(lblAddress);
		add(txtAddress);
		add(btnClose);
		add(btnSave);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnClose) {
			System.exit(0);
		}
		else if(ae.getSource()==btnSave) {
			//save record	
			int id;
			String name, address;		
			id = Integer.parseInt(txtID.getText());
			name = txtName.getText();
			address = txtAddress.getText();
			Person person=new Person(id, name, address);
			MyJDBC2 jdbc2 = new MyJDBC2();
			boolean result = jdbc2.insert(person);
			if(result==true) {
				System.out.println("Record saved");
			}
			else {
				System.out.println("Error to insert record");
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		new InsertRecord();

	}
}
