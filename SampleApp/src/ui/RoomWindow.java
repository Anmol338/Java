package ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoomWindow extends JFrame implements ActionListener{

	JButton btnAddRoom, btnEditRoom, btnDeleteRoom, btnAllRoom;
	JPanel panel1,panel2;

	public RoomWindow() {
		setTitle("Welcome To Room Management");
		setBounds(550, 150, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		

		btnAddRoom = new JButton("Add");
		btnAddRoom.setBounds(20, 20, 150, 30);
		btnAddRoom.setFocusable(false);
		btnAddRoom.addActionListener(this);

		btnEditRoom = new JButton("Edit");
		btnEditRoom.setBounds(20, 60, 150, 30);
		btnEditRoom.setFocusable(false);
		btnEditRoom.addActionListener(this);

		btnDeleteRoom = new JButton("Delete");
		btnDeleteRoom.setBounds(20, 100, 150, 30);
		btnDeleteRoom.setFocusable(false);
		btnDeleteRoom.addActionListener(this);

		btnAllRoom = new JButton("Display All");
		btnAllRoom.setBounds(20, 140, 150, 30);
		btnAllRoom.setFocusable(false);
		btnAllRoom.addActionListener(this);

		panel1 = new JPanel();
		panel1.setLayout(null);
		
		panel2=new JPanel();
		panel2.setLayout(null);
		
		panel1.add(btnAddRoom);
		panel1.add(btnEditRoom);
		panel1.add(btnDeleteRoom);
		panel1.add(btnAllRoom);
		
		setLayout(new GridLayout(1,2));
		add(panel1);
		add(panel2);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnAddRoom) {
			
		}else if(e.getSource()==btnEditRoom) {
			
		}else if(e.getSource()==btnDeleteRoom) {
			
		}else if(e.getSource()==btnAllRoom) {
			
		}
	}

	public static void main(String[] args) {
		new RoomWindow();
	}

	

}
