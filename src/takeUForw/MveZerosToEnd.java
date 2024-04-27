package takeUForw;

public class MveZerosToEnd {
    public static void main(String[] args) {
       int[] arr = {1,2,0,0,2,3};
       int[] res = moveZeros(6,arr);
        for (int i : res) {
            System.out.println(i);
        }
        System.out.println(res);
    }
    static int[] moveZeros(int n, int arr[]){

        int left = 0;
        int right = 0;

        while (right < n){
            if(arr[right] != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;
        }
        return arr;
    }
}
