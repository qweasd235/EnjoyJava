public class NumberOverflow {
    public static void main(String[] args) {
        int value = 10;
        int maxInt = Integer.MAX_VALUE;

        System.out.println(value + 1);
        System.out.println(maxInt + 1);

        double d1 = 50;
        double d2 = 500L;

        System.out.println(d1);
        System.out.println(d2);

        //int i1 = 50.0;
        //int i2 = 25.4f;
        int i1 = (int)50.0;
        int i2 = (int)25.4f;

        System.out.println(i1);
        System.out.println(i2);
    }
}
