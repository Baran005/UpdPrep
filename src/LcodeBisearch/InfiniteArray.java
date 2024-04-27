package LcodeBisearch;

public class InfiniteArray {
    public static void main(String[] args) {
    //start with the box of size 2
      int[] arr = {2,3,4,8,10,20,30,40};
        System.out.println(ans(arr,10));
    }
    static int ans(int[] arr, int target){
      //first find the range
        //first start with a box o size 2
        int start = 0;
        int end = 1;
        //condition for target to lie in a range
        while(target > arr[end]){
            int newStart = end + 1;
            //dble the box value
            //end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start, int end){


        while (start <= end){
//        find the middle element
//  int mid = (start + end) / 2; //might be possible that (start + end) exceeds the range of integer i.e., integr range
            int mid = start + (end -start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}