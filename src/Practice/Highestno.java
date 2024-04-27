package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Highestno {
    public static void main(String[] args) {
        Integer [] arr ={2,3,4,5,6,7};
        List<Integer>list = Arrays.asList(arr);
        list.stream().sorted(Comparator.reverseOrder()).skip(2).limit(1).forEach(System.out::println);
    }
}




