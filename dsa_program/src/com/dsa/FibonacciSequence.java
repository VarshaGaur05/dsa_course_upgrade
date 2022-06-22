package com.dsa;
import java.util.*;

public class FibonacciSequence {
    public int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return (fibonacci(n - 1) + fibonacci(n - 2))%10;
    }

    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciSequence sequence = new FibonacciSequence();
        int number = sequence.fibonacci(n);
        System.out.println("Fibonacci number:  " + number);
    }

 /*static int f(int n)
    {
        // Declare an array to store Fibonacci numbers.
        int f[] = new int[n+2]; // 1 extra to handle case, n = 0
        int i;

        //0th and 1st number of the series are 0 and 1
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++)
        {
       // Add the previous 2 numbers in the series and store it
            f[i] = (f(i-1) + f(i-2))%10;
        }

        return f[n];
    }


    public static void main (String args[])
    {
        int n = 9;
        System.out.println(f(n));
    }*/
}

