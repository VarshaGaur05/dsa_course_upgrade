package stack;

import java.util.Scanner;

public class ParenthesisMatching {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println(match(in.nextLine()));
    }

    public static boolean match(String parens) throws Exception {
        //write your code here
        int count = 0;
        char[] chars = parens.toCharArray();
        for (char c : chars) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                if (count > 0) {
                    count--;
                } else {
                    return false;
                }
            } else {
                throw new Exception("Invalid character " + c);
            }
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }

    }
}

/*
Parentheses matching.
Description
You are given a string of parentheses to the method then you have to check whether the parentheses are well-formed in the string or not. Return true if the parentheses are well-formed otherwise return false.

Input Format
 The input will be string of parentheses
Output Format
Return true if the parentheses are well-formed in the string, Otherwise return false.
Sample Input 1 :
(())
Sample Output 1:
true
Sample Input 2:
))((
Sample Output 2:
false
 */
