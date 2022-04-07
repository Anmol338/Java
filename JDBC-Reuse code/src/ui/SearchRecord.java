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

public class SearchRecord extends JFrame implements ActionListener {

	JLabel lblID, lblName, lblAddress, lblResult;
	JTextField txtID, txtName, txtAddress;
	JButton btnClose, btnSearch;

	public SearchRecord() {
		lblID = new JLabel("ID: ");
		lblName = new JLabel("NAME: ");
		lblAddress = new JLabel("ADDRESS: ");
		lblResult = new JLabel("");

		txtID = new JTextField(20);
		txtName = new JTextField(20);
		txtAddress = new JTextField(20);

		btnClose = new JButton("CLOSE");
		btnSearch = new JButton("SEARCH");

		btnClose.addActionListener(this);// Event Register
		btnSearch.addActionListener(this);

		setTitle("Record Search");
		setSize(350, 200);
		setResizable(false);
		setLayout(new GridLayout(5, 2));
		add(lblID);
		add(txtID);
		add(lblName);
		add(txtName);
		add(lblAddress);
		add(txtAddress);
		add(btnClose);

		add(btnSearch);
		add(new JLabel());
		add(lblResult);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnClose) {
			System.exit(0);
		} else if (ae.getSource() == btnSearch) {
			// search record
			int id = Integer.parseInt(txtID.getText());
			MyJDBC2 jdbc2 = new MyJDBC2();
			Person person = jdbc2.search(id);
			if (person.getPid() > 0) {
				txtName.setText(person.getFullName());
				txtAddress.setText(person.getContactAddress());
				lblResult.setText("Record found");
			} else {
				txtName.setText("");
				txtAddress.setText("");
				lblResult.setText("Record not found");
				
			}
		}
	}

	public static void main(String[] args) {
		new SearchRecord();

	}
}
