package JZoffer;

class JZ03 {
    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int i, j, index;
        for(i = 0; i < len - 1; i++)
        {
            for(j = 0; j < i; j++)
            {
                if (nums[i] == nums[j])
                    return nums[i];
            }
        }
        return 0;
    }
}