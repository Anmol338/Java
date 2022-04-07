package Calculator;

import javax.swing.*; //Window
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
	JFrame frame; // Declare
	JTextField t1, t2, t3; // Declare
	JButton btn, btn2; // Declare
	JLabel l1, l2, l3; // Declare

	public Calculator() {
		// Frame
		frame = new JFrame("Calculator By Anmol"); // new -> Memory Allocation JFrame() -> Initializer

		// Label
		l1 = new JLabel("First Number:"); // new -> Memory Allocation JFrame() -> Initializer
		l1.setBounds(30, 50, 120, 30); // x-axis, y-axis, width, height

		l2 = new JLabel("Second Number:"); // new -> Memory Allocation JFrame() -> Initializer
		l2.setBounds(30, 90, 120, 30); // x-axis, y-axis, width, height

		l3 = new JLabel("Result:"); // new -> Memory Allocation JFrame() -> Initializer
		l3.setBounds(30, 180, 120, 30); // x-axis, y-axis, width, height

		// Text Field
		t1 = new JTextField(); // new -> Memory Allocation JFrame() -> Initializer
		t1.setBounds(150, 50, 120, 30); // x-axis, y-axis, width, height
		t2 = new JTextField(); // new -> Memory Allocation JFrame() -> Initializer
		t2.setBounds(150, 90, 120, 30); // x-axis, y-axis, width, height
		t3 = new JTextField(); // new -> Memory Allocation JFrame() -> Initializer
		t3.setBounds(150, 180, 120, 30); // x-axis, y-axis, width, height
		t3.setEditable(false);

		// Button
		btn = new JButton("Add"); // new -> Memory Allocation JFrame() -> Initializer
		btn.setBounds(150, 130, 80, 40); // x-axis, y-axis, width, height
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = t1.getText();
				String b = t2.getText();
				long num1 = Long.parseLong(a);				
				long num2 = Long.parseLong(b);
				long sum = num1 + num2;
				t3.setText(String.valueOf(sum));
			}
		});

		btn2 = new JButton("Close"); // new -> Memory Allocation JFrame() -> Initializer
		btn2.setBounds(150, 220, 80, 40); // x-axis, y-axis, width, height
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btn2) {
					System.exit(0);
				}
			}
			
		});
		
		
		//Frame add, set, etc....
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(btn);
		frame.add(btn2);
		frame.setSize(400, 400); // width, height
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new Calculator(); // new -> Memory Allocation JFrame() -> Initializer

	}

}
