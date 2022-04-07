package com.GUI;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Interesting Title");
		JLabel label= new JLabel();
		label.setText("Hello World");
		frame.setSize(1080,720);
		frame.setVisible(true);
		frame.add(label);
	}
}
