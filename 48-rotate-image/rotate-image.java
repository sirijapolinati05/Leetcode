class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < (n + 1) / 2; i++)
        {
            for(int j = 0; j < n / 2; j++)
            {
                //start 4 way swaps
                int temp = matrix[n - 1 - j][i];                      // temp = bottom left
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];  // bottom left = bottom right
                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 - i];  // bottom right = top right
                matrix[j][n - 1 - i] = matrix[i][j];                  // top right = top left
                matrix[i][j] = temp;                                  // top left = temp
            }
        }
    }
}
