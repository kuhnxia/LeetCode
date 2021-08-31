public class Lc8 {
    public int myAtoi(String s) {
        int result = 0;
        StringBuilder digits = new StringBuilder();
        Boolean sign = true;
        for(int i=0; i<s.length();i++){
            char c =s.charAt(i);
            if((i == 0 || s.charAt(i-1) == ' ') && c == ' '){
                continue;
            }
            else if(digits.length() == 0 && sign && (c == '-' || c == '+')){
                sign = false;
                if(c == '-'){
                    digits.append(c);
                }
            }
            else if(c >= '0' && c <= '9'){
                digits.append(c);
            }
            else{
                break;
            }
        }
        String number = digits.toString();
        if(digits.length() > 0 && !number.equals("-")){
            try{
                result = Integer.parseInt(number);
            }
            catch(Exception e){
                if(number.charAt(0) == '-'){
                    result = Integer.MIN_VALUE;
                }
                else{
                    result = Integer.MAX_VALUE;
                }

            }
        }
        return result;
    }
}
