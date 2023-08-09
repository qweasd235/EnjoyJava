public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "최근욱";  // 문자열은 new를 사용하지 않고 인스턴스 사용 가능. 되도록 new를 사용하지 말자(String)
        p1.address = "사당";
        p1.isVip = true;
        p2.name = "장비";
        p2.address = "성수";
        p2.isVip = false;

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
        System.out.println(p1.address.length());
        System.out.println(p1.isVip);

        System.out.println("--------------------------------------------------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);

    }
}
