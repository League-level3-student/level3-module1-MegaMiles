package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	JButton button1 = new JButton("Add name");
	JButton button2 = new JButton("View names");
public static void main(String[] args) {
_02_GuestBook book = new _02_GuestBook();
book.ActionListeners();
}
public void ActionListeners() {
	//creating frame, panel, and buttons
JFrame frame = new JFrame();	
JPanel panel = new JPanel();

//adding uses for the frame,panel, and buttons	
frame.add(panel);
panel.add(button1);
panel.add(button2);
frame.setVisible(true);
button1.addActionListener(this);
button1.addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e) {
//logic and stuff
if (e.getSource() == button1) {
String names = JOptionPane.showInputDialog("Please enter a name to the guest book");		
}
if (e.getSource() == button2) {
JOptionPane.showMessageDialog(null,"Here are the names in the guest book as follows ");	
JOptionPane.showMessageDialog(null,"Guest #1 is " + );	
}

}
}















