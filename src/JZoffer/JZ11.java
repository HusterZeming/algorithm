package JZoffer;

public class JZ11 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int i, index = numbers[0];
        for(i = 0; i < len; i++){
            if(index < numbers[i])
                index = numbers[i];
            if(index > numbers[i]) {
                index = numbers[i];
                return index;
            }
        }
        return numbers[0];
    }
}
