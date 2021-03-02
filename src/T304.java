public class T304 {
    private int [][] sums;

    public T304(int[][] matrix) {
        int row = matrix.length;
        if (row == 0)
            return;
        int col = matrix[0].length;
        if(col == 0)
            return;
        sums = new int[row][col];
        for(int i = 0; i < row; i++){
            sums[i][0] = matrix[i][0];
            for(int j = 1; j < col; j++){
                sums[i][j] = sums[i][j - 1] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        if(col1 == 0) {
            for (int i = row1; i <= row2; i++) {
                sum += sums[i][col2];
            }
        }
        else {
            for (int i = row1; i <= row2; i++) {
                sum += sums[i][col2] - sums[i][col1 - 1];
            }
        }
        return sum;
    }
}
