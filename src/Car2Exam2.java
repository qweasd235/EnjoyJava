public class Car2Exam2 {
    public static void main(String[] args) {
        //    Car2 c1 = new Car2("최근욱");

//        Bus2 b = new Bus2();
//        b.run();

//        SportCar s1 = new SportCar("sportCar!!!");
//        s1.run();

//        Car2 c = new SportCar("SportCar...");
//       c.run(); // 어떤 결과가 나올까?

        Car2[] array = new Car2[2];
        array[0] = new Bus2();
        array[1] = new SportCar("Sprotcar!!@#");
        for(Car2 c2 : array){
            c2.run();
        }

    }
}
