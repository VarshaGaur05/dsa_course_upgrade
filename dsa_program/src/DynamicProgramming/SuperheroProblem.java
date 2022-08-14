package DynamicProgramming;
import java.util.*;

public class SuperheroProblem {
    public static int minJump(int n)
    {
        int f[] = new int[n+1];
        /* Declare an array to store the minimum jumps. */
        f[1] = 0;
        f[2] = 1;
        /* Initialise the base condition */
        /* Fill in the array to find Minimum Jumps from a certain distance */
        for(int i=2; i<=n; i++) {
            if(i%2==0 && i%3==0) {
                f[i] = Math.min(Math.min(f[i-1]+1, f[i/2]+1), f[i/3] + 1);
            }
            if(i%2==0) {
                f[i] = Math.min(f[i-1]+1, f[i/2]+1);
            }else if(i%3==0) {
                f[i] = Math.min(f[i-1]+1, f[i/3] + 1);
            }else{
                f[i] = f[i-1]+1;
            }
        }
        return f[n];
    }

    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if(distance>0){
            System.out.println(minJump(distance));
        }
        else {
            System.out.println("Distance should be a positive integer");
        }

    }

}
/* Upgard solution
import java.util.Scanner;
public class Source
{
  	public static int min(int m, int n){
  		return m>n ? n: m;
    }

    public static int minJump(int n)
    {
        int f[] = new int[n+1];

        // Initialize the base condition
        f[1] = 0;


                //Fill in the array to find Minimum Jumps from a certain distance
                int i,x;
                for (i = 2; i <= n; i++)
                {
                x = f[i-1];
                if(i%2==0){
                x = min(f[i/2], x);
                }
                if(i%3==0){
                x = min(x, f[i/3]);
                }
                f[i]=x + 1;
                }
                return f[n];
                }

public static void main (String args[])
        {
        Scanner scan = new Scanner(System.in);
        int distance = scan.nextInt();
        if(distance>0){
        System.out.println(minJump(distance));
        }
        else {
        System.out.println("Distance should be a positive integer");
        }
        }
        }

 */
/*
Superhero Problem
Description
Write the code that gives an output of the minimum number of jumps required to reach the destination provided, considering the following restrictions:

A. Jumping Jack can only jump to a distance that is one kilometre less than the current distance.

B. He can only jump a distance that is half the current distance.

C. He can only jump a distance that is ⅓rd the current distance.



The input takes the value of the location away from the destination.
The output displays the value of the minimum jumps required to reach the destination.


Sample Input

6

Sample Output

2



Sample Input

10

Sample Output

3
 */
