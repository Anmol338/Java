package MyLib;

public class myLib {
	String username, password;

	public myLib() {
		super();
		this.username = "";
		this.password = "";
	}

	public myLib(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "myLib [username=" + username + ", password=" + password + "]";
	}

}
