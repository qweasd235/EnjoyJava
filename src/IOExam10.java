import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IOExam10 {
    public static void main(String[] args) throws Exception{
        // 문제 이름, 국어, 영어, 수학, 총첨 평균점수를 /tmp/score.dat 파일에 저장하시오
        String name ="choi";
        int kor = 90;
        int eng = 80;
        int math = 85;
        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("/tmp/score.dat"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
        out.close();

    }
}
