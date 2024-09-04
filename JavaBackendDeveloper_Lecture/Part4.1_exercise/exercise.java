//
//  %상속 : 기존 클래스의 속성과 메서드를 새로운 클래스가 물려받아 재사용하는 객체 지향 프로그래밍 개념
//  키워드 : extends > 예) class Child extends Parent는 Child 클래스가 Parent 클래스를 상속받는다는 의미
//  메서드 오버라이딩 : 자식 클래스에서 부모 클래스의 메서드를 재정의하여 다른 기능을 구현
//  
//  상속을 공부할때는 사고 발상이 필요
//  1. 만들고자 할 클래스간의 공통 분모를 생각하는 것이 필요
//  2. 상속이라는 개념을 모를때는 클래스간 공통 분모를 생각하지 못하고 클래스를 생성 할 수가 있음
//  3. 상속을 통해서 만들면 먼저 공통 분모를 가지는 부모 클래스를 만들어 상속을 시키면 됨
//  4. 자식클래스는 부모로 부터 특정적인 공통 분모를 상속 받음 >> 자기 자신만의 속성과 기능 추가
//  5. 만약 자식 클래스와 부모 클래스에 메서드 이름이 공통이면 자식 클래스의 메서드가 우선 호출된다. 자식 클래스에서 없으면 부모 클래스에서 호출되고 이것이 메서드 오버라이딩 이라고 한다.
//      >>  기존 메서드 오버라이딩은 같은 메서드 이름에서 받는 인자가 틀릴 경우 맞는쪽으로 실행되는 개념
//
public class exercise {
    public static void main(String[] args) {
        //
        Child child_0 = new Child("이름", 20,"닉네임");
        child_0.printInfo();
        child_0.work();
        child_0.work("string data");
        child_0.work(65535);

        Student Student_0 = new Student("이름", 20, 180.0, 80.0);
        Student_0.printInfo();
    }
}

class Parent {
    //  field
    String name;
    int age;
    double height;
    double wegith;
    //  method
    void printInfo() {
        System.out.println("이름:"+name+",나이:"+age+",키:"+height+",몸무게:"+wegith);
    }
    //  자식 클래스에 이 메서드가 있으면 자식 클래스에서 우선 호출
    void work(){
        System.out.println("부모 클래스에서 메서드 호출함");
    }
    void work(String sData){
        System.out.println("부모 클래스에서 메서드 호출함, 전달 인자는 문자열 :"+sData);
    }
    void work(int iData){
        System.out.println("부모 클래스에서 메서드 호출함, 전달 인자는 정수 :"+iData);
    }
}

class Child extends Parent {
    //  field
    String nickname;
    //  constructor
    Child(String name, int age,String nickname){
        this.name = name;
        this.age = age;
        this.nickname = nickname;
    }

    //  method
    //  자식 클래스만이 가지고 있는 메소드로 부모 클래스 객체 생성에서 절대로 사용 못함
    void work(){
        System.out.println(nickname+"는 일하는 중.");
    }
}

class Student extends Parent {
    //  constructor
    Student(String name, int age, double height, double wegith){
        this.name = name;
        this.age = age;
        this.height = height;
        this.wegith = wegith;
    }
}