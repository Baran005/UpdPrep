package Acc;

public class Qno1Autobi {
    public static void main(String[] args) {
        System.out.println(findAutoCount("1210"));       // Output: 3
        System.out.println(findAutoCount("6210001000")); // Output: 4
        System.out.println(findAutoCount("72110"));      // Output: 0
    }

        public static int findAutoCount (String n){
            if (n == null) {
                return 0;
            }

            int length = n.length();
            int[] count = new int[10]; // Array to store count of each digit

            // Count occurrences of each digit
            for (int i = 0; i < length; i++) {
                char digit = n.charAt(i);
                count[digit - '0']++; // Increment count for the digit
            }

            // Check if each digit count matches its index
            for (int i = 0; i < length; i++) {
                if (count[i] != (n.charAt(i) - '0')) {
                    return 0; // Not an autobiographical number
                }
            }

            // Count distinct numbers
            int distinctCount = 0;
            for (int i = 0; i < length; i++) {
                if (count[i] > 0) {
                    distinctCount++;
                }
            }

            return distinctCount;
        }

        // Helper method to count occurrences of a digit in the count array
        private static int countOccurrences ( int[] count, int digit){
            int occurrences = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] == digit) {
                    occurrences++;
                }
            }
            return occurrences;
        }
    }




