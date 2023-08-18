import java.util.HashMap;
import java.util.Map;

public class MapExam{
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("c1","hello");
        map.put("c2","giveme");
        map.put("c3", "gift");

        System.out.println(map.get("c1"));
        System.out.println(map.get("c2"));
        System.out.println(map.get("c3"));
    }
}
