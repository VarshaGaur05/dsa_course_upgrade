package DynamicProgramming;

import java.util.Scanner;

public class SumOfPerfactSquare {
    static int[] dp = new int[10005];

    private static int func(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n] != -1) return dp[n];
        int ans = Integer.MAX_VALUE;

        for(int i=1; i*i<=n; i++) {
            ans = Math.min(ans, 1 + func(n-i*i));
        }
        return dp[n] = ans;
    }

    public static int numSquares(int n) {
        for(int i=0; i<=n; i++) dp[i] = -1; // value not yet calculated
        return func(n);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(numSquares(n));
        scan.close();
    }
}
