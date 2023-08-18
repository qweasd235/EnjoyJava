import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam02 {
    public static void main(String[] args) {
        Set<MyData> myData = new HashSet<>();
        myData.add(new MyData("choi", 500));
        myData.add(new MyData("kim", 300));
        myData.add(new MyData("lee", 200));

        Iterator<MyData> iterator = myData.iterator();
        while (iterator.hasNext()){
            MyData myData1 = iterator.next();
            System.out.println(myData1);
        }
    }
}

class MyData{
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
