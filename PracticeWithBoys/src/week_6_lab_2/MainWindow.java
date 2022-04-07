package week_6_lab_2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainWindow implements ActionListener {

	JFrame frame;
	JMenuBar menuBar;
	JMenu menuUser;
	JMenuItem menuItem1,menuItem2;

	public MainWindow() {
		frame = new JFrame();
		frame.setTitle("Mainwindow 6-2");
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		menuBar = new JMenuBar();
		menuUser = new JMenu("User");
		menuItem1 = new JMenuItem("New User");
		menuItem1.addActionListener(this);
		menuItem2 = new JMenuItem("Exit");
		menuItem2.addActionListener(this);

		menuBar.add(menuUser);
		menuUser.add(menuItem1);
		menuUser.add(menuItem2);

		frame.setLayout(new FlowLayout());
		frame.add(menuBar);

		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==menuItem1) {
			new NewUser();
		}else if(e.getSource()==menuItem2) {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
		new MainWindow();

	}

	

}
