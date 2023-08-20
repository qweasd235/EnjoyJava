import java.util.EnumMap;

public class EnumMapTest {
    public static void main(String[] args) {
        EnumMap emap = new EnumMap(Day.class);
        emap.put(Day.SUNDAY, "일요일은 잠이 최고!!");
        emap.put(Day.MONDAY, "월요병임");
        emap.put(Day.FRIDAY, "야호 불금!!");

        System.out.println(emap.get(Day.MONDAY));
    }
}
