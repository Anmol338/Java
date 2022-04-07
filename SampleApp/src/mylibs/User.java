package mylibs;

public class User {
	int uid;
	String fullName;
	String loginName;
	String loginPassword;
	String role;

	public User() {
		this.uid = 0;
		this.fullName = "";
		this.loginName = "";
		this.loginPassword = "";
		this.role = "";
	}

	public User(int uid, String fullName, String loginName, String loginPassword, String role) {
		this.uid = uid;
		this.fullName = fullName;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.role = role;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", fullName=" + fullName + ", loginName=" + loginName + ", loginPassword="
				+ loginPassword + ", role=" + role + "]";
	}

}
