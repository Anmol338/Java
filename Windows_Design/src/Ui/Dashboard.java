package Ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//Dashboard Class and inherit the properties of JFrame
public class Dashboard extends JFrame implements ActionListener {

	// Initial Variables
	JPanel pnlbutton, pnlWindow;
	JButton btnReg, btnLog, btnClose;

	// Dashboard Function
	public Dashboard() {
		// Define Frame
		setTitle("Hotel Luton");
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Initialize and memory allocation
		pnlbutton = new JPanel();
		pnlbutton.setBackground(Color.BLACK);
		pnlbutton.setPreferredSize(new Dimension(200, 500));
		pnlbutton.setLayout(null);

		pnlWindow = new JPanel();
		pnlWindow.setBackground(Color.RED);

		btnReg = new JButton("Registration");
		btnReg.setBounds(40, 50, 120, 30);
		btnReg.setFocusable(false);
		btnReg.addActionListener(this);
		pnlbutton.add(btnReg);

		btnLog = new JButton("Log In");
		btnLog.setBounds(40, 100, 120, 30);
		btnLog.setFocusable(false);
		btnLog.addActionListener(this);
		pnlbutton.add(btnLog);

		btnClose = new JButton("Close");
		btnClose.setBounds(40, 150, 120, 30);
		btnClose.setFocusable(false);
		btnClose.addActionListener(this);
		pnlbutton.add(btnClose);
		
		// Adding into main function
		add(pnlbutton, BorderLayout.WEST);
		add(pnlWindow, BorderLayout.CENTER);

		// Frame visible status
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==btnReg) {
			new RegistrationWindow();
			this.setVisible(false);
		}else if(ae.getSource()==btnLog) {
			new LogInWindow();
			this.setVisible(false);
		}else if(ae.getSource()==btnClose) {
			System.exit(0);
		}
	}
	
	// Main Function
	public static void main(String[] args) {
		new Dashboard();
	}
}
