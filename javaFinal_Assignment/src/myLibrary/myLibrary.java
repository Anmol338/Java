package myLibrary;

import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class myLibrary {
	String fname, lname, email, mobile, password, conf_pass, gender, address;

	// Registration details
	public void registration(String fname, String lname, String email, String mobile, String password, String conf_pass,
			String gender, String address) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.conf_pass = conf_pass;
		this.gender = gender;
		this.address = address;

		if (isWordfname(this.fname)) {
			if (isWordlname(this.lname)) {
				if (isNum(this.mobile)) {
					if (this.password.equals(this.conf_pass)) {
						JOptionPane.showMessageDialog(null, "Valid");
					} else {
						JOptionPane.showMessageDialog(null, "Password and confirm password does not match!");
					}
				}else {
					JOptionPane.showMessageDialog(null, "Invalid Mobile Number !!");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Invalid last Name !! ");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Invalid First Name !!");
		}
	}
	
	
	// -------------------------------------------------Validation Part----------------------------------------------------------
	private boolean isWordfname(String fname) {

		return Pattern.matches("[a-zA-Z]+", fname);
	}

	private boolean isWordlname(String lname) {

		return Pattern.matches("[a-zA-Z]+", lname);
	}
	
	private boolean isNum(String mobile) {

		return mobile.matches("[98 || 97]{2}[0-9]{8}");
	}
	
	
	// -----------------------------------------------Validation Part End-----------------------------------------------------------

}
