public class Lc125_1 {
    public boolean isPalindrome(String s) {
        String a = "";
        for(int i= 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i)))
                a += Character.toLowerCase(s.charAt(i));
        }
        for(int i=0; i<a.length()/2; i++){
            if(a.charAt(i) != a.charAt(a.length()-1-i))
                return false;
        }
        return true;

    }
}
