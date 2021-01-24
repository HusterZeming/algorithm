package JZoffer;

public class JZ10_2 {
    public int numWays(int n) {
        if(n == 0 || n == 1)
            return 1;
        int pre = 1;
        int curr = 1;
        int sum = 0;
        for(int i = 2; i < n + 1; i++){
            sum = pre + curr;
            pre = curr;
            curr = sum;
            curr = (curr%1000000007);
        }
        return curr;
    }
}
