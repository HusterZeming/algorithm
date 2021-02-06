public class T1208 {
    public int equalSubstring(String s, String t, int maxCost) {
        int cost = 0;
        int res = 0;
        int i, j = 0;
        for(i = 0; i < s.length(); i++){
            cost += Math.abs(t.charAt(i) - s.charAt(i));
            while(cost > maxCost){
                cost -= Math.abs(t.charAt(j) - s.charAt(j));
                j++;
            }
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
