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

	public String getfname() {
		return fname;
	}

	public void setfname(String fname) {
		this.fname = fname;
	}

	public String getcaddress() {
		return caddress;
	}

	public void setcaddress(String caddress) {
		this.caddress = caddress;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", fname=" + fname + ", caddress=" + caddress + "]";
	}
	
}
