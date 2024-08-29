//
//  프로젝트로 생성하는 방법과 다른 클래스 (동일한 자바 파일인 경우 import없이 가능)
//
package com.main.board;

//  menu라는 패키지와 하위 클래스 호출
import com.main.board.mene.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Project!");
        
        //  동일한 클래스에서 메서드 호출시
        substart();

        //  다른 클래스에서 메서드 호출시
        new Start().main("Hello Class!");

        //  다른 패키지 와 클래스 하위 메서드 호출
        new Menu().menuFunction("Hello Package call Test");

        //  외부 클래스에서 상수 호출
        System.out.println("Start Class PI Val = " + Start.PI);
        System.out.println("Math Class PI Val = " + Math.PI);
        
    }

    //  동일한 클래스 다른 메서드  
    public static void substart(){
        System.out.println("Hello, method!");
    }
}

//  주의할점 : 하나의 클래스 파일에 public class는 대표로 하나만 사용이 가능하다.
class Start{

    public static final double PI = 3.14;

    public void main( String sData ){
        System.out.println(sData);
    }
}
