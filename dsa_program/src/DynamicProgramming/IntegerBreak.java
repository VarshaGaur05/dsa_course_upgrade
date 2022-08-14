package DynamicProgramming;

import java.util.Scanner;

public class IntegerBreak {

    static int[] dp = new int[10005];
    private static int func(int n) { // mean number should be divided for sure
        if(n==1) return 1;
        //int ans = 0;
        if(dp[n] != -1) return dp[n];
        int ans = Integer.MAX_VALUE;

        for(int i=1; i<n; i++) {
            ans = Math.max(ans, i*func(n-i)); // is dividing n-i
            ans = Math.max(ans, i*(n-i)); // not dividing n-i
        }

        //return ans;
        return dp[n] = ans;
    }

    public static int integerBreak(int n) {
        for(int i=0; i<=n; i++) dp[i] = -1;
        return func(n);
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        // Enter the number n
        int n = scan.nextInt();
        System.out.println(integerBreak(n));
        scan.close();
    }
}
