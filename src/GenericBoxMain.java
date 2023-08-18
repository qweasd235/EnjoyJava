public class GenericBoxMain {
    // 제네릭의 장점
    // 정해진 타입만 사용하도록 강제 가능
    // 타입을 강제함으로써 컴파일 시 잘못된 타입의 값이 저장되는 것을 막을 수 있다.
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.add("choi");
        String str = genericBox.get();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.add(5);//런타임 오류 발생?
        Integer intValue = intBox.get();
        System.out.println(intValue);

        // genericBox.add(new Integer(5)); // 컴파일 오류 발생한다.

    }
}
