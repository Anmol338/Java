package ui;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import mylibs.MyJDBC2;
import mylibs.Person;
public class DisplayAll extends JFrame {
	JTable tblPersons;
	JScrollPane scrollPane;
	DefaultTableModel dtm;
	
	public DisplayAll() {
		setTitle("Display All");
		setSize(650,400);
		setResizable(false);
		setLayout(new FlowLayout());
		
		dtm = new DefaultTableModel();
		tblPersons = new JTable(dtm);
		
		dtm.addColumn("ID");
		dtm.addColumn("NAME");
		dtm.addColumn("ADDRESS");
		MyJDBC2 jdbc2 = new MyJDBC2();
		ArrayList persons = jdbc2.select_all();
		if(persons.size()>0) {
			for(int i=0; i<persons.size(); i++) {
				Person p = (Person) persons.get(i);
				Object []tmp= {p.getPid(), 
								p.getfname(), 
								p.getcaddress()};
				dtm.addRow(tmp);
			}
		}
		scrollPane = new JScrollPane(tblPersons);
		add(scrollPane);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DisplayAll();

	}
}
