public class T665 {
    public boolean checkPossibility(int[] nums) {
        if(nums.length <= 1)
            return true;
        int cnt = 0;
        for(int i = 1; i < nums.length && cnt < 2; i++){
            if(nums[i - 1] <= nums[i]){
                continue;
            }
            cnt++;
            if(i == 1)
                nums[i - 1] = nums[i];
            else if(i > 1){
                if(nums[i] > nums[i - 2])
                    nums[i - 1] = nums[i];
                else if(nums[i] < nums[i - 2])
                    nums[i] = nums[i - 1];
            }
        }
        return cnt <= 1;
    }
}
