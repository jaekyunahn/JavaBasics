//  강의랑 다른점 : package 선언하여 소스코드 위치를 알림.
//  src folder 내부에 java code file을 적재 해야 error가 발생하지 않음.
//      알려진 error code : The declared package "" does not match the expected package "HelloWorld"Java(536871240)
package HelloWorld.src;

public class HelloWorld{
    //  run 누르면 아래 function이 실행됨.
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}