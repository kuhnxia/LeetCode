public class Lc67 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(j>=0 || i>=0){
            int sum = carry;
            if(j>=0) sum += b.charAt(j--) - '0';
            if(i>=0) sum += a.charAt(i--) - '0';
            sb.append(sum%2);
            carry = sum/2;
        }
        if(carry == 1) sb.append(carry);
        return sb.reverse().toString();

    }
}
