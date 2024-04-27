package Practice;

public class SumtheDigitsuptoOneDigitValue {
    public static void main(String[] args) {
        int num=361;
        System.out.println(sumToSingleDigit(num));
    }
    public static int sumToSingleDigit(int num) {
        // Keep summing the digits until a single digit is obtained
        while (num >= 10) {
            int sum = 0;
            // Extract each digit and add them
            while (num > 0) {
                int temp = num % 10;
                sum = sum + temp ; // Extract the last digit
                num = num / 10; // Remove the last digit
            }
            num = sum; // Update the number with the sum
        }
        return num; // Return the single digit
    }
}

