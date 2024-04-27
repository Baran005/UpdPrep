package takeUForw;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Collections.list;
public class Left {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,6,11,12,17));

        int d = 3;
        int arr[] = {1,3,5,7,13,16};
        for (int i = 0; i < d; i++) {
        for (int j = 0; j < arr.length-1 ; j++){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
        }

        for (int i : arr){
        System.out.println(i);
        }

    }
}
