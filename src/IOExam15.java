import java.io.StringReader;

public class IOExam15 {
    public static void main(String[] args) throws Exception{
        StringReader in = new StringReader("helloworld!!");
        int ch = -1;

        while ((ch = in.read()) != -1){
            System.out.println((char)ch);
        }
        in.close();
    }
}
