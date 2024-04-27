package binarysearchin2d;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {5,6,11},
                {7,8,90}
                       };
        int n = a.length;
        int target = 11;
        int[] ans  = getTarget(a,n,target);
       for (int i : ans){
           System.out.println(i);
       }

    }
    public static int[] getTarget(int[][] arr, int n,int target){
        int res [] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] != target){
                    return new int[]{i,j};
                }
            }
        }
        return res;
    }
}
