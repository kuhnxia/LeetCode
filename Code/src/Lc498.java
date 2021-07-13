public class Lc498 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m*n];
        int curr = 0;
        int x = (mat.length-1) + (mat[0].length-1);
        for(int i = 0; i<=x; i++){
            if(i%2 == 0){
                if(i<m){
                    for(int j=i; j>-1 && i-j<n; j--){
                        ans[curr++] = mat[j][i-j];
                    }
                }
                else{
                    for(int j=m-1; j>-1 && i-j<n; j--){
                        ans[curr++] = mat[j][i-j];
                    }
                }
            }
            else{
                if(i < n){
                    for(int j=0; j<m && i-j>-1; j++){
                        ans[curr++] = mat[j][i-j];
                    }
                }
                else{
                    for(int j= i-n+1; j<m && i-j>-1; j++){
                        ans[curr++] = mat[j][i-j];
                    }
                }
            }
        }
        return ans;

    }
}
