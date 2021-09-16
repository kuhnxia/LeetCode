public class Lc481 {
    public int magicalString(int n) {
        int index = 2;
        StringBuilder s = new StringBuilder();
        s.append(122);
        while(s.length() < n){
            if(s.charAt(index) == '1'){
                s.append(s.charAt(s.length()-1) == '1'? 2:1);
            }
            else{
                s.append(s.charAt(s.length()-1) == '1'? 22:11);
            }
            index++;
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '1')
                count++;
        }
        return count;
    }
}
