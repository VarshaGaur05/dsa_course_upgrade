package com.dsa;
/*
Generate All Passwords
Description
You are given a set of characters. You need to generate all possible passwords from them. For this, you need to find all possible permutations of the given characters.



Input Format:

The input contains the number of characters, followed by the characters.



Output Format:

The output contains all the possible passwords.





Sample Test Cases:

Input:

2 x y
 */

import java.util.*;
public class GenerateAllPassword {

    // int cnt;
    // Recursive helper function, adds/removes characters
    // until len is reached
    static void generate(char[] arr, int i, String s, int len)
    {
        // base case
        if (i == 0) // when len has been reached
        {
            System.out.println(s); // print it out
            // cnt++;
            return;
        }
        for (int j = 0; j < len; j++)  // iterate through the array
        {
            // Create new string with next character
            // Call generate again until string has
            // reached its len
            String appended = s + arr[j];
            generate(arr, i - 1, appended, len);
        }

        return;
    }

    static void genPW(char[] arr, int n)
    {
        //Write code here
        // call for all required lengths
        for (int i = 1; i <= n; i++)
        {
            generate(arr, i, "", n);
        }

    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
    }
}
