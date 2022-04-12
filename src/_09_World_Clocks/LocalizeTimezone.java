package _09_World_Clocks;


import java.util.TimeZone;

import javax.swing.JTextArea;

public class LocalizeTimezone {
	 JTextArea textArea;
	 
	 TimeZone timeZone;
	 
	    String city;
	    String dateStr;  

public LocalizeTimezone(JTextArea textArea, TimeZone timeZone, String city, String dateStr) {
this.textArea = textArea;

this.timeZone = timeZone;

this.city = city;
this.dateStr = dateStr;
}
}
