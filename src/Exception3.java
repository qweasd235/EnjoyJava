import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("Exception3.java");
        }catch (FileNotFoundException fi){
            System.out.println("File을 찾을 수 없습니다.");
        }
    }
}
