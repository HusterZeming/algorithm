public class T978 {
    public int maxTurbulenceSize(int[] arr) {
        int left = 0;
        int right = 0;
        int res = 1;
        if(arr.length <= 1)
            return arr.length;
        while(right < arr.length - 1){
            if(left == right){
                if(arr[right + 1] == arr[right])
                    left++;
                right++;
            }
            else if((arr[right] > arr[right - 1] && arr[right + 1] < arr[right]) || (arr[right] < arr[right - 1] && arr[right + 1] > arr[right])){
                right++;
            }
            else
                left = right;
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}
