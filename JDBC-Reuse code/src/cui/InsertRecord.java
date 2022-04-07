package cui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mylibs.MyJDBC2;
import mylibs.Person;

public class InsertRecord extends JFrame implements ActionListener {

	JLabel lbl1, lbl2, lbl3;
	JTextField txt1, txt2, txt3;
	JButton btn1, btn2;

	public InsertRecord() {
		setTitle("Insert New Record");
		setSize(350, 350);
		setResizable(false);
		setLayout(null);

		lbl1 = new JLabel();
		lbl1.setText("ID:");
		lbl1.setBounds(10, 10, 50, 20);
		add(lbl1);

		txt1 = new JTextField();
		txt1.setBounds(100, 10, 150, 20);
		add(txt1);

		lbl2 = new JLabel();
		lbl2.setText("Name:");
		lbl2.setBounds(10, 50, 50, 20);
		add(lbl2);

		txt2 = new JTextField();
		txt2.setBounds(100, 50, 150, 20);
		add(txt2);

		lbl3 = new JLabel();
		lbl3.setText("Address:");
		lbl3.setBounds(10, 90, 50, 20);
		add(lbl3);

		txt3 = new JTextField();
		txt3.setBounds(100, 90, 150, 20);
		add(txt3);

		btn1 = new JButton();
		btn1.addActionListener(this);
		btn1.setText("Close");
		btn1.setFocusable(false);
		btn1.setBounds(50, 130, 70, 40);
		add(btn1);

		btn2 = new JButton();
		btn2.addActionListener(this);
		btn2.setText("Save");
		btn2.setFocusable(false);
		btn2.setBounds(150, 130, 70, 40);
		add(btn2);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn1) {
			int id = Integer.parseInt()
		}

	}

	public static void main(String[] args) {
		new InsertRecord();
	}

}
