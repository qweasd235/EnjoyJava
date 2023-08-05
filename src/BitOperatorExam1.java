public class BitOperatorExam1 {
    public static void main(String[] args) {
        int a = 4; // 00000100
        int b = a >> 1; // 00000010  2^1 으로 나눈다
        System.out.println(b);

        int c = 4; // 00000100
        int d = c << 1; // 00001000 2^1으로 곱한다.
        System.out.println(d);
    }
}
