public abstract class Car2 {
    public Car2(String name){
        super(); // 자동으로 들어간다.
        System.out.println("Car2() 생성자 호출");
    }

    // 추상 메소드. Car2 를 만든 사람은 run()이라는 메소드가 필요하다라고 생각함.
    // run()은 자동차마다 다르게 구현할 것 같음.
    public abstract void run();
}
