package stack;

import java.util.Scanner;
import java.util.Stack;

public class ReversStringStack {
    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);
        String data = in.nextLine();
        //write your code here
        System.out.println(reversString(data));
    }

    static String reversString(String data) {
        char[] reverseString = new char[data.length()];
        // Declare a stack of type Character
        Stack<Character> stack = new Stack<Character>();

        // Traverse the String and push the character one by
        // one into the Stack
        for (int i = 0; i < data.length(); i++) {
            // push the character into the Stack
            stack.push(data.charAt(i));
        }

        // Now Pop the Characters from the stack until it
        // becomes empty

        int i = 0;
        while (!stack.isEmpty()) { // popping element until
            // stack become empty
            // get the character from the top of the stack
            reverseString[i++] = stack.pop();
        }
        // return string object
        return new String(reverseString);
    }

}
/*
Reverse a string using a stack.
Description
You are given a string and you have to print the reverse of the string using a stack.

Input Format
A string which has to be reversed.
Output Format
The reverse of the input string
Sample Input 1:
abcd
Sample Output 1:
dcba
Sample Input 2:
abcdef
Sample Output 2:
fedcba
 */
