package Queues;
import java.util.*;

public class DuplicateParanthesis {
    public static boolean findDuplicateParenthesis(String inputString) {
        //write your code here
        // create a stack of characters
        Stack<Character> Stack = new Stack<>();

        // Iterate through the given expression
        char[] str = inputString.toCharArray();
        for (char ch : str) {
            // if current character is close parenthesis ')'
            if (ch == ')') {
                // pop character from the stack
                char top = Stack.peek();
                Stack.pop();

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } // push open parenthesis '(', operators and
            // operands to stack
            else {
                Stack.push(ch);
            }
        }

        // No duplicates found
        return false;
    }


    public static void main(String[] args){
        DuplicateParanthesis obj = new DuplicateParanthesis();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        obj.findDuplicateParenthesis(inputString);

        if (obj.findDuplicateParenthesis(inputString)== true) {
            System.out.println("Input string contains duplicate parenthesis");
        } else {
            System.out.println("Input string does not contain duplicate parenthesis");
        }

    }

}

/* Upgrade solution

import java.util.*;
class Source {
    public static String findDuplicateParenthesis(String inputString) {

        Stack<Character> stack = new Stack();
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch != ')') {
                stack.push(ch);
            } else {
                char top = stack.peek();
                stack.pop();
                int count = 0;
                while (top != '(') {
                    top = stack.peek();
                    stack.pop();
                    count++;
                }
                if (count <= 1) {
                    return "Input string contains duplicate parenthesis";
                }
            }
        }
        return "Input string does not contain duplicate parenthesis";

    }


        public static void main(String[] args){
            Source obj = new Source();
            String inputString = new String();
            Scanner in = new Scanner(System.in);
            inputString = in.nextLine();
            System.out.println(obj.findDuplicateParenthesis(inputString));

        }

    }



 */
/*
Detect duplicate parenthesis
Description
Write a program that can evaluate a given balanced expression for the duplicate parenthesis if it contains. If the expression includes duplicate parenthesis then print “Input string contains duplicate parenthesis” else print “Input string does not contain duplicate parenthesis”.

Your application should take the following as input:
The input string in a single line without any space between the characters.

Note: The program should only test for duplicate parenthesis which means the other brackets ‘{‘ or ‘[‘ will be just as normal characters like ‘a’ or ‘1’
Sample Input:
(((a+1))+(b+1))

Sample output:
Input string contains duplicate parenthesis
Sample Input:
(909)

Sample output:
Input string does not contain duplicate parenthesis
 */
