//
//  추상화란? 불필요한 세부 사항을 숨기고 중요한 정보만을 노출하여 복잡성을 줄이는 방법.
//  추상화의 목적 : 
//      코드 재사용성: 공통된 코드를 추상화하여 여러 클래스에서 재사용.
//      유지보수성: 시스템의 복잡성을 줄이고, 코드 수정 시 영향을 최소화
//      확장성: 새로운 기능을 추가할 때 기존 코드에 최소한의 변경만 필요하게 함.
//  주요 요소 
//  1. 추상 클래스 :   
//      1. 하나 이상의 추상 메서드(구현되지 않은 메서드)를 포함하는 클래스
//      2. 인스턴스화(객체 생성)가 불가능하며, 이를 상속받는 자식 클래스가 추상 메서드를 구현
//      3. 공통된 기능을 여러 클래스에서 공유하도록 설계할 때 유용.
//  2. 인터페이스 : 다중 상속을 위한 기법
//      1. 추상 메서드들로만 구성된 일종의 계약서
//      2. 클래스는 여러 인터페이스를 구현할 수 있으며, 인터페이스에 정의된 모든 메서드를 구현
//      3. 다양한 클래스가 같은 방식으로 동작할 수 있도록 보장
//
//  super vs super() :
//      super = 부모 자식 클래스 사이에서 변수 , 메서드 이름이 같을 때 구분하기 위해 사용
//      super() = 자식 클래스에 있는 생성자에서 부모 클래스의 생성자를 호출할때 사용.
//

//  main 메서드가 있는 클래스에서 추상 메서드가 있는 클래스를 사용하려면 다음과 같이 extends <클래스명>을 붙이면 된다.
public class exercise extends Sum {
    public static void main(String[] args) {
        //  추상화 연습 : 동물 클래스에 메서드 추상화
        Dog dog_0 = new Dog("시츄",3);
        System.out.print("종:"+dog_0.nickname+",나이:"+dog_0.age + ",울음:");
        dog_0.cry();

        Cat cat_0 = new Cat("코숏",4);
        System.out.print("종:"+cat_0.nickname+",나이:"+cat_0.age + ",울음:");
        cat_0.cry();

        Cow cow_0 = new Cow("한우",5);
        System.out.print("종:"+cow_0.nickname+",나이:"+cow_0.age + ",울음:");
        cow_0.cry();

        //  추상화 연습 : 2개의 인자를 전달 받아서 총합을 int 타입으로 반환하는 추상 메서드 만들기.
        //  이번에는 main 메서드가 있는 클래스에서 상속을 받아 구현한다.
        
        //  객체 생성 
        exercise sFunction = new exercise();
        System.out.println("1 + 2 = " + sFunction.sumOfArgv2(1,2) );
        System.out.println("1 + 2 + 3= " + sFunction.sumOfArgv3(1,2,3) );
        sFunction.printInfo();     
        
        //  인터페이스 호출
        Greeting greeting = new Greeting();
        greeting.hi();
        greeting.welcome("사용자");
    }
    
    @Override
    public int sumOfArgv2(int x, int y){
        return x + y;
    }
    
    @Override
    public int sumOfArgv3(int x, int y, int z){
        return x + y + z;
    }
}

//  인터페이스
//  사용법 : 키워드 interface를 class처럼 사용
interface Hi {
    //  상수
    public static final int MAX_SCORE = 100;
    //  추상 메서드
    public abstract void hi();
}

interface Welcome { void welcome(String name); }

class Greeting implements Hi, Welcome{
    @Override
    public void hi(){
        System.out.println("hello~");
    }
    @Override
    public void welcome(String name){
        System.out.println(name+"회원님, 최고로 획득 가능한 점수는 " + MAX_SCORE + "입니다.");
    }
}

//  추상화 클래스
abstract class Animal{

    //  field
    String nickname;
    int age;
    String address = "경기도 고양시 ";

    //  constructor
    Animal(String nickname, int age){
        this.nickname = nickname;
        this.age = age;
    }
    
    //  method
    public abstract void cry();
}

class Cat extends Animal{
    String address = "고양이 보호소 ";
    Cat(String nickname, int age){
        super(nickname,age);
    }
    @Override
    public void cry(){
        System.out.println("야옹, 주소:" + super.address + address);
    }
}

class Dog extends Animal{
    String address = "개 훈련소 ";
    Dog(String nickname, int age){
        super(nickname,age);
    }
    @Override
    public void cry(){
        System.out.println("멍멍, 주소:" + super.address + address);
    }
}

class Cow extends Animal{
    String address = "목장 ";
    Cow(String nickname, int age){
        super(nickname,age);
    }
    @Override
    public void cry(){
        System.out.println("음메, 주소:" + super.address + address);
    }
}

abstract class Sum{
    //
    public abstract int sumOfArgv2(int x, int y);
    public abstract int sumOfArgv3(int x, int y, int z);

    //
    public void printInfo(){
        System.out.println("총 합 구하기 끝");
    }

}
