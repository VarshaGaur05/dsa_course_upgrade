package DynamicProgramming;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {
    /* Function to check whether two strings
       are anagram of each other */
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
/*
Anagrams
Description
Two strings are called anagrams of each other if they both contain the same letters in the same frequencies. An example for this would be the word GOD, whose anagrams are: DOG, ODG, OGD, DGO, GDO and GOD.

Write a code which compares two strings S1 and S2 and prints "ANAGRAMS", if the conditions are met, else prints "NOT ANAGRAMS".

Input

The first line contains a string value which denotes S1.
The second line contains a string value which denotes S2.

Ouput

If S1 and S2 meet the conditions of being an Anagram, print ANAGRAMS, else print NOT ANAGRAMS.

Constraints

1 <= Length of S1 <= 20
1 <= Length of S2 <= 20
The characters of the strings should be of the English alphabet.
The comparison should be case-insensitive.

Sample Test Cases

Sample Input

mellow
lemlow

Sample Output

ANAGRAMS

Explanation

Character  |  Frequency in S1  |  Frequency in S2
--------------------------------------------------
  E or e   |         1         |         1
  L or l   |         2         |         2
  M or m   |         1         |         1
  O or o   |         1         |         1
  W or w   |         1         |         1

All the letters of both strings are the same with the same frequency of occurrence, hence ANAGRAMS is printed.
 */
