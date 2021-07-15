public class Lc48 {
    public void rotate(int[][] matrix) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int x = 0;
        for(int j= 0; j<matrix[0].length; j++){
            for(int i= matrix.length - 1; i > -1; i--){
                temp[x++] = matrix[i][j];
            }
        }
        x = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = temp[x++];
            }
        }

    }
}
