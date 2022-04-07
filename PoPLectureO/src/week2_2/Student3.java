package week2_2; //Package include

// Student Information
public class Student3 {

	public static void main(String[] args) {
		//Declare variables
		String title,fullname,grade;
		char section;
		int id,eng,math,science,total,average;
		
		//Vale Assign
		title="Student Info";
		id = 1;
		fullname="Anmol Shrestha";
		grade="BSC.CS&SE";
		section='B';
		eng=92;
		math=98;
		science=88;
		
		//calculate
		total = eng+math+science;
		average = total/3;
		
		//Access Value
		System.out.println(title);
		System.out.println("Name = "+fullname);
		System.out.println("Grade = "+grade);
		System.out.println("Section = "+section);
		System.out.println("Id = "+id);
		System.out.println("English = "+eng);
		System.out.println("Math = "+math);
		System.out.println("Science = "+science);
		System.out.println("Total = "+total);
		System.out.println("Average = "+average);
		
	}

}
