public class Lc495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int redundancy = 0;
        for(int i=1; i<timeSeries.length; i++){
            if(timeSeries[i]< timeSeries[i-1]+duration)
                redundancy += duration + timeSeries[i-1] - timeSeries[i];
        }
        return duration*timeSeries.length-redundancy;

    }
}
