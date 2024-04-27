package AprilMockPrep;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
public class MapToUpperCase {
    public static void main(String[] args) {
        Map<String,String> obj = new HashMap<>();
            obj.put("cat","Meow");
            obj.put("dog","Bark");
            obj.put("cow","Maa");
        for (Map.Entry<String,String> set : obj.entrySet()) {
            System.out.println(set.getKey().toUpperCase(Locale.ROOT) + " : " +set.getValue());
        }

    }
}
