public class Lc434 {
    public int countSegments(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int count;
        if(s.charAt(0) == ' '){
            count = 0;
        }
        else{
            count = 1;
        }
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' ')
                count ++;
        }
        return count;
    }
}
