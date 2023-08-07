public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); // heap 메모리에 올라감.

        math.printClassName();
        math.printNumber(5000);
        int x = math.getOne();
        System.out.println(x);
        System.out.println(math.plus(5,5));

    }
}
