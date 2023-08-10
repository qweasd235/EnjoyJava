public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.price = 100; // private field는 직접 접근한다.
//        System.out.println(b1.price);

        b1.setTitle("자바 기초 학습 중");
        b1.setPrice(500);
        System.out.println(b1.getPrice());
        System.out.println(b1.getTitle());

    }
}
