public class T338 {
    public static int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        int count;
        for(int i = 1; i < num + 1; i++){
            count = 0;
            int flag = i;
            while(flag != 0){
                count++;
                flag = flag&(flag-1);
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] result = countBits(2);
    }
}
