package GraphAlgorithm;

import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {

    class RowCol {
        int row;
        int col;

        RowCol(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int calculateDays(int[][] tray) {
        // tray[i][j] = 0 -> Rotten Orange
        // tray[i][j] = 1 -> Good orange
        // tray[i][j] = 2 -> no orange

        Queue<RowCol> queue = new LinkedList<>();
        for(int i=0; i<tray.length; i++) {
            for(int j=0; j<tray[i].length; j++) {
                if(tray[i][j] == 0) queue.add(new RowCol(i,j));
            }
        }

        int days = 0;

        while(queue.size() > 0) {
            int noOfRottenOranges = queue.size();
            for(int i=0; i<noOfRottenOranges; i++) {
                RowCol curr = queue.poll();
                int currRow = curr.row;
                int currCol = curr.col;

                // (currRow-1, currCol-1), (currRow-1, currCol), (currRow-1, currCol+1)
                // (currRow, currCol-1), (currRow, currCol+1)
                // (currRow+1, currCol-1), (currRow+1, currCol), (currRow+1, currCol+1)

                if(tray[currRow-1][currCol-1] == 1) {
                    tray[currRow-1][currCol-1] = 0;
                    queue.add(new RowCol(currRow-1, currCol-1));
                }

                if(tray[currRow-1][currCol] == 1) {
                    tray[currRow-1][currCol] = 0;
                    queue.add(new RowCol(currRow-1, currCol));
                }

                if(tray[currRow-1][currCol+1] == 1) {
                    tray[currRow-1][currCol+1] = 0;
                    queue.add(new RowCol(currRow-1, currCol+1));
                }

                if(tray[currRow][currCol-1] == 1) {
                    tray[currRow][currCol-1] = 0;
                    queue.add(new RowCol(currRow, currCol-1));
                }

                if(tray[currRow][currCol+1] == 1) {
                    tray[currRow][currCol+1] = 0;
                    queue.add(new RowCol(currRow, currCol+1));
                }

                if(tray[currRow+1][currCol-1] == 1) {
                    tray[currRow+1][currCol-1] = 0;
                    queue.add(new RowCol(currRow+1, currCol-1));
                }

                if(tray[currRow+1][currCol] == 1) {
                    tray[currRow+1][currCol] = 0;
                    queue.add(new RowCol(currRow+1, currCol));
                }
                if(tray[currRow+1][currCol+1] == 1) {
                    tray[currRow+1][currCol+1] = 0;
                    queue.add(new RowCol(currRow+1, currCol+1));
                }

            }
            days++;
        }
        return days-1;
    }
}
