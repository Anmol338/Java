package Chaitra06;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Library {

	// Initial Variables
	String fName, lName, contact, address, email;

	// Parameterized Constructor
	public void registration(String fName, String lName, String contact, String address, String email) {
		this.fName = fName;
		this.lName = lName;
		this.contact = contact;
		this.address = address;
		this.email = email;

		if (fName(this.fName)) {
			if (lName(this.lName)) {
				if (Contact(this.contact)) {
					JOptionPane.showMessageDialog(null, "Validation Successfully !!");
				} else {
					JOptionPane.showMessageDialog(null, "Validation Unsuccessful !!");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Validation Unsuccessful !!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Validation Unsuccessful !!");
		}

	}

	private boolean fName(String fName) {
		return Pattern.matches("[A-Za-z]+", fName);
	}
	
	private boolean lName(String lName) {
		return Pattern.matches("[A-Za-z]+", lName);
	}
	
	private boolean Contact(String contact) {
		return Pattern.matches("[9]{1}[876]{1}[0-9]{8}", contact);
	}

}
