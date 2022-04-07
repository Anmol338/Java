package myLibrary;

public class Person {
	int pid;
	String fullName;
	String email;

	// Default Constructor
	public Person() {
		this.pid = 0;
		this.fullName = "";
		this.email = "";
	}

	// Parameterized Constructor
	public Person(int pid, String fullName, String email) {
		this.pid = pid;
		this.fullName = fullName;
		this.email = email;
	}

	//Getter & Setter
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//toStrig
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fullName=" + fullName + ", email=" + email + "]";
	}

}
