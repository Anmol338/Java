package cui;
import java.util.ArrayList;

import mylibs.MyJDBC2;
import mylibs.Person;

public class JDBC_Test2 {

	public static void main(String[] args) {
		MyJDBC2 jdbc = new MyJDBC2();
		boolean result=false;
		
		//insert
		Person p1 = new Person(1, "Name", "Address");
		result = jdbc.insert(p1);
		System.out.println(result);
		
		//update
		p1 = new Person(1, "NewName", "NewAddress");
		result = jdbc.update(p1);
		System.out.println(result);
		
		//delete
		p1 = new Person();
		p1.setPid(6);
		result = jdbc.delete(p1);
		System.out.println(result);
		
		//select all
		ArrayList persons = jdbc.select_all();
		if(persons.size()>0) {
			for(int i =0; i<persons.size(); i++) {
				System.out.println(persons.get(i));
			}
		}
		//HW-1
		//Publish persons in JTable
		
		//search
		p1 = new Person();
		p1.setPid(5);
		p1 = jdbc.search(p1);
		System.out.println(p1);
	}
}
