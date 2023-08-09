public class Hello2 {
    public static void main(String[] args) {

        System.out.println("Hello");
    }
    static int i;
    static {
        i = 5000;
        System.out.println("static block"); // 원래는 static field를 초기화
    }
}
