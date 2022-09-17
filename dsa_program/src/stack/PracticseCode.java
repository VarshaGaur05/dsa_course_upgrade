package stack;

import java.util.*;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PracticseCode {

    public static Queue<Integer> queue = new LinkedList<>();

    public static int Push(){
        int num =0;
        if(queue.size()<= 0){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        while (num != queue.size()-1){
            int ele = queue.remove();
            queue.add(ele);
            num++;
        }
        return queue.remove();
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0 ; i<n ;i++){
            queue.add(scan.nextInt());
        }

        int result;

        result = Push();
        System.out.println(result);

        result = Push();
        System.out.println(result);

        return;

    }
}
