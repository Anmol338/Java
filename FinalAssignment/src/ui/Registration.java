package ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Registration extends JFrame implements ActionListener {

	JPanel panel;
	JLabel label;
	JRadioButton btnMale, btnFemale, btnOthers;

	public Registration() {
		setTitle("Registration");
		setBounds(500, 150, 900, 600);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

//		ImageIcon bg_img = new ImageIcon("images.jpg");
//		Image img = bg_img.getImage();
//		Image temp_img = img.getScaledInstance(900, 600, Image.SCALE_SMOOTH);
//		bg_img = new ImageIcon(temp_img);
//		JLabel background = new JLabel("",bg_img,JLabel.CENTER);
//		background.setBounds(0, 0, 900, 600);
//		add(background);

//		panel = new JPanel();
//		panel.setBounds(0, 0, 500, 500);
//		panel.setBackground(Color.BLACK);
//		add(panel);

		panel = new JPanel();
		panel.setBounds(20, 20, 100, 30);
		panel.setBackground(Color.CYAN);
		add(panel);

		label = new JLabel();
		label.setText("Gender : ");
		label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label.setBounds(20, 20, 100, 20);
		panel.add(label);

		btnMale = new JRadioButton("Male");
		btnMale.addActionListener(this);
		btnFemale = new JRadioButton("Female");
		btnFemale.addActionListener(this);
		btnOthers = new JRadioButton("Others");
		btnOthers.addActionListener(this);

		btnMale.setBounds(130, 20, 100, 30);
		btnMale.setFocusable(false);
		add(btnMale);

		btnFemale.setBounds(240, 20, 120, 30);
		btnFemale.setFocusable(false);
		add(btnFemale);

		btnOthers.setBounds(370, 20, 120, 30);
		btnOthers.setFocusable(false);
		add(btnOthers);

		ButtonGroup bg = new ButtonGroup();
		bg.add(btnMale);
		bg.add(btnFemale);
		bg.add(btnOthers);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMale) {
			System.out.println("Male");
		} else if (e.getSource() == btnMale) {
			System.out.println("Female");
		}else if(e.getSource()==btnOthers){
			System.out.println("Others");
		}else {
			System.out.println("Error");
		}

	}

	public static void main(String[] args) {
		new Registration();
	}

}
