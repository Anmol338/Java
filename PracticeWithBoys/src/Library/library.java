package Library;

public class library {
	int age;
	String fname, lname, email, password, gender, address;
	
	// Default Constructor
	public library() {
		this.age = 0;
		this.fname = "";
		this.lname = "";
		this.email = "";
		this.password = "";
		this.gender = "";
		this.address = "";
	}
	
	//Parameterized Constructor
	public library(int age, String fname, String lname, String email, String password, String gender, String address) {
		this.age = age;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.address = address;
	}

	//Get Age
	public int getAge() {
		return age;
	}

	//Set Age
	public void setAge(int age) {
		this.age = age;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "library [age=" + age + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", password="
				+ password + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
