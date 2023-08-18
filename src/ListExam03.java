import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListExam03 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("lee");
        collection.add("choi");
        collection.add("kim");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
