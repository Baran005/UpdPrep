package AprilMockPrep;

public class ArmstrongNum {
    public static void main(String[] args) {
         int n = 153;
         boolean res = isArmstrong(n);
        System.out.println(res);
    }
    static boolean isArmstrong(int n){
        int OriginalN = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length();
        while (n > 0){
            int digit = n % 10;
            sum += Math.pow(digit,numberOfDigits);
            n /= 10;
        }
        return sum == OriginalN;
    }
//    static boolean isArmstrong(int n){
//        // Convert the number to a string to determine the number of digits
//        String numStr = String.valueOf(n);
//        int numDigits = numStr.length();
//
//        // Calculate the sum of the digits raised to the power of the number of digits
//        int sum = 0;
//        for (char digitChar : numStr.toCharArray()) {
//            int digit = Character.getNumericValue(digitChar);
//            sum+= Math.pow(digit,numDigits);
//        }
//        // Check if the sum is equal to the original number
//        return sum == n;
//
//    }
}
