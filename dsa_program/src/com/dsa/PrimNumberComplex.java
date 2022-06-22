package com.dsa;
/*Print all primes less than or equal to n
Description
You will be given an integer n. You need to print all the prime numbers that are less than or equal to n in the ascending order.

Input: The input will be in the following format:

The first line should be the value of n.


Output: The output should be in the following format

In the first line, print all the prime numbers that are less than or equal to n in the ascending order and separate them by spaces.


Note: If there is no prime number less than or equal to n, then print ‘There are no prime numbers less than or equal to n'.



Example :

Input A:

19

Output A:

2 3 5 7 11 13 17 19

 */
import java.util.*;;
public class PrimNumberComplex {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        try {
            primesLessThanOrEqualTon(n);
        } catch (NegativeArraySizeException nase){
            System.out.println("There are no prime numbers less than or equal to " +n);
        }
    }

    // Method to print all primes less than or equal to n in ascending order
    static void primesLessThanOrEqualTon(int n) {
        // Write your code here
        boolean prime[] = new boolean[n+1];
        for(int i=0;i<=n;i++) {
            prime[i] = true;
        }
        for(int p = 2; p*p <=n; p++)
        {
            // If prime[p] is not changed, then it is a prime
            if(prime[p] == true)
            {
                // Update all multiples of p
                for(int i = p*p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }

        // Print all prime numbers
        for(int i = 2; i <= n; i++)
        {
            if(prime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}

/*Time Complexcity
O(n∗log(log(n)))

✓ Correct
Feedback:
The outer(i) loop runs for n-1 times from i=2 to i=n. For every iteration of outer(i) loop where i is prime, the inner(j) loop iterates for n/i times because the j value is increased by i for every iteration, and the loop iterates until the j value is less than or equal to n. So, the inner(j) loop is iterated for n/2+n/3+n/5+n/7... times in total. So, the time complexity is O(n*log(log(n))), which is a direct consequence of the fact that the prime harmonic series asymptotically approaches log(log(n)).
 */

/*Optimization - I
Make the required changes to the for loop provided below to make it more efficient in the algorithm given above.

     for (int i = 2; i <= n; i++)
     Ans:  You can change the for loop to for (int i = 2; i*i <= n; i++) to make it more efficient. This will not affect the correctness of the algorithm because a larger factor of n, which is greater than √n, must be a multiple of a smaller factor of n, which is less than √n.


 Optimization- II
Suppose n is extremely large. What is the best alternative to the Boolean array that is used in the algorithm given above to make it more efficient?
Ans: If n is extremely large, then you can use the bitset class instead of the Boolean array because Boolean uses 1 byte for every boolean value, but bitset uses 1 bit for every Boolean value, and for a large n, both will have approximately the same CPU efficiency. So, bitset has an edge over the Boolean array because of its memory efficiency.


 */

/*

import java.util.*;

public class Source {
   public static void main(String args[]) {
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       primesLessThanOrEqualTon(n);
   }

   // Method to print all primes less than or equal to n in ascending order
   static void primesLessThanOrEqualTon(int n) {
       if(n<2){
           System.out.println("There are no prime numbers less than or equal to "+n);
       }
       else {
           boolean[] prime = new boolean[n + 1];
           // Initializing all values in boolean array to true
           Arrays.fill(prime, true);
           for (int i = 2; i <= n; i++)
               if (prime[i])
                   // Marking all multiples of i to false
                   for (int j = 2 * i; j <= n; j += i)
                       prime[j] = false;
           // Printing all primes in ascending order
           for (int i = 2; i <= n; i++)
               if (prime[i])
                   System.out.print(i + " ");
       }
   }
}

 */
