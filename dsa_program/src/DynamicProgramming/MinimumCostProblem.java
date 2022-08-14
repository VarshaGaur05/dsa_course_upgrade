package DynamicProgramming;

import java.util.Scanner;

public class MinimumCostProblem {

    static int min(int x, int y, int z)
    {
        if (x < y)
            return (x < z) ? x : z;
        else
            return (y < z) ? y : z;
    }
    private static int minCost(int cost[][], int m, int n)
    {
        int minCost[][]=new int[m+1][n+1];
        /* Initialise the first column of the minimum cost (table) array */

        /* Initialise the first row of the table array */
        /* Construct the rest of the table array from the recursion relation */
        if (n < 0 || m < 0)
            return Integer.MAX_VALUE;
        else if (m == 0 && n == 0)
            return cost[m][n];
        else
            return cost[m][n] +
                    min( minCost(cost, m-1, n-1),
                            minCost(cost, m-1, n),
                            minCost(cost, m, n-1) );
        //return minCost[m][n];
    }

    public static void main(String args[])
    {
        int cost[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
        Scanner scan = new Scanner(System.in);
        int xCoordinate = scan.nextInt();
        int yCoordinate = scan.nextInt();
        System.out.println(minCost(cost,xCoordinate,yCoordinate));
    }
}

/*
Minimum Cost Problem
Description
Problem Statement:
Write the code such that given the destination in terms of the x and y coordinates, your code prints the minimum cost to reach the destination.

The input format should take values as the x coordinate of the destination in the first line followed by its y coordinate in the next.
The output should print the minimum cost to reach the destination taken from the input.

Sample input
1
1
Sample output
9

Sample input
2
2
Sample output
8

Note that matrix cost[][] with values has already been inserted in the code stub.
 */
