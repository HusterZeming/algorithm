import java.util.Arrays;
import java.util.HashSet;

public class T888 {
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int lenA = A.length;
        int lenB = B.length;
        int dif = sumB - sumA;
        dif = dif / 2;
        int[] res = new int[2];
        for(int i = 0; i < lenB; i++){
            for(int j = 0; j < lenA; j++){
                if(B[i] - A[j] == dif){
                    res[0] = A[j];
                    res[1] = B[i];
                    return res;
                }
            }
        }
        return null;
    }

    public int[] fairCandySwap1(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int lenA = A.length;
        int lenB = B.length;
        int dif = sumB - sumA;
        dif = dif / 2;
        HashSet<Integer> numA = new HashSet<>();
        for(int a = 0; a< lenA; a++){
            numA.add(A[a]);
        }
        int[] res = new int[2];
        for(int i = 0; i < lenB; i++){
            int index = B[i] - dif;
            if(numA.contains(index)){
                res[0] = index;
                res[1] = B[i];
                return res;
            }
        }
        return null;
    }
}
