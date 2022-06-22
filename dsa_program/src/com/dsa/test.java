package com.dsa;

import java.util.Scanner;

public class test {
    /*public static int func(int x, int n) {
        if (n == 0)
            return 1;
        else if(n%2 == 0)
            return func(x*x, n/2);
        else
            return x*func(x*x, n/2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();

        System.out.println(func(x, n) + "\n" );
    }

     */
//    public static int func(int n) {
//        if (n == 1)
//            return 0;
//        else
//            return 1 + func(n/2);
//    }
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int x = s.nextInt();
//
//        System.out.println(func(x) + "\n" );
//    }
    public static void factorial1(int n) {

        int factorial = 1;
        int index = 1;
        for (int i = 0; i <= Math.pow(n, n); i++) {
            if (i == factorial * index) {
                factorial = i;
                index += 1;
                if (index == n + 1) {
                    System.out.println(factorial);
                    break;
                }
            }
        }
    }
     public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        int x = s.nextInt();
      factorial1(x);
   }
}
