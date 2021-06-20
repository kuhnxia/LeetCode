import java.util.ArrayList;

public class Lc697_1 {
    public int findShortestSubArray(int[] nums) {

        int maxTimes = 0;
        int[] times = new int[50000];
        for(int i=0; i<nums.length; i++){
            times[nums[i]]++;
            if(times[nums[i]] > maxTimes){
                maxTimes = times[nums[i]];
            }
        }

        ArrayList<Integer> maxRepeat = new ArrayList<>();
        for(int i=0; i<50000; i++){
            if(times[i]==maxTimes){
                maxRepeat.add(i);
            }
        }

        int min = nums.length;
        while(maxRepeat.size()>0){
            int a = 0;
            int b = 0;
            int length;
            for(int i=0; i<nums.length;i++){
                if(nums[i] == maxRepeat.get(0)){
                    a = i;
                    break;
                }
            }
            for(int i=nums.length-1; i>-1;i--){
                if(nums[i] == maxRepeat.get(0)){
                    b = i;
                    break;
                }
            }
            length = 1 + b-a;
            if(min>length){
                min = length;
            }
            maxRepeat.remove(0);
        }

        return min;
    }
}
