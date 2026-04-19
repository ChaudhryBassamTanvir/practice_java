public class ReverseANumber {
    class Solution {
    public int reverse(int x) {

        String number = String.valueOf(x);
        StringBuilder newStr = new StringBuilder();

        int start = 0;

        // Handle negative sign
        if (number.charAt(0) == '-') {
            newStr.append('-');
            start = 1;
        }

        // Reverse digits
        for (int i = number.length() - 1; i >= start; i--) {
            newStr.append(number.charAt(i));
        }

        try {
            return Integer.valueOf(newStr.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}

}
