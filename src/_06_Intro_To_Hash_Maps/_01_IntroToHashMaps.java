package _06_Intro_To_Hash_Maps;

import java.util.HashMap;

public class _01_IntroToHashMaps {
    public static void main(String[] args) {
        // 1. Create a HashMap called roots with Integers for the keys and Doubles for the values.
HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
        // 2. Using a for-loop, add 500 entries to your HashMap. The key entry will be the 
        //    current iteration of the loop (i). The value entry will be the square root of i.
for (int i = 0; i < 1001; i++) {
hm.put(i, Math.sqrt(i));	
}

        // 3. Iterate through all the entries in your HashMap displaying the keys with their respective
        //    square roots (values). Use the following format.
for(Integer i : hm.keySet()) {
String num = "";
if (hm.get(i) == Math.floor(hm.get(i))) {
num = "" + hm.get(i).intValue();	
}
else {
num = "" + hm.get(i);	
}
System.out.println("The square root of " + i + " is " + num);
}
        //    The square Root of 0 is 0.0
        //    The square Root of 1 is 1.0
        //    The square Root of 2 is 1.4142135623730951
        //    The square Root of 3 is 1.7320508075688772
    }
}
