package com.dsa;

import java.util.*;


public class simpleapproch {
    static boolean check(int p1, int s1, int p2, int s2) {
        int max = Integer.MAX_VALUE;
        while (p1 < max && p2 < max) {
            if (p1 == p2)
                return true;
            p1 += s1;
            p2 += s2;
        }
        return false;
    }

    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int p1 = s.nextInt();
        int s1 = s.nextInt();
        int p2 = s.nextInt();
        int s2 = s.nextInt();

        boolean answer = check(p1, s1, p2, s2);

        if(answer == true){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }



    }
}
