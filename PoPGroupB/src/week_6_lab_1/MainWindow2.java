package week_6_lab_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow2 {
	JFrame frame;
	JPanel panel1, panel2;
	JButton btn1, btn2;
	
	public MainWindow2() {
		frame = new JFrame();
		frame.setTitle("Mainwindow 6-2");
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel1 = new JPanel();
		panel1.setSize(250, 600);
		panel1.setBackground(Color.green);
		panel1.setLayout(new FlowLayout());
		
		panel2 = new JPanel();
		panel2.setSize(250, 600);
		panel2.setBackground(Color.blue);
		panel2.setLayout(new FlowLayout());
		
		btn1 = new JButton();
		btn1.setText("Click me");
		
		btn2 = new JButton();
		btn2.setText("Click me");
		
		panel1.add(btn1);
		panel2.add(btn2);
		
		frame.setLayout(new BorderLayout());
		frame.add(panel1, BorderLayout.WEST);
		frame.add(panel2, BorderLayout.EAST);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {
		new MainWindow2();
	}

}
