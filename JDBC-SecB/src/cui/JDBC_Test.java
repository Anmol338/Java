package cui;
import mylibs.MyJDBC;

public class JDBC_Test {

	public static void main(String[] args) {
		MyJDBC jdbc = new MyJDBC();
		boolean res;
		
		//res = jdbc.connect();
		//System.out.println(res);
		
		//insert record
//		res = jdbc.insert(1, "Krishna Aryal", "KTM");
//		System.out.println(res);
		
		//select all
//		res = jdbc.select_all();
//		System.out.println(res);
		
		//search record
		//res = jdbc.search(1);
		//System.out.println(res);
		
		//update
//		res = jdbc.select_all();
//		res = jdbc.update(1, "New Name","New Address");
//		res = jdbc.select_all();
		
		//delete record
		res = jdbc.select_all();
		res = jdbc.delete(1);
		res = jdbc.select_all();
	}
}
