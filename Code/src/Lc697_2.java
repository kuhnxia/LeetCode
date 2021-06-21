import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lc697_2 {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, List> degree = new HashMap();

        for(int i=0; i<nums.length; i++){
            int x=nums[i];
            if(degree.get(x) == null){
                List<Integer> list = new ArrayList<>();
                list.add(i);
                degree.put(x,list);
            }
            else{
                List list = degree.get(x);
                list.add(i);
            }
        }
        int max = 0;
        for(List list:degree.values()){
            if(list.size()>max)
                max = list.size();
        }
        int ans = nums.length;
        for(int x:degree.keySet()){
            List list = degree.get(x);
            if(list.size() == max){
                int a = (int)list.get(list.size()-1);
                int b = (int)list.get(0);
                if( a-b+1<ans)
                    ans = a-b+1;
            }
        }
        return ans;
    }
}
