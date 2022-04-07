package week5_lab_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class GUI {

	JFrame frame;
	JPanel p1, p2, p3;
	JTextField txt1, txt2, txt3;
	JButton btnAdd, btnSub, btnPrd, btnDiv, btnRem, btnPow, btneql, btnClear, btnClose;

	public GUI() {

		frame = new JFrame();

		p1 = new JPanel();
		p1.setBackground(Color.red);
		p1.setBorder(new EmptyBorder(5, 5, 5, 5));
		p1.setLayout(new BorderLayout(0, 0));

		p2 = new JPanel();
		p2.setBackground(Color.green);
		
		p3 = new JPanel();
		p3.setBackground(Color.GRAY);

		txt1 = new JTextField();
		p2.add(txt1);

		txt2 = new JTextField(16);

		txt3 = new JTextField();

		btnAdd = new JButton("+");

		btnSub = new JButton("-");

		btnPrd = new JButton("*");

		btnDiv = new JButton("/");

		btnRem = new JButton("%");

		btnPow = new JButton("^");

		btneql = new JButton("=");

		btnClear = new JButton("C");

		btnClose = new JButton("Close");

		frame.setSize(400, 450);
		frame.setTitle("Calculator");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("Anmol.png"));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(new GridLayout(1, 2));
		frame.add(p1);
		p1.setLayout(new GridLayout(2, 1));
		p1.add(p2);
		p1.add(p3);

		frame.setVisible(true);

	}

	public static void main(String[] args) {
		new GUI();

	}

}
