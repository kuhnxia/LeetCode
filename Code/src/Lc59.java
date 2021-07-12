public class Lc59 {
    public int[][] generateMatrix(int n) {
        int i = 0;
        int num = 1;
        int[][] matrix = new int[n][n];
        while(i<n){
            for(int x=i; x<n; x++){
                matrix[i][x] = num++;
            }
            for(int x=i+1; x<n; x++){
                matrix[x][n-1] = num++;
            }
            for(int x=n-2; x>=i; x--){
                matrix[n-1][x] = num++;
            }
            for(int x=n-2; x>i; x--){
                matrix[x][i] = num++;
            }
            i++;
            n--;
        }
        return matrix;
    }
}
