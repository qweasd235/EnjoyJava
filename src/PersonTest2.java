public class PersonTest2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "최근욱";
        p2.name = "유비";

        System.out.println(Person.count);

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.count);
        p1.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
        p2.count++;
        System.out.println(p1.count);
        System.out.println(p2.count);
    }
}
