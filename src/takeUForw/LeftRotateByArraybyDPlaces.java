package takeUForw;

import java.util.ArrayList;
import java.util.List;

public class LeftRotateByArraybyDPlaces {
    public static void main(String[] args) {

            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            arr.add(3);
            arr.add(6);
            arr.add(11);
            arr.add(12);
            arr.add(17);
            int k = 4;

            ArrayList<Integer> result = rotateArray(arr, k);
            System.out.println("Rotated Array: " + result);

    }
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        ArrayList<Integer> rotatedArr = new ArrayList<>(arr); // Create a copy of the input array

        int n = arr.size();
        k = k % n; // To handle cases where k is greater than the size of the array

        // Reverse the entire array
        reverse(rotatedArr, 0, n - 1);
        // Reverse the first n-k elements
        reverse(rotatedArr, 0, n - k - 1);
        // Reverse the remaining elements
        reverse(rotatedArr, n - k, n - 1);

        return rotatedArr; // Return the rotated array
    }

    // Helper function to reverse a portion of the array
    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }

    }

