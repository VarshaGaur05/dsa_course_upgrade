package com.dsa;

public class Demo1 {
    int i = 1;

    int function() {
        if (i <= 5) {
            System.out.print(i++ + " ");
            function();
        }
        return 0;
    }

    public static void main(String[] args) {
        Demo1 obj = new Demo1();
        obj.function();
    }
}
