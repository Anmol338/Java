package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class JDBC_Test2 extends JFrame {

	JTable tblPersons;
	JScrollPane scrollPane;
	DefaultTableModel dtm;
	
	public JDBC_Test2() {
		setTitle("Insert Record");
		setBounds(600, 250, 350, 300);
		setResizable(false);
		new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		tblPersons = new JTable();
		dtm = new DefaultTableModel();
		dtm.addColumn("Id");
		dtm.addColumn("Name");
		dtm.addColumn("CAddress");
		
		scrollPane = new JScrollPane(tblPersons);
		add(scrollPane);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new JDBC_Test2();
	}

}
