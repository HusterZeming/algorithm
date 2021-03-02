public class T303 {
    private int[] sums;

    public T303(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return;
        sums = new int[len];
        sums[0] = nums[0];
        for(int i = 1; i < len; i++){
            sums[i] = nums[i] + sums[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return sums[j];
        else
            return sums[j] - sums[i - 1];
    }
}
