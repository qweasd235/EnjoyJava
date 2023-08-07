public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printVersion();

        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
//        vm1.printVersion(); // static 메소드는 레퍼런스변수명.statci메소드();
        System.out.println(product);
        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);
    }
}

// javac Hello.java
// Hello.java Hello.class
// java Hello
// 틀린 답: 현재 폴더에서 찾는다.
// 정답: CLASSPATH 경로에서 Hello클래스를 찾아서 실행한다. CLASSPATH=. 이라고 생각 시


// javac VendingMachine.java
// javac VendingMachineMain.java
// java VendingMachineMain
// VendingMachineMain을 어디서 찾아서 실행할까요?