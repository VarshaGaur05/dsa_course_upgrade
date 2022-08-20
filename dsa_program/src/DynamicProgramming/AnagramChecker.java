package DynamicProgramming;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class AnagramChecker {
	public static void main(String args[] ) throws Exception {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String string1 = in.nextLine();
        String string2 = in.nextLine();
        
        if(CompareCharFreq(string1,string2)) {
        	System.out.println("ANAGRAMS");
        }else {
        	System.out.println("NOT ANAGRAMS");
        }
        
	}
	
 static boolean CompareCharFreq(String string1, String string2){
	 HashMap<Character, Integer> map1 = new HashMap<>();
	 
     char[] str1Array = string1.toCharArray();

     for (char c : str1Array) {
         if (map1.containsKey(c)) {
        	 map1.put(c, map1.get(c) + 1);
         }
         else {

        	 map1.put(c, 1);
         }
     }
     
HashMap<Character, Integer> map2 = new HashMap<>();
	 
     char[] str2Array = string2.toCharArray();

     for (char i : str2Array) {
         if (map2.containsKey(i)) {
        	 map2.put(i, map2.get(i) + 1);
         }
         else {

        	 map2.put(i, 1);
         }
     }
     
	return map1.equals(map2);
 }
 
 
}
 
 
