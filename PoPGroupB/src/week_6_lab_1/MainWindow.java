package week_6_lab_1;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow implements ActionListener{
	JFrame frame;
	JMenuBar menubar1;
	JMenu menu1;
	JMenuItem menuItem1, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6;

	public MainWindow() {
		frame = new JFrame();
		frame.setTitle("Mainwindow-6");
		frame.setSize(500, 500);
		// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		// frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menubar1 = new JMenuBar();
		menu1 = new JMenu("File");
	    menuItem1 = new JMenuItem("New");
		menuItem2 = new JMenuItem("Save");
		menuItem3 = new JMenuItem("Save as");
		menuItem4 = new JMenuItem("Open");
		menuItem5 = new JMenuItem("Close");
		
		JMenuItem menuItem6 = new JMenuItem("Exit");
		menuItem6.addActionListener(this);

		menubar1.add(menu1);
		menu1.add(menuItem1);
		menu1.add(menuItem2);
		menu1.add(menuItem3);
		menu1.add(menuItem4);
		menu1.add(menuItem5);
		menu1.add(menuItem6);

		frame.setLayout(new FlowLayout());
		frame.add(menubar1);
	

		frame.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==menuItem6) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new MainWindow();
	}

}
