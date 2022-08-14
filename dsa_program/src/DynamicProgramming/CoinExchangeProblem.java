package DynamicProgramming;
import java.util.*;


public class CoinExchangeProblem {
    public static int count(int[] d, int amount) {

        int[][] V = new int[amount + 1][d.length];

        /* Write down the base solution*/
        int n = d.length;

        int T[][] = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) {
            T[i][0] = 1;
        }

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= amount; j++)
            {
                if (d[i - 1] > j) {
                    T[i][j] = T[i - 1][j];
                }
                else {
                    T[i][j] = T[i - 1][j] + T[i][j - d[i - 1]];
                }
            }
        }
        /* Fill in the rest of the matrix using recursion relation */
        return T[n][amount];
        //return V[d.length-1][amount];
    }

    public static void main(String args[]) {
        int[] d = {1,5,7,10};
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(count(d, amount));
        scan.close();
    }

}
/*Upgrad solution
import java.util.Scanner;
class Source {
    public static int count(int[] d, int amount) {

        int[][] V = new int[amount + 1][d.length];

       // Write down the base solution
int i, j , x, y;
        for (j = 0; j < d.length; j++) {
        V[0][j] = 1;
        }

        // Fill in the rest of the matrix using recursion relation
        for (i = 1; i < amount+1; i++) {
        for (j = 0; j < d.length; j++) {
        x = (i-d[j] >= 0)? V[i - d[j]][j]: 0;
        y = (j >= 1)? V[i][j-1]: 0;
        V[i][j] = x + y;
        }
        }
        return V[amount][d.length-1];
        }

public static void main(String[] args) {
        int[] d = {1,5,7,10};
        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(count(d, amount));
        scan.close();
        }
        }
 */
/*
Coin Exchange Problem
Description
Problem Statement :-

Given an unlimited supply for few denominations [1,5,7,10] and an amount n, your code should output the number of ways the amount can be paid from the given denominations.



The input should have the amount n, the amount for which you have to find the number of ways.
The output should print the number of ways the amount can be paid.


Sample Input

20

Sample Output

15



Sample Input

12

Sample Output

6
 */
