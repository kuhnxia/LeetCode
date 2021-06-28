public class Lc274_2 {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] paper = new int[n+1];
        for(int c:citations){
            paper[Math.min(c, n)]++;
        }
        int h = n;
        for(int s = paper[n]; h>s; s += paper[h])
            h--;
        return h;

    }
}
