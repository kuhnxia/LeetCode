import java.util.HashMap;

public class Lc535 {
    //code,longUrl
    HashMap<String, String> index = new HashMap<>();
    //longUrl,code
    HashMap<String, String> revIndex = new HashMap<>();
    int count = 0;
    final String base = "http://tinyurl.com/";
    final String charSet = "abcdefghijklmnopqrstuvwxyz0123456789";
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(revIndex.get(longUrl) == null){
            String code = "";
            for(int i=0; i<5; i++){
                int position = (int) Math.random()*charSet.length();
                code += charSet.charAt(position);
            }
            index.put(code, longUrl);
            revIndex.put(longUrl, code);

            return base + code;
        }
        else{
            return base + revIndex.get(longUrl);
        }

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        String code = shortUrl.substring(base.length());
        return index.get(code);

    }
}
