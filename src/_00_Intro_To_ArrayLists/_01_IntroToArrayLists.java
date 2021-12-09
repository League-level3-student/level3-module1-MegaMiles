package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
ArrayList<String> strings = new ArrayList<String>();
        // 2. Add five Strings to your list
strings.add("#1string");
strings.add("#2string");
strings.add("#3string");
strings.add("#4string");
strings.add("#5string");
        // 3. Print all the Strings using a standard for-loop
for (int i = 0; i < strings.size(); i++) {
	 String s = strings.get(i);
}
        // 4. Print all the Strings using a for-each loop
for(String s : strings){
 
}
        // 5. Print only the even numbered elements in the list.
for (int i = 0; i < strings.size(); i++) {
if (i % 2 == 1) {
System.out.println(strings.get(i));	
}
if (i % 2 == 0) {
	System.out.println("Not an even number");
}	
	
}
        // 6. Print all the Strings in reverse order.

        // 7. Print only the Strings that have the letter 'e' in them.
        
    }
}
