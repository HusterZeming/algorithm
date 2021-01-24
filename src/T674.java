//最长连续递增序列
public class T674 {
    public static int findLengthOfLCIS(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int flag = nums[0];
        int index = 1;
        int max = 0;
        for (int i = 0; i < len; i++){
            if(flag < nums[i]){
                index++;
                if(index > max)
                    max = index;
                flag = nums[i];
            }
            else if(flag > nums[i]){
                index = 1;
                flag = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1,3,5,4,2,3,4,5};
        int result = findLengthOfLCIS(num);
    }
}
