public class GenericBox<T> {
    // T는 제네릭에 관련된 부분이다.
    // 제네릭은 클래스이름 뒤나 메소드의 리턴타입 앞에 붙을 수 있다.
    // <T>부분은 T라는 이름의 제네릭 타입을 선언한다는 것을 의미
    // T는 Type의 약자이기 때문에 많이 사용되는 문자이지 꼭 T를 쓸 필요는 없다
    // T가 아니라 E나 D 등의 단어를 사용해도 된다.
    private T t;

    public void add(T obj){
        this.t = obj;
    }

    public T get(){
        return this.t;
    }
}
