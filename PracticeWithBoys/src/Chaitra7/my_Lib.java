package Chaitra7;

public class my_Lib {

	String name, pass, cpass;

	public void registration(String name, String pass, String cpass) {
		this.name = name;
		this.pass = pass;
		this.cpass = cpass;
		System.out.println(name +"\t"+ pass +"\t"+ cpass);
	}
}
