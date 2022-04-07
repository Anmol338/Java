package mylibs;

public class Person {
	int pid;
	String fname;
	String caddress;

	public Person() {
		this.pid = 0;
		this.fname = "";
		this.caddress = "";
	}

	public Person(int pid, String fname, String caddress) {
		this.pid = pid;
		this.fname = fname;
		this.caddress = caddress;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fname=" + fname + ", caddress=" + caddress + "]";
	}

	

}