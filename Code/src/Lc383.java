public class Lc383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for(int i=0; i<ransomNote.length(); i++){
            count[ransomNote.charAt(i)-'a']--;
        }
        for(int i=0; i<magazine.length(); i++){
            count[magazine.charAt(i)-'a']++;
        }
        for(int number:count){
            if(number < 0)
                return false;
        }
        return true;

    }
}
