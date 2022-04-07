package Swing;

import javax.swing.*;
import java.awt.event.*;

public class PasswordFieldExample {
	public static void main(String[] args) {
		//Declare and initialize
		JFrame f = new JFrame("Anmol");
		JLabel l1 = new JLabel("Username:");
		JLabel l2 = new JLabel("Password:");
		JButton b = new JButton("Login");
		final JTextField text = new JTextField();
		
		//JLabel 
		final JLabel label = new JLabel();
		label.setBounds(20, 150, 200, 50);
		final JPasswordField value = new JPasswordField();
		value.setBounds(100, 75, 100, 30);
		
		//JLabel set
		l1.setBounds(20, 20, 80, 30);
		l2.setBounds(20, 75, 80, 30);
		
		//JButton set
		b.setBounds(100, 120, 80, 30);
		
		//JText set
		text.setBounds(100, 20, 100, 30);
		
		//JFrame objects add
		f.add(value);
		f.add(l1);
		f.add(label);
		f.add(l2);
		f.add(b);
		f.add(text);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setVisible(true);
		
		//Action Listener
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data = "Username " + text.getText();
				data += ", Password: " + new String(value.getPassword());
				label.setText(data);
			}
		});
	}
}