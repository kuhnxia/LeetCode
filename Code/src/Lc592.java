import java.util.ArrayList;
import java.util.List;

public class Lc592 {
    public String fractionAddition(String expression) {
        List<Character> sign = new ArrayList<>();
        if(expression.charAt(0) != '-')
            sign.add('+');
        for(int i=0; i<expression.length(); i++){
            if(expression.charAt(i) == '-' || expression.charAt(i) == '+')
                sign.add(expression.charAt(i));
        }
        List<Integer> num = new ArrayList<>();
        List<Integer> den = new ArrayList<>();
        for(String sub: expression.split("\\+|-")){
            if(sub.length()>0){
                String[] s = sub.split("/");
                num.add(Integer.parseInt(s[0]));
                den.add(Integer.parseInt(s[1]));
            }
        }
        int lcmu = 1;
        for(int d: den){
            lcmu = lcm(lcmu, d);
        }
        int number = 0;
        for(int i=0; i<den.size(); i++){
            if(sign.get(i) == '+'){
                number += num.get(i)*lcmu/den.get(i);
            }
            else{
                number -= num.get(i)*lcmu/den.get(i);
            }
        }
        int gcdi = gcd(lcmu, Math.abs(number));
        return number/gcdi + "/" + lcmu/gcdi;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int t = b;
            b = a%b;
            a = t;
        }
        return a;
    }
    public int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
