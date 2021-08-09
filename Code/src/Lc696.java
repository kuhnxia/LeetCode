public class Lc696 {
    public int countBinarySubstrings(String s) {
        int count = 0;
        for(int i= 1; i<s.length(); i++){
            if(s.charAt(i) != s.charAt(i-1)){
                count++;
                int a = i-1;
                int b = i;
                while(a != 0 && b != s.length()-1){
                    if(s.charAt(a) == s.charAt(a-1) && s.charAt(b) == s.charAt(b+1)){
                        count++;
                    }
                    else{
                        break;
                    }
                    a--;
                    b++;
                }
                i = b;
            }
        }
        return count;
    }
}
