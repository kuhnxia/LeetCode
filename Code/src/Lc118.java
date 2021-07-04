import java.util.ArrayList;
import java.util.List;

public class Lc118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0; i< numRows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i > 0){
                if(i >1){
                    List rowAhead = triangle.get(i-1);
                    for(int j=0;j<rowAhead.size()-1; j++){
                        int num = (int)rowAhead.get(j) +(int)rowAhead.get(j+1);
                        row.add(num);
                    }
                }
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}
