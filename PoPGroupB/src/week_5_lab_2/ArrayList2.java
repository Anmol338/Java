package week_5_lab_2;

import java.util.ArrayList;
import myLibrary.Person;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList persons;
		persons = new ArrayList();
		
		//add person
		persons.add(new Person(1,"Anmol Shrestha","anmolstha013@gmail.com"));
		persons.add(new Person(2,"Santosh Adhikari","santoshadhikari@gmail.com"));
		persons.add(new Person(3,"Prerana Shrestha","preranashrestha@gmail.com"));
		persons.add(new Person(4,"Gaurav Dahal","gauravdahal@gmail.com"));
		
		System.out.println(persons.size());
		
		//get
		System.out.println(persons.get(0));
		//search
		//update
		//delete
	}

}
