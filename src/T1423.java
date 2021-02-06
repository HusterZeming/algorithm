import java.util.Arrays;

public class T1423 {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int m = n - k;
        int sum = 0;
        for(int j = 0; j < m; j++){
            sum += cardPoints[j];
        }
        int res = sum;
        for(int index = m; index < n; index++){
            sum = sum - cardPoints[index - m] + cardPoints[index];
            res = Math.min(res,sum);
        }
        return Arrays.stream(cardPoints).sum() - res;
    }
}

//???
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int m = n - k;
        int index = 0;
        int sumAll = 0;
        sumAll = Arrays.stream(cardPoints).sum();
        int res = sumAll;
        int sum = 0;
        for(int j = 0; j < m; j++){
            sum += cardPoints[j];
        }
        for(index = m; index < n; index++){
            sum += cardPoints[index] - cardPoints[index - m];
            res = Math.min(res,sum);
        }
        return sumAll - res;
    }
}
