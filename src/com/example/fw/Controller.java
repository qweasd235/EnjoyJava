package com.example.fw;

/*
Controller의 종류가 여러 개
초기화 - 같은 코드
실행 - 다른 코드?
마무리 - 같은 코드
 */
public abstract class Controller {
    // protected는 같은 package이거나 상속받았을 경우 접근 가능하다.
    protected final void init() {
        System.out.println("초기화 코드");
    }

    protected final void close(){
        System.out.println("마무리 코드");
    }
    protected abstract void run(); // 매번 다른 코드

    // 내가 가지고 있는 메소드를 호출
    // 어떤 순서를 가지고 있다. 이런 메소드를 탬플릿 메소드라고 한다.
    public void execute(){ // 이 메소드만 호출되도록 해야 함
        //초기화
        this.init(); // this. 생략가능
        //실행
        this.run();
        //마무리
        this.close();

    }
}
