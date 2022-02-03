package _06_Intro_To_Hash_Maps;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;

public class _02_LogSearch implements ActionListener {

//Creating all the frames/panels/buttons/hashmaps
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Entry");
	JButton button2 = new JButton("Search by ID");
	JButton button3 = new JButton("Veiw List");
	JButton button4 = new JButton("Remove Entry");
	HashMap<Integer, String> idandname = new HashMap<Integer, String>();

//Weird stuff
	public static void main(String[] args) {
		_02_LogSearch log = new _02_LogSearch();
		log.setup();
	}

	public void setup() {
//Adding stuff to each other
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
//other random stuff
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

//button method/more rando stuff
	@Override
	public void actionPerformed(ActionEvent e) {

//  	 Crate a HashMap of Integers for the keys and Strings for the values.
// 		 Create a GUI with three buttons.
// 		 Button 1: Add Entry
//       When this button is clicked, use an input dialog to ask the user
//       to enter an ID number.
//       After an ID is entered, use another input dialog to ask the user
//       to enter a name. Add this information as a new entry to your
//       HashMap.

		if (e.getSource() == button1) {
			String IDnumber = JOptionPane.showInputDialog(null, "Please enter an ID number below");
			String Name = JOptionPane.showInputDialog(null, "Please enter a name below");
			idandname.put(Integer.parseInt(IDnumber), Name);
		}

//		Button 2: Search by ID
//		When this button is clicked, use an input dialog to ask the user
//		to enter an ID number.
//		If that ID exists, display that name to the user.
//		Otherwise, tell the user that that entry does not exist.

		if (e.getSource() == button2) {
			String ID = JOptionPane.showInputDialog(null, "Please enter an ID number below");
			Integer convertedID = Integer.parseInt(ID);
			if (idandname.containsKey(convertedID)) {
				JOptionPane.showMessageDialog(null, idandname.get(convertedID) + " is the name you are looking for");
			} else {
				JOptionPane.showMessageDialog(null, "Error 404 : Entry not found ; Please try again");
			}
		}
		
//		Button 3: View List
//		When this button is clicked, display the entire list in a message
//		dialog in the following format:
//		ID: 123  Name: Harry Howard
//		ID: 245  Name: Polly Powers
//		ID: 433  Name: Oliver Ortega
//		etc...

		if (e.getSource() == button3) {
			String ValuesAndNames = "";
			for (Integer Key : idandname.keySet()) {
				ValuesAndNames += "ID: " + Key + "  ";
				ValuesAndNames += "Name: " + idandname.get(Key) + "\n";
			}
			JOptionPane.showMessageDialog(null, "Here are the IDs and names " + "\n" + ValuesAndNames);
		}

	

//      When this is complete, add a fourth button to your window.
//      Button 4: Remove Entry
//           When this button is clicked, prompt the user to enter an ID using
//           an input dialog.
//           If this ID exists in the HashMap, remove it. Otherwise, notify the
//          user that the ID is not in the list.

	if (e.getSource() == button4) {
			String ID = JOptionPane.showInputDialog(null, "Please enter an ID number to be removed below");
			Integer convertedID = Integer.parseInt(ID);
			if (idandname.containsKey(convertedID)) {
idandname.remove(convertedID);
JOptionPane.showMessageDialog(null, "The ID and name coresponding with it have been removed... Forever");				
			} else {
				JOptionPane.showMessageDialog(null, "Error 404 : Entry not found ; Please try again");
		}
	}
}
}





























