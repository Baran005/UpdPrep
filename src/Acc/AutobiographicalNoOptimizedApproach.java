package Acc;

import java.util.HashSet;
import java.util.Set;

public class AutobiographicalNoOptimizedApproach {

    public static int autoBiographicalNo(String n){
       // String s = Integer.toString(n);
        Set<Integer> set = new HashSet<>();
        int count  = 0;
        for (int i = 0; i < n.length(); i++) {
            for (int j = 0; j < n.length(); j++) {
                if (Character.getNumericValue(n.charAt(j))==i){
                        count++;
                }
            }
            if (!(Character.getNumericValue(n.charAt(i))==count)){
                return 0;
            }
            count = 0;
            set.add(Character.getNumericValue(n.charAt(i)));

        }
        return set.size();
    }
    public static void main(String[] args) {
        System.out.println(autoBiographicalNo("1210"));
        System.out.println(autoBiographicalNo("72110"));
        System.out.println(autoBiographicalNo("6210001000"));
    }
}
