package BitManipulation.AddNumbers;

public class AddNumbers {

    /**
     * Adds two binary numbers
     * @param num1
     * @param num2
     * @return sum of binary numbers
     */
    public String addNums(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();

        // Make sizes equal
        if (len1 < len2) {
            int diff = len2 - len1;
            while (diff > 0) {
                num1 = "0" + num1;
                diff--;
            }
        } else if (len2 < len1) {
            int diff = len1 - len2;
            while (diff > 0) {
                num2 = "0" + num2;
                diff--;
            }
        }

        int carry = 0;
        String sum = "";
        int len = Math.max(len1, len2);

        for (int i = len - 1; i >= 0; i--) {
            int tempSum = carry + num1.charAt(i) + num2.charAt(i) - 96;
            sum = (tempSum % 2) + sum;
            carry = tempSum / 2;
        }

        if (carry == 0) {
            if (len == 0) {
                return "0";
            }
            return sum;
        }
        return carry + sum;
    }
}
