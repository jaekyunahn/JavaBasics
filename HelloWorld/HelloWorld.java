//  Java code : 일반적인 Java Code 실행 방법은 java file을 Build하여 Class file 생성 후 실행
//  VScode에서는 간단하게 Test를 할 수 있지만 실제 사용해먹으려면 cmd에서 Build하여 사용하는게 바람직
//      build command : javac <class명>.java
//      run command : java <class명>

public class HelloWorld{
    //  메서드란? class 내부에서 생성되는 일반적인 함수를 지칭
    public static void outputFunc(){
        System.out.println("Hello World");
    }
    
    //  run 누르면 아래 function이 실행됨.
    public static void main(String[] args) {
        //  메서드 호출
        outputFunc();
    }
}