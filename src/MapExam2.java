import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("c1","hello");
        map.put("c2","giveme");
        map.put("c3", "gift");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
