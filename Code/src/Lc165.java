public class Lc165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int min = Math.min(v1.length, v2.length);
        int max = Math.max(v1.length, v2.length);
        for(int i=0; i<min; i++){
            int x = Integer.parseInt(v1[i]);
            int y = Integer.parseInt(v2[i]);
            if(x < y)
                return -1;
            if(x > y)
                return 1;
        }
        for(int i= min; i<max; i++){
            try{
                int x = Integer.parseInt(v1[i]);
                if(x > 0)
                    return 1;
            }
            catch(Exception e){
                int y = Integer.parseInt(v2[i]);
                if(y > 0)
                    return -1;
            }
        }
        return 0;
    }
}
