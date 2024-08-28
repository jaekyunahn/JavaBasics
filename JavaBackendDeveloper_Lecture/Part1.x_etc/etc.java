//
//  기타 연습장
//

public class etc {
    public static void main(String[] args) {
        //
        //  class 추가 후 메서드 호출하기
        //
        double x = 2.0;
        double y = 4.0;
        double z = 10.0;
        double res = 0.0;
        
        res = lib.fmac(x, y, z);

        System.out.println("res = " + res);

        //
        //  문자열 출력시 정렬
        //
        System.out.printf("%5s\n","ABCDE");

        //  알파벳 A를 5칸 이내에 우측에 배치
        System.out.printf("%5s\n","A");
        //  알파벳 A를 5칸 이내에 좌측에 배치
        System.out.printf("%-5s\n","A");

    }
}

//  신기한건 같은 java코드 파일 내 다른 클래스인데 빌드하면 클래스파일이 분리되어 나옴
class lib {
    //  (x * y) + z
    public static double fmac(double x, double y, double z){
        return ( x * y ) + z;
    }
}