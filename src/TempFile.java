import java.io.File;
import java.io.IOException;

// C://temp
// /tmp
public class TempFile {
    public static void main(String[] args) {
        try {
            File f = File.createTempFile("tmp_",".dat");
            System.out.println(f.getAbsolutePath());
            System.out.println("60초 동안 멈춰있습니다.");
            try {
                Thread.sleep(60000); // 60초 동안 프로그램이 멈춰있다.
            } catch (InterruptedException ir){
                System.out.println(ir);
            }
            f.deleteOnExit(); // JVM이 종료될 때 임시파일을 자동으로 삭제한다.
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
