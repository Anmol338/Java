package mylibs;

// Registration Class
public class Registration {

	// Initial Variables
	int cid, postcode;
	String fname, lname, gender, address, email, contact, creditcard, password, cpassword;

	// Default Constructor
	public Registration() {
		this.cid = 0;
		this.postcode = 0;
		this.fname = "";
		this.lname = "";
		this.gender = "";
		this.address = "";
		this.email = "";
		this.contact = "";
		this.creditcard = "";
		this.password = "";
		this.cpassword = "";
	}

	// Parameterized Constructor
	public Registration(int cid, int postcode, String fname, String lname, String gender, String address, String email,
			String contact, String creditcard, String password, String cpassword) {
		this.cid = cid;
		this.postcode = postcode;
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.address = address;
		this.email = email;
		this.contact = contact;
		this.creditcard = creditcard;
		this.password = password;
		this.cpassword = cpassword;
	}

	// Getter Setter
	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreditcard() {
		return creditcard;
	}

	public void setCreditcard(String creditcard) {
		this.creditcard = creditcard;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	//To String
	@Override
	public String toString() {
		return "Registration [cid=" + cid + ", postcode=" + postcode + ", fname=" + fname + ", lname=" + lname
				+ ", gender=" + gender + ", address=" + address + ", email=" + email + ", contact=" + contact
				+ ", creditcard=" + creditcard + ", password=" + password + ", cpassword=" + cpassword + "]";
	}

}
