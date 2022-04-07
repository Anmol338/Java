package week3;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person(); // new -> Memory Allocation , Person() -> Initializer

		//Value Assign
		p1.setId(100);
		p1.setName("Anmol Shrestha");
		p1.setAddress("Banepa");

		//Value Access
		System.out.println("Id:- " + p1.getId() + "\nName:- " + p1.getName() + "\nAddress:- " + p1.getAddress());
	}

}
