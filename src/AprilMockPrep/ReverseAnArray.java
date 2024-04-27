package AprilMockPrep;

public class ReverseAnArray {
    public static void main(String[] args) {
   int [] arr = {1,2,3,4,5};
   int n = arr.length;
    reverseArray(arr,n);

    }
    static void reverseArray(int[] arr,int n){

          int t;
        for (int i = 0; i < n/2 ; i++) {
            t = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1] = t;
        }
        System.out.println("Reversed array is : \n");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
}
