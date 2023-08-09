public class Person {
    String name; // 인스턴스 필드 (static이 붙지 않음)
    String address;
    boolean isVip;
    static int count = 0; // 클래스 필드
    static { // 클래스 필드는 static 블록에서 초기화할 수 있다.
        count = 100;
    }

    public void printName(){ // 인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }

    public static void printCount(){ // 클래스 메소드
//        System.out.println(name); // static한 메소드에서는 인스턴스 필드나, 인스턴스 클래스는 사용할 수 없다.
        // 메모리에 생성되는 시점이 다르기 때문
        System.out.println("count: " + count);
    }
}
