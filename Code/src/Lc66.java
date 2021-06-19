public class Lc66 {
        public int[] plusOne(int[] digits) {

            int n = digits.length;
            int overFlow = 1;
            for (int i = n - 1; i > -1; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                } else {
                    digits[i] = 0;
                }
            }

            int[] num = new int[digits.length + 1];
            num[0] = 1;
            return num;

        }
}
