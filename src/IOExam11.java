import java.io.DataInputStream;
import java.io.FileInputStream;

public class IOExam11 {
    public static void main(String[] args) throws Exception{
        // 문제 이름, 국어, 영어, 수학, 총첨 평균점수를 /tmp/score.dat 파일에서 읽으시오하시오
        DataInputStream in = new DataInputStream(new FileInputStream("/tmp/score.dat"));
        String name = in.readUTF();
        int kor = in.readInt();
        int eng = in.readInt();
        int math = in.readInt();
        double total = in.readDouble();
        double avg = in.readDouble();
        in.close();

        System.out.println(name);
        System.out.println(kor);
        System.out.println(eng);
        System.out.println(math);
        System.out.println(total);
        System.out.println(avg);


    }
}
