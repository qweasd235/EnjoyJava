// A라는 사용자
class ExceptionObj1 {
    /**
     * i 를 k로 나눈 나머지를 반환한다.
     *
     * @param i
     * @param j
     * @return ArithmeticException
     */
    public int divide(int i, int j) throws ArithmeticException{
        int value = 0;
        value = i / j;

        return value;
    }
}
