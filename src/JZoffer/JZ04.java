package JZoffer;

public class JZ04 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false;
        int i = matrix.length;
        int j = matrix[0].length;
        int row = 0;
        int col = j - 1;
        while(row < i && col >= 0) {
            if (target > matrix[row][col])
                row++;
            else if (target < matrix[row][col])
                col--;
            else
                return true;
        }
        return false;
    }
}
