public class Lc566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(r*c != mat.length * mat[0].length){
            return mat;
        }
        else{
            int[] tem = new int[r*c];
            int[][] ans = new int[r][c];
            int x = 0;
            for(int i=0; i<mat.length; i++){
                for(int j=0; j<mat[0].length; j++){
                    tem[x++] = mat[i][j];
                }
            }
            x--;
            for(int i = r-1; i > -1; i--){
                for(int j = c-1; j > -1; j--){
                    ans[i][j] = tem[x--];
                }
            }
            return ans;
        }

    }
}
