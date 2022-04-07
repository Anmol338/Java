package mylibs;

public class Person {
	int pid;
	String fullName;
	String contactAddress;
	
	public Person() {
		this.pid = 0;
		this.fullName = "";
		this.contactAddress = "";
	}
	
	public Person(int pid, String fullName, String contactAddress) {
		this.pid = pid;
		this.fullName = fullName;
		this.contactAddress = contactAddress;
	}

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

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fullName=" + fullName + ", contactAddress=" + contactAddress + "]";
	}
	
}
