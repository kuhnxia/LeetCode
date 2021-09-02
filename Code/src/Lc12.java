public class Lc12 {
    public String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        int[] d = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] c = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        for(int i=0; i<d.length;i++){
            if(num == 0)
                break;
            while(num-d[i]>=0){
                s.append(c[i]);
                num -= d[i];
            }
        }
        return s.toString();
    }
}
