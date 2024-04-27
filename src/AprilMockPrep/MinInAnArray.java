package AprilMockPrep;

public class MinInAnArray {
    public static void main(String[] args) {
        int arr[] = {10,8,7,12,15};

    }
}
//approach 1
//int mid = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//        if (mid > arr[i]){
//mid = arr[i];
//        }else {
//i++;
//        }
//        }
//        System.out.println(mid);

//Approach  2
// Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        System.out.println("Minimum: " +arr[0]);