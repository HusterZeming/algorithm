//旋转数组中的最小数字 考虑二分查找
package JZoffer;

public class JZ11_2 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int low = 0;
        int high = len - 1;
        int curr = (len - 1)/2;
        while(low < high){
            if(numbers[curr] < numbers[high]){
                high = curr;
                curr = (high - low)/2 + low;
            }
            else if(numbers[curr] > numbers[high]) {
                low = curr + 1;
                curr = (high - low) / 2 + low;
            }
            else {
                high--;
                curr = (high - low) / 2 + low;
            }
        }
        return numbers[curr];
    }
}
