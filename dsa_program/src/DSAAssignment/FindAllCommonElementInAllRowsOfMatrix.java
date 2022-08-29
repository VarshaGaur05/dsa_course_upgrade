package DSAAssignment;
import java.util.*;

public class FindAllCommonElementInAllRowsOfMatrix {
    public static void printElementInAllRows(int mat[][], int M, int N) {
        // Write code here
        int arr[] = new int[M*N];
        int count=0;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < N; i++)
            mp.put(mat[0][i],1);
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (mp.get(mat[i][j]) != null && mp.get(mat[i][j]) == i) {
                    mp.put(mat[i][j], i + 1);

                    if (i == M - 1)
                        arr[count++]= mat[i][j];
                }
            }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=0)
                System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix, row, col);
    }
}
/*
Find All Common Element in Each Row of Matrix
Description
Given an M x N matrix of integers, find all the common elements that are present in all rows of the given matrix in O(M * N) time.

For example, take a look at the matrix given below.

11 12 11 14 18

13 17 18 15 11

18 17 17 13 11

18 11 12 17 19

In this matrix, 11 and 18 appear in each row. Hence, 11 and 18 will be the common elements that are present in each row.



Note that if multiple common elements are present in each row, you need to print them in ascending order.





Input Format:

The first line contains two integers M as the number of rows and N as the number of columns.

From the next line, there are N elements in a line up to M lines, representing the elements of the matrix.



Output Format:

The output contains all the common elements that are present in each row of the given matrix, printed in ascending order.





Sample Test Cases:

Input:

4 5

11 12 11 14 18

13 17 18 15 11

18 17 17 13 11

18 11 12 17 19



Output:

11 18





Input:

4 4

17 12 11 10

13 17 10 15

10 17 17 13

12 11 10 17



Output:

10 17
 */
