public class Lc598 {
    public int maxCount(int m, int n, int[][] ops) {
        int min1 = m;
        int min2 = n;
        for(int i=0; i<ops.length; i++){
            if(ops[i][0] < min1){
                min1 = ops[i][0];
            }
            if(ops[i][1] < min2){
                min2 = ops[i][1];
            }
        }
        return min1 * min2;
    }
}
