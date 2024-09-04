//
//  객체, 클래스, 인스턴스 설명할줄 알아야함.
//      클래스 : 일종의 설계도 같은 존재. 틀(Frame)으로 생각하면 됨
//      패키지 : 코드들을 조직화 하기 위한 개념으로 폴더 단위로 보면 됨
//      객체 : 클래스 내에서 구현되고 생성된 대상체. 상태와 동작의 정보를 가지고 있다. 클래스의 instance
//      인스턴스 : 
//  1. new 키워드 : 객체를 생성하는 키워드로 클래스에서 정의된 속성과 메서드를 사용할 수 있는 인스턴스(객체)를 만들 수 있음
//  2. 생성자 : 
//  3. this 키워드 : 자바에서 객체 자신을 참조하는 데 사용되는 특별한 참조 변수
//
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        //  식별자 new를 이용하여 클래스를 객체화, 
        //new subclass().thread();

        //  객체 생성 다른 방식 >> 인스턴스 화 하여 생성하는 방법도 있음
        subclass Subclass = new subclass(32, 3.1415);
        Subclass.thread();
        
        Subclass.initTest();

        //  객체 생성시 다른 네임으로 생성하면 내부 메서드 동작이라던지 필드는 별개로 동작함
        subclass test_0 = new subclass();
        test_0.thread("test_0");

        subclass test_1 = new subclass();
        test_1.thread("test_1");

        test_0.thread();
        test_1.thread();

        //
        // =======================================================================================
        //

        //  Scanner : C언어로 보면 scanf 함수 포지션으로 입력 받는 함수
        Scanner scanf = new Scanner(System.in);

        String sData;

        System.out.println("사용자의 이름을 입력하세요:");
        sData = scanf.nextLine();

        System.out.println("입력하신 이름:" + sData);

        //  사용 후 close할것
        //  입력 스트림 또는 자원을 더 이상 사용하지 않을 때 이를 명시적으로 닫아주기 위해서
        scanf.close();




    }
}

class subclass{
    //  필드
    String subclass_sData;

    int subclass_intdata;
    double subclass_fpdata;

    //  생성자.
    //  생성자는 객체 생성되는 그 순간 자동으로 제일 먼저 호출되어 실행되는 메서드.
    //  생성되는 객체에 필요한 속성이나 값들을 만들고 객체의 초기화를 담당. 
    //  선언하는 방법은 클래스명과 같은 메서드를 선언,생성자는 옵션이지 강제성은 없는 기능임
    //  주의 : 생성자를 사용 안하거나 객체 호출할때는 전달 인자값을 넣으면 클래스 안 생성자에서도 전달 받는 인자값을 구현해야한다.
    subclass(){
        subclass_sData = "Default String Data!";
    }
    subclass(int subclass_intdata, double subclass_fpdata){
        //  여기서 this식별자는 객체 생성시 만들어지고 있는 그 객체(인스턴스)를 가리킨다고 보면 됨
        this.subclass_intdata = subclass_intdata;
        this.subclass_fpdata = subclass_fpdata;
    }

    //  메서드
    public void thread(){
        System.out.println("Hello Class Call:"+subclass_sData);
    }
    
    //  메서드 네임이 동일 해도 인자값 받는 방식이 다르면 별개 함수로 동작
    public void thread(String sData){
        subclass_sData = sData;
        //System.out.println("Hello Class Call:"+ subclass_sData);
    }

    public void initTest(){
        System.out.println("subclass_intdata:"+subclass_intdata);
        System.out.println("subclass_fpdata:"+subclass_fpdata);
    }

}