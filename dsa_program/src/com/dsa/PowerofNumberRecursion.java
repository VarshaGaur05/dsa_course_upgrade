package com.dsa;
/*Power of a number using recursion.
Description
You are given the base and exponent values, and you have to return the power of a given value. The base and exponent values are passed to the function named ‘powerfunc’ wherein you need to write the code. You need to calculate the power of the base value and return the output.



Input: The input will be in the following format:

The first line should have the base value.
The second line should have the value of the exponent to which the exponent is to be raised.
Output: The output should be in the following format:

Power of the given value.



Sample Input:

2

3

Sample Output:

8



Sample Input:

3

2

Sample Output:

9

 */
import java.util.*;

public class PowerofNumberRecursion {
    public static int powerfunc(int base, int power) {
        //write your code here
        if (power == 0) {
            return 1;
        }
        else {
            return base * powerfunc(base, power - 1);
        }

    }
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        int a = inpt.nextInt();
        int b = inpt.nextInt();
        // printing the value of a^b i.e.,
        System.out.printf("%d", powerfunc(a, b));
    }
}
