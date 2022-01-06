package _00_Intro_To_ArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

ArrayList<String> names = new ArrayList<String>();
public void ActionListeners() {
	//creating frame, panel, and buttons
JFrame frame = new JFrame();	
JPanel panel = new JPanel();

//adding uses for the frame, panel, and buttons	
frame.add(panel);
panel.add(button1);
panel.add(button2);
frame.setVisible(true);
button1.addActionListener(this);
button2.addActionListener(this);
frame.pack();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
@Override
public void actionPerformed(ActionEvent e) {
//logic and stuff
if (e.getSource() == button1) {
String name = JOptionPane.showInputDialog("Please enter a name to the guest book");	
names.add(name);
}
int num = 1;
if (e.getSource() == button2) {
	
for (int i = 0; i < names.size(); i++) {
String name1 = names.get(i);
System.out.println("Guest #" + (i+1) + " is " + name1);
}	
	

}

}
}















