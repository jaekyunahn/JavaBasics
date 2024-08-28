//
//  메서드 전달 값 
//      String : 문자열
//      int : 32비트 정수
//      long : 64비트 정수
//      double : 64비트 실수
//      float : 32비트 실수
//      char : 8비트 단일 문자
//
public class exercise {
    //  연습 문제 1
    //  main 메서드에 test1 메서드를 호출하여 "I am Test man."문자열 호출
    public static void test1(){
        System.out.println("I am Test man.");
    }
    
    //  연습 문제 2
    //  main 메서드에 test2 메서드를 호출 시 이름"Iron man"과 나이 20을 전달하여 출력
    public static void test2(String name, int age){
        System.out.println("I am " + name + ". and " + age + " years old.");
    }
    
    //  연습 문제 3
    //  main 메서드에 test3 메서드를 호출 시 "Super man", "Bat man", "Ant man"전달하여 호출
    public static void test3(String[] args){
        System.out.println("1." + args[0]);
        System.out.println("2." + args[1]);
        System.out.println("3." + args[2]);
    }

    //  연습 문제 4
    //  main 메서드에 test4 메서드를 호출 시 실수와 문자 한개 값을 전달하여 호출
    public static void test4(float fData, char cData){
        System.out.println("float=" + fData);
        System.out.println("char=" + cData);
    }
    
    public static void main(String[] args) {
        String[] names = {"Super man", "Bat man", "Ant man"};
        test1();
        test2("Iron man",20);
        test3(names);
        //  실수값 전달 할때 float일때는 값 끝 부분에 f 기입, double은 상관 없음
        test4(3.141593f, 'T');
    }
}