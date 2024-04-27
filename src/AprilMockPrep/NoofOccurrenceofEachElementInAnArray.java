package AprilMockPrep;

import java.util.HashMap;
import java.util.Map;
public class NoofOccurrenceofEachElementInAnArray {
    public static void main(String[] args) {
        int arr[] = {3,4,3,5,3,6};
        occurrenceInAnArray(arr);

    }
    static void occurrenceInAnArray(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> set : map.entrySet()){
            System.out.print(set.getKey()+" :"+set.getValue()+",");
        }
    }
}
