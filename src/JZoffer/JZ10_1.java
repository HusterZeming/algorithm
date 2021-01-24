//斐波那契而数列 考虑溢出情况
package JZoffer;

public class JZ10_1 {
    public int fib(int n) {
        if(n == 0)
            return 0;
        if(n == 1 || n == 2)
            return 1;
        int pre = 1;
        int curr = 1;
        int sum = 0;
        for(int i = 3; i < n + 1; i++){
            sum = pre + curr;
            pre = curr;
            curr = sum;
            curr = (curr%1000000007);
        }
        return curr;
    }
}
