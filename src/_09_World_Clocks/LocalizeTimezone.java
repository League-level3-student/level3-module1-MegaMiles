package _09_World_Clocks;


import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class LocalizeTimezone {
	JFrame frame;
    JTextArea textArea;
	 
    TimeZone timeZone;
	 
    String city;
    String dateStr;  

public LocalizeTimezone(JTextArea textArea, TimeZone timeZone, String city, String dateStr, JFrame frame) {
this.textArea = textArea;
this.frame = frame;

this.timeZone = timeZone;

this.city = city;
this.dateStr = dateStr;
}
}
