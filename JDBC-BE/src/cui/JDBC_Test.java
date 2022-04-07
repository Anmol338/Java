package cui;

import mylibs.MyJDBC;

public class JDBC_Test {

	public static void main(String[] args) {
		MyJDBC jdbc = new MyJDBC();
		boolean res = jdbc.connect();
		System.out.println(res);
		
//		//insert record
//		res = jdbc.Insert("Anna","UK");
//		System.out.println(res);

//		System.out.println("---------Display all records of the database-------");
//		res = jdbc.select_all();
//		System.out.println(res);
//		
//		System.out.println("------------------Search Section--------------------");
//		res=jdbc.search(12);
//		System.out.println(res);
		
//		System.out.println("------------------Update Section--------------------");
//		System.out.println("\n\n------------------Output Before Update----------------");
//		res = jdbc.select_all();
//		res=jdbc.Update(1,"Anmol","Kathmandu");
//		System.out.println("\n\n------------------Output After Update----------------");
//		res=jdbc.select_all();
//		System.out.println(res);
		
		System.out.println("------------------Delete Section--------------------");
		System.out.println("\n\n------------------Output Before Delete----------------");
		res = jdbc.select_all();
		res=jdbc.delete(1);
		System.out.println("\n\n------------------Output After Delete----------------");
		res=jdbc.select_all();
		System.out.println(res);
	}

}