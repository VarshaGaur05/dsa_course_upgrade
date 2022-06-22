package com.dsa;
/*Two people meet each other
Description
You will be given starting points of two people p1 and p2 respectively and the distance covered by two people in each jump is s1 and s2, respectively. You need to find whether they meet after the same number of jumps from their starting points. The starting points of the two persons should always be different.



Input: The input will be in the following format :

The first line should be the values of p1 and p2 respectively space-separated.
The second line should be the values of s1 and s2 respectively space-separated.


Output: The output should be of the following format:

Print ‘YES’ if they meet at some point after jumping for an equal number of times; otherwise, print ‘NO’.


Example :

Input :

6 8

3 2

Output:

YES



 */
import java.util.*;

/* time complexcity O(1)

✓ Correct
Feedback:
There are no loops in the algorithm, and the method is also called only once. So, this algorithm takes the constant time, i.e., the time complexity is O(1).

 */

public class TwoPeopleDistance {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int p2 = s.nextInt();
        int s1 = s.nextInt();
        int s2 = s.nextInt();
        twoPeopleMeet(p1, p2, s1, s2);
        if(twoPeopleMeet(p1, p2, s1, s2))
            System.out.println("YES" );
        else
            System.out.println("NO");
    }

    // Method to find whether two people meet after jumping for the same number of times
    static boolean twoPeopleMeet(int p1, int p2, int s1, int s2) {
        // Write your code here
        return ( (s1 > s2 && (p2 - p1) %
                (s1 - s2) == 0) ||
                (s2 > s1 && (p1 - p2)
                        % (s2 - s1) == 0));


    }

}
