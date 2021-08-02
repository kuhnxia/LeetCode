public class Lc242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length() || s.equals(t) && s.length()!=1)
            return false;
        char[] count = new char[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int n: count){
            if(n != 0)
                return false;
        }
        return true;
    }
}
