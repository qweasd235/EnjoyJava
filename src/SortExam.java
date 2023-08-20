import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class SortExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("choi");
        list.add("kim");
        list.add("qerwt");

//        Collections.sort(list);
        Collections.shuffle(list); // 섞기

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
