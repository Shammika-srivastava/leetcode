class Solution {
    public int[] plusOne(int[] digits) {
       for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // Carry over
        }

        // All digits were 9, so we need an extra digit at the front
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;

    }
}