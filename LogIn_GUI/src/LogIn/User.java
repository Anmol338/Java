package LogIn;

public class User {
	String user;
	String password;

	// Default Constructor
	public User() {
		this.user = "";
		this.password = "";
	}

	// Parameterized Constructor
	public User(String user, String password) {
		this.user = user;
		this.password = password;
	}

	// Getter
	public String getUser() {
		return this.user;
	}

	public String getPassword() {
		return this.password;
	}

	// Setter
	public void setUser() {
		this.user = user;
	}

	public void setPassword() {
		this.password = password;
	}

	// process
	public void LogIn() {
		if ((this.user == "admin") && (this.password == "admin")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
