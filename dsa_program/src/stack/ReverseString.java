package stack;
import java.util.*;

public class ReverseString {
    public static String ReverseWords(String string) {
        String newString = "";
        Stack stack = new Stack();
        int n = string.length();
        for(int i = 0;i<n;i++) {
            if(string.charAt(i) != ' ') {
                stack.push(string.charAt(i));
            } else {
                while(!stack.isEmpty()) {
                    newString = newString + stack.pop();
                }
            }
        }

        newString = newString + " ";
        while(!stack.isEmpty()) {
            newString = newString + stack.pop();
        }

        return newString;
    }

    public static void main(String[] args) {
        String string = "Hi There";
        System.out.print(ReverseWords(string));
    }
}
