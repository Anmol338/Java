//Package Included
package week5_lab_1;

//Library Import
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import myLibrary.Calculator;
import myLibrary.MyCalculator;

//CalculatorGui Class start
public class CalculatorGui implements ActionListener {
	JFrame frame;
	JButton btnAdd;
	JButton btnSub;
	JButton btnPrd;
	JButton btnDiv;
	JButton btnRem;
	JButton btnPow;
	JButton btnEql;
	JButton btnClear;
	JButton btnClose;
	JTextField txt1;
	JTextField txt2;
	JTextField txt3;
	JPanel mainPanel, panelTxt, panelBtn, panelDesign;
	JLabel lblfooter;

	// Default constructor
	public CalculatorGui() {

		// frame set
		frame = new JFrame();
		frame.setSize(400, 500);
		frame.setTitle("Calculator");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Main panel set
		mainPanel = new JPanel();
		mainPanel.setBackground(Color.RED);
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		mainPanel.setLayout(null);

		// Panel Text set
		panelTxt = new JPanel();
		panelTxt.setBackground(Color.GRAY);
		panelTxt.setBounds(10, 10, 370, 190);
		panelTxt.setLayout(null);

		// Adding text panel to the main panel
		mainPanel.add(panelTxt);

		// Button Panel Set
		panelBtn = new JPanel();
		panelBtn.setBackground(Color.GREEN);
		panelBtn.setBounds(10, 210, 370, 200);
		panelBtn.setLayout(null);

		// Adding button panel to the main panel
		mainPanel.add(panelBtn);

		// Design Label Set
		panelDesign = new JPanel();
		panelDesign.setBackground(Color.WHITE);
		panelDesign.setBounds(10, 415, 370, 40);
		panelDesign.setLayout(null);
		mainPanel.add(panelDesign);

		// Text Filed set
		txt1 = new JTextField();
		txt1.setBounds(10, 10, 350, 50);
		txt1.setFont(new Font("Arial", Font.BOLD, 18));
		panelTxt.add(txt1);

		txt2 = new JTextField();
		txt2.setBounds(10, 70, 350, 50);
		txt2.setFont(new Font("Arial", Font.BOLD, 18));
		panelTxt.add(txt2);

		txt3 = new JTextField();
		txt3.setBounds(10, 130, 350, 50);
		txt3.setFont(new Font("Arial", Font.BOLD, 18));
		txt3.setText("0");
		txt3.setEditable(false);
		panelTxt.add(txt3);

		// Button set
		btnAdd = new JButton();
		btnAdd.setText("+");
		btnAdd.setFont(new Font("Arial", Font.BOLD, 18));
		btnAdd.setBounds(30, 30, 60, 30);
		panelBtn.add(btnAdd);
		btnAdd.addActionListener(this);

		btnSub = new JButton();
		btnSub.setText("-");
		btnSub.setFont(new Font("Arial", Font.BOLD, 18));
		btnSub.setBounds(150, 30, 60, 30);
		panelBtn.add(btnSub);
		btnSub.addActionListener(this);

		btnPrd = new JButton();
		btnPrd.setText("*");
		btnPrd.setFont(new Font("Arial", Font.BOLD, 20));
		btnPrd.setBounds(270, 30, 60, 30);
		panelBtn.add(btnPrd);
		btnPrd.addActionListener(this);

		btnDiv = new JButton();
		btnDiv.setText("/");
		btnDiv.setFont(new Font("Arial", Font.BOLD, 18));
		btnDiv.setBounds(30, 90, 60, 30);
		panelBtn.add(btnDiv);
		btnDiv.addActionListener(this);

		btnRem = new JButton();
		btnRem.setText("%");
		btnRem.setFont(new Font("Arial", Font.BOLD, 18));
		btnRem.setBounds(150, 90, 60, 30);
		panelBtn.add(btnRem);
		btnRem.addActionListener(this);

		btnPow = new JButton();
		btnPow.setText("^");
		btnPow.setFont(new Font("Arial", Font.BOLD, 18));
		btnPow.setBounds(270, 90, 60, 30);
		panelBtn.add(btnPow);
		btnPow.addActionListener(this);

		btnEql = new JButton();
		btnEql.setText("=");
		btnEql.setFont(new Font("Arial", Font.BOLD, 18));
		btnEql.setBounds(30, 150, 60, 30);
		panelBtn.add(btnEql);
		btnEql.addActionListener(this);

		btnClear = new JButton();
		btnClear.setText("C");
		btnClear.setFont(new Font("Arial", Font.BOLD, 18));
		btnClear.setBounds(150, 150, 60, 30);
		panelBtn.add(btnClear);
		btnClear.addActionListener(this);

		btnClose = new JButton();
		btnClose.setText("CLOSE");
		btnClose.setFont(new Font("Arial", Font.BOLD, 12));
		btnClose.setBounds(260, 150, 80, 30);
		panelBtn.add(btnClose);
		btnClose.addActionListener(this);

		// Footer Set
		lblfooter = new JLabel();
		lblfooter.setText("Calculator Design By Anmol Shrestha.");
		lblfooter.setBounds(40, 5, 300, 30);
		lblfooter.setFont(new Font("Arial", Font.BOLD, 14));
		lblfooter.setForeground(Color.BLACK);
		panelDesign.add(lblfooter);

		// Frame layout set & adding
		frame.setLayout(new GridLayout(1, 1));
		frame.add(mainPanel);

		// Frame visible set
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1, num2, num3;

		if (e.getSource() == btnClose) {
			System.exit(0);
		} else if (e.getSource() == btnClear) {
			txt1.setText(null);
			txt2.setText(null);
			txt3.setText("0");
		} else if (e.getSource() == btnAdd) {

			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			Calculator c1 = new Calculator(num1, num2);
			Calculator c2;
			MyCalculator mc = new MyCalculator();

			c2 = mc.calcSum(c1);
			num3 = c2.getNum3();
			String hold = Integer.toString(num3);
			txt3.setText(hold);

		} else if (e.getSource() == btnSub) {
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			Calculator c1 = new Calculator(num1, num2);
			Calculator c2;
			MyCalculator mc = new MyCalculator();

			c2 = mc.calcSub(c1);
			num3 = c2.getNum3();
			String hold = Integer.toString(num3);
			txt3.setText(hold);
			
		} else if (e.getSource() == btnPrd) {
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			Calculator c1 = new Calculator(num1, num2);
			Calculator c2;
			MyCalculator mc = new MyCalculator();

			c2 = mc.calcPrd(c1);
			num3 = c2.getNum3();
			String hold = Integer.toString(num3);
			txt3.setText(hold);
			
		} else if (e.getSource() == btnDiv) {
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			Calculator c1 = new Calculator(num1, num2);
			Calculator c2;
			MyCalculator mc = new MyCalculator();

			c2 = mc.calcDiv(c1);
			num3 = c2.getNum3();
			String hold = Integer.toString(num3);
			txt3.setText(hold);
			
		} else if (e.getSource() == btnRem) {
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			Calculator c1 = new Calculator(num1, num2);
			Calculator c2;
			MyCalculator mc = new MyCalculator();

			c2 = mc.calcRem(c1);
			num3 = c2.getNum3();
			String hold = Integer.toString(num3);
			txt3.setText(hold);
			
		} else if (e.getSource() == btnPow) {
			num1 = Integer.parseInt(txt1.getText());
			num2 = Integer.parseInt(txt2.getText());
			Calculator c1 = new Calculator(num1, num2);
			Calculator c2;
			MyCalculator mc = new MyCalculator();

			c2 = mc.calcPow(c1);
			num3 = c2.getNum3();
			String hold = Integer.toString(num3);
			txt3.setText(hold);
			
		}
	}

	// Main Class start
	public static void main(String[] args) {
		new CalculatorGui(); // Declaration and initialize
	}

}
