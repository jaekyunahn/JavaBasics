//
//  패키지 : 패키지는 폴더의 개념으로 클래스 파일들을 관련 있는것들끼리 묶어 보다 관리가 쉽게 하기 위한 기법
//      # 네임드 룰 : 패키지는 소문자로 시작, 클래스는 대문자로 시작. 에러는 아니지만 관례적으로 함
//
package com.test.service;

//  다른 패키지에 있는 클래스 호출하기 위해 import선언
import com.test.slave.sub;

public class exercise {    
    public static void main(String[] args) {
        System.out.println("Hello Package test (Main)!");

        //  호출하려는 매서드를 다음과 같이 new class명().메서드명(); 
        new sub().packageTest();
    }
}