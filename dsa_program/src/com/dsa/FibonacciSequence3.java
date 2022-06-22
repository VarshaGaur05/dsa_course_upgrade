package com.dsa;

public class FibonacciSequence3 {
    public int fibonacci(int n) {
        int a = 0, b = 1, c = n;
        for (int i=2; i<=n; i++){
            c = (a + b);
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        FibonacciSequence3 fibonacci = new FibonacciSequence3();
        System.out.println(fibonacci.fibonacci(100000));
    }
}
