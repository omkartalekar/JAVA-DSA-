import java.util.*;

class PlusOne {
    public static int[] plusOne(int[] digits) {

        int n = digits.length;

        // To solve this, we take digits one by one from end to start..

        for (int i = n - 1; i >= 0; i--) {

            // If a digit is not equal to 9, we plus one directly and then quit the loop...

            if (digits[i] != 9) {
                digits[i] += 1;

                break;
            }
            // if the digit is 9, we set it to 0, and continue the loop until
            // we encounter the number don't equals to 9...
            digits[i] = 0;

        }

        if (digits[0] == 0) {
            // it means, we need a bigger array to represent the number.
            int arr[] = new int[n + 1];
            // and set res[0] to 1...
            arr[0] = 1;
            return arr;
        }
        return digits;
    }

    public static void main(String args[]) {
        int digits[] = new int[] { 8, 9, 9, 9 };

        int arr[] = plusOne(digits);
        System.out.println(Arrays.toString(arr));

    }
}
