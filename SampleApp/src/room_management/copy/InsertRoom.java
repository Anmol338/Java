// Package Room_MAnagement
package room_management.copy;

//Import library
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mylibs.Global;
import mylibs.JDBCRoom;
import mylibs.Room;


// Main class
//Inherit the JFrame
//Implement ActionListener and ItemListener
public class InsertRoom extends JFrame implements ActionListener, ItemListener {

	//Object Declare
	JLabel lblId, lblType, lblRate, lblStatus;
	JTextField txtId, txtRate;
	JComboBox cmbType, cmbStatus;
	JButton btnSave, btnClose;

	// Insert Room Class
	public InsertRoom() {
		setTitle("Insert New Room");
		setBounds(600, 250, 350, 400);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		lblId = new JLabel("ID : ");
		lblId.setBounds(10, 60, 90, 30);
		add(lblId);

		txtId = new JTextField();
		txtId.setBounds(90, 60, 200, 30);
		add(txtId);

		lblType = new JLabel("Type : ");
		lblType.setBounds(10, 110, 90, 30);
		add(lblType);

		cmbType = new JComboBox();
		for (int i = 0; i < Global.ROOM_TYPES.length; i++) {
			cmbType.addItem(Global.ROOM_TYPES[i]);
		}
		;
		cmbType.setBounds(90, 110, 200, 30);
		cmbType.addItemListener(this);
		add(cmbType);

		lblRate = new JLabel("Rate : ");
		lblRate.setBounds(10, 150, 90, 30);
		add(lblRate);

		txtRate = new JTextField();
		txtRate.setBounds(90, 150, 200, 30);
		add(txtRate);

		lblStatus = new JLabel("Status : ");
		lblStatus.setBounds(10, 190, 90, 30);
		add(lblStatus);

		cmbStatus = new JComboBox();
		for (int i = 0; i < Global.ROOM_STATUS.length; i++) {
			cmbStatus.addItem(Global.ROOM_STATUS[i]);
		}
		;
		cmbStatus.setBounds(90, 190, 200, 30);
		cmbStatus.addItemListener(this);
		add(cmbStatus);

		btnSave = new JButton("SAVE");
		btnSave.setBounds(70, 250, 100, 30);
		btnSave.setFocusable(false);
		btnSave.addActionListener(this);
		add(btnSave);

		btnClose = new JButton("CLOSE");
		btnClose.setBounds(180, 250, 100, 30);
		btnClose.setFocusable(false);
		btnClose.addActionListener(this);
		add(btnClose);

		setVisible(true);
	}
	


	//Action Performed
	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btnSave) {
			// save record
			Room room = new Room();
			room.setId(Integer.parseInt(txtId.getText()));
			room.setType(cmbType.getSelectedItem().toString());
			room.setRate(Double.parseDouble(txtRate.getText()));
			room.setStatus(cmbStatus.getSelectedItem().toString());

			JDBCRoom jdbc = new JDBCRoom();
			boolean result = jdbc.insert(room);
			if (result == true) {
				System.out.println("Save room");
			} else {
				System.out.println("Error to save room");
			}

		} else if (ae.getSource() == btnClose) {
			// exit
			System.exit(0);
		}
	}

	//Item State Change
	@Override
	public void itemStateChanged(ItemEvent ie) {
		if (ie.getSource() == cmbType) {
			int index = cmbType.getSelectedIndex();
			txtRate.setText(Double.toString(Global.ROOM_RATE[index]));
		}
	}

	//Main Function
	public static void main(String[] args) {
		new InsertRoom();
	}

}
