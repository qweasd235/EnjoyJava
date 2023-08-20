public class Exception5 {
    public static void main(String[] args) {
        try {
            ExceptionObj5 exobj = new ExceptionObj5();
            int value = exobj.divide(10, 0);
            System.out.println(value);
        }catch (MyException me){
            System.out.println("사용자 정의 Exception이 발생하였습니다.");
        }
    }
}

class ExceptionObj5{
    public int divide(int i, int j)throws MyException{
        int value = 0;
        try {
            value = i / j;
        }catch (ArithmeticException ae){
            throw new MyException("0으로 나눌 수 없습니다.");
        }
        return  value;
    }
}