package AprilMockPrep;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachStringInAnArray {
    public static void main(String[] args) {
        String[] arr = {"baran","mala","boomi","baran","mala"};
      OccurrenceOfEachStringInAnArray(arr);
    }
    static void OccurrenceOfEachStringInAnArray(String [] arr){
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<String,Integer> set : map.entrySet()) {
            String key = set.getKey();
            int vlue = set.getValue();
            System.out.println(key + ":"+vlue);
        }
    }
}
