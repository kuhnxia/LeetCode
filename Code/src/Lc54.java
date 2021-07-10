import java.util.ArrayList;
import java.util.List;

public class Lc54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int i = 0;
        int j = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        while(i<m && j<n){
            for(int x=j; x<n; x++){
                list.add(matrix[i][x]);
            }
            if(i+1>=m)
                return list;
            for(int x=i+1; x<m; x++){
                list.add(matrix[x][n-1]);
            }
            if(n-2 < j)
                return list;
            for(int x=n-2; x>=j; x--){
                list.add(matrix[m-1][x]);
            }
            if(m-2 <= i)
                return list;
            for(int x=m-2; x>i; x--){
                list.add(matrix[x][j]);
            }
            i++;
            j++;
            m--;
            n--;
        }
        return list;
    }
}
