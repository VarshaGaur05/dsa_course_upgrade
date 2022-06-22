package com.dsa;

public class Demo2 {
    void function(String st) {
        if ((st == null) || (st.length() <= 1))
            System.out.println(st);
        else {
            System.out.print(st.charAt(st.length() - 1));
            function(st.substring(0, st.length() - 1));
        }
    }

    public static void main(String[] args) {
        String st = "abc d efg";
        Demo2 obj = new Demo2();
        obj.function(st);
    }


    //Ans:  gfe d cba
    //
    //✓ Correct
    //Feedback:
    //The string st is passed to the function. In the function, the last character of the string is printed, and the function is recursively called by passing that string but excluding the last character. This recursion terminates when the length of the passed string is lower than or equal to 1; therefore, the output will be the reverse of the passed string.

}
