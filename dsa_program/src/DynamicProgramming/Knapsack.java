package DynamicProgramming;

public class Knapsack {
    public static void maximumValue(int knapsackSize, int[] weight, int[] value) {
        int nItems = weight.length;

        // matrix[i][j] defines the optimal solution with first i items and total knapsackSize j

        int[][] matrix = new int[nItems + 1][knapsackSize + 1];

        for (int i = 1; i <= nItems; i++) { // outer loop iterating through weights

            for (int j = 1; j <= knapsackSize; j++) {
                // check if the weight of current item i is less than or equal to the capacity of sack,
                // take maximum of once including the current item and once not including
                if (weight[i - 1] <= j) {
                    matrix[i][j] = Math.max(matrix[i - 1][j], value[i - 1] + matrix[i - 1][j - weight[i - 1]]);
                } else {
                    matrix[i][j] = matrix[i - 1][j];
                }
            }
        }
        System.out.println("Maximum value possible : " + matrix[nItems][knapsackSize]);
    }


    public static void main(String[] args) {

        int knapsackSize = 7;
        int[] weights = {2, 1, 3, 2}, values = {12, 10, 21, 15};
        maximumValue(knapsackSize, weights, values);
    }

}
