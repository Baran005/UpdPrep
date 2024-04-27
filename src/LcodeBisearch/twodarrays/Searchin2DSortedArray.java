package LcodeBisearch.twodarrays;

public class Searchin2DSortedArray {
    public static void main(String[] args) {
     int arr[][] = {{1,2,3,4,5},
                  {6,7,8,9}
     };
    int target = 3;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr.length; c++) {
                if (arr[r][c]== target){
                    System.out.println(arr[r][c]);
                }else{
                    c++;
                }
            }
        }
    }
}
