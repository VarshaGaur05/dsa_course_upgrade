package com.dsa;
/*Print the given pattern using recursion.
Description
An integer value is given to you as an input, and you need to print the pattern for the number of rows given as input. For example:



Sample Input:

5

Sample Output:

*

**

***

****

*****

 */
import java.util.*;

public class Pattern {
    public static String func(int n) {
        //write your code here
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

    /*Trhough recursion
    import java.lang.String;
import java.util.Scanner;

public class Source{
    // function to print the required pattern
    public static String func(int n) {

        if (n <= 0) return "";

        String res = func(n - 1);
        res = res + "*";
        System.out.println(res);

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        func(n);
    }

}

     */
}
