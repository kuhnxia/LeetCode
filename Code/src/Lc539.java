import java.util.Arrays;
import java.util.List;

public class Lc539 {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for(int i=0; i<timePoints.size(); i++){
            String hour = timePoints.get(i).substring(0,2);
            String minute = timePoints.get(i).substring(3,5);
            minutes[i] = Integer.parseInt(hour)*60+Integer.parseInt(minute);
        }
        Arrays.sort(minutes);
        int min = 720;
        for(int i=1; i<minutes.length;i++){
            if(min > minutes[i]-minutes[i-1])
                min = minutes[i]-minutes[i-1];

        }
        min = Math.min(min, minutes[0]+1440-minutes[minutes.length-1]);
        return min;
    }
}
