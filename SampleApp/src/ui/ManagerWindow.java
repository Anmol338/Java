package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ManagerWindow extends JFrame implements ActionListener{

	JButton btnRoom, btnCustomer, btnBooking;

	public ManagerWindow() {
		setTitle("Welcome To Manager Window");
		setBounds(550, 150, 400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);

		btnRoom = new JButton("Rooms");
		btnRoom.setBounds(20, 20, 150, 30);
		btnRoom.setFocusable(false);
		btnRoom.addActionListener(this);
		
		
		btnCustomer = new JButton("Customers");
		btnCustomer.setBounds(20, 60, 150, 30);
		btnCustomer.setFocusable(false);
		
		btnBooking = new JButton("Bookings");
		btnBooking.setBounds(20, 100, 150, 30);
		btnBooking.setFocusable(false);
		
		add(btnRoom);
		add(btnCustomer);
		add(btnBooking);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRoom) {
			new RoomWindow();
		}
		
	}

	public static void main(String[] args) {
		new ManagerWindow();
	}

}
