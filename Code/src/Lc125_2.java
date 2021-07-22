public class Lc125_2 {
    public boolean isPalindrome(String s) {
        int x = 0;
        int y = s.length()-1;
        while(x<y){
            while(!Character.isLetterOrDigit(s.charAt(x)) && x<y){
                x++;
            }
            while(!Character.isLetterOrDigit(s.charAt(y)) && x<y){
                y--;
            }
            char a = Character.toLowerCase(s.charAt(x));
            char b = Character.toLowerCase(s.charAt(y));
            if(a != b)
                return false;
            x++;
            y--;
        }
        return true;
    }
}
