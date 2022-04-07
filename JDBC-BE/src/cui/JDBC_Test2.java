package cui;

import mylibs.MyJDBC2;
import mylibs.Person;

public class JDBC_Test2 {

	public static void main(String[] args) {
		MyJDBC2 jdbc2 = new MyJDBC2();
		Person person;
		boolean result;
		
		//insert
		person = new Person("Loman","Lalitpur");
		result = jdbc2.Insert(person);
		if (result == true) {
			System.out.println("Insert record successfully");
		} else {
			System.out.println("Error to insert record");
		}
	}

}