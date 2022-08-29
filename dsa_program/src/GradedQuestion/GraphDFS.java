package GradedQuestion;

public class GraphDFS {
    private int dfs(int[][] matrix, int row, int col) {
        // This will calculate the area of the island that is starting
        // from (row,col)

        if(matrix[row][col] == 0) return 0;
        matrix[row][col] = 0;
        return 1 + dfs(matrix, row-1,col-1) +
                dfs(matrix, row-1, col) +
                dfs(matrix, row-1, col+1) +
                dfs(matrix, row, col-1) +
                dfs(matrix, row, col+1) +
                dfs(matrix, row+1, col-1) +
                dfs(matrix, row+1, col) +
                dfs(matrix, row+1, col+1);
    }

    public int calculateArea(int[][] matrix) {
        int ans = 0;

        for(int i=0; i< matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                if(matrix[i][j] == 1) {
                    int temp = dfs(matrix, i, j);
                    ans = Math.max(ans, temp);
                }
            }
        }

        return ans;
    }
}
