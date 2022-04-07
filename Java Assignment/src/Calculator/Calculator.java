package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton; //Button import
import javax.swing.JFrame; //Frame import
import javax.swing.JLabel; //Label import
import javax.swing.JTextArea; //Text Area import

public class Calculator {

	//Frame
	JFrame frame;
	
	//Label
	JLabel l;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	//Button
	JButton btnAdd;
	JButton btnSub;
	JButton btnMul;
	JButton btnDiv;
	JButton btnPow;
	JButton btnSqrt;
	JButton btnClose;
	
	//Text Box
	JTextArea a1;
	JTextArea a2;
	JTextArea a3;

	public Calculator() {
		//label
		l = new JLabel("-------------- Calculator By Anmol Shrestha ----------------");
		l.setBounds(20, 0, 500, 20);
		
		l1 = new JLabel("First Number :");
		l1.setBounds(36, 10, 100, 50);
		a1 = new JTextArea();
		a1.setBounds(120, 30, 150, 20);
		
		l2 = new JLabel("Second Number :");
		l2.setBounds(20, 50, 100, 50);
		a2 = new JTextArea();
		a2.setBounds(120, 65, 150, 20);
		
		l3 = new JLabel("Result :");
		l3.setBounds(70, 170, 100, 50);
		a3 = new JTextArea();
		a3.setBounds(120, 185, 150, 20);
		a3.setEditable(false);
		
		//Button
		btnAdd = new JButton("ADD");
		btnAdd.setBounds(50, 100, 60, 30);
		btnAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = a1.getText();
				String b = a2.getText();
				double num1 = Double.parseDouble(a);				
				double num2 = Double.parseDouble(b);
				double sum = num1 + num2;
				a3.setText(String.valueOf(sum));
				
			}
			
		});
		
		btnSub = new JButton("SUB");
		btnSub.setBounds(120, 100, 70, 30);
		btnSub.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = a1.getText();
				String b = a2.getText();
				double num1 = Double.parseDouble(a);				
				double num2 = Double.parseDouble(b);
				double diff = num1 - num2;
				a3.setText(String.valueOf(diff));
				
			}
			
		});
		
		btnMul = new JButton("PRO");
		btnMul.setBounds(200, 100, 70, 30);
		btnMul.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = a1.getText();
				String b = a2.getText();
				double num1 = Double.parseDouble(a);				
				double num2 = Double.parseDouble(b);
				double pro = num1 * num2;
				a3.setText(String.valueOf(pro));
				
			}
			
		});
		
		btnDiv = new JButton("DIV");
		btnDiv.setBounds(50, 140, 60, 30);
		btnDiv.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = a1.getText();
				String b = a2.getText();
				double num1 = Double.parseDouble(a);				
				double num2 = Double.parseDouble(b);
				double div = num1 / num2;
				a3.setText(String.valueOf(div));
				
			}
			
		});
		
		btnPow = new JButton("POW");
		btnPow.setBounds(120, 140, 70, 30);
		btnPow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = a1.getText();
				String b = a2.getText();
				double num1 = Double.parseDouble(a);				
				double num2 = Double.parseDouble(b);
				double pow = Math.pow(num1, num2);
				a3.setText(String.valueOf(pow));
				
			}
			
		});
		
		btnSqrt = new JButton("SQRT");
		btnSqrt.setBounds(200, 140, 70, 30);
		btnPow.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String a = a1.getText();
				double num1 = Double.parseDouble(a);
				double num2 = Math.sqrt(num1);
				a3.setText(String.valueOf(num2));
			}
			
		});
		
		btnClose = new JButton("EXIT");
		btnClose.setBounds(120, 220, 70, 30);
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnClose) {
					System.exit(0);
				}
			}
			
		});
		
		
		//Frame
		frame = new JFrame("Calculator By Anmol"); //new -> Memory Allocation & JFrame() -> Initializer
		
		frame.add(l);
		frame.add(l1);
		frame.add(a1);
		frame.add(l2);
		frame.add(a2);
		frame.add(l3);
		frame.add(a3);
		frame.add(btnAdd);
		frame.add(btnSub);
		frame.add(btnMul);
		frame.add(btnDiv);
		frame.add(btnPow);
		frame.add(btnSqrt);
		frame.add(btnClose);
		frame.setSize(350, 300); //Size of frame width,height
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true); //Frame visible set
	}
	
	public static void main(String[] args) {
		new Calculator();

	}

}
