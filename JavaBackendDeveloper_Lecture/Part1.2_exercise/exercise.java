public class exercise {

    public static void main(String[] args) {
        //  문자열
        System.out.println("String Data Type");

        //  숫자
        System.out.println(100);

        //  연산 : 숫자 + 숫자
        System.out.println(100 + 200);

        //  연산 : 변수 + 숫자
        int temp = 200;
        System.out.println(temp + 200);

        //  변수 변경
        System.out.println("temp=" + temp);
        temp = 500;
        System.out.println("new temp=" + temp);

        //  상수
        final int constVal = 500;
        System.out.println("constVal=" + constVal);
        //  상수는 선언 순간 부터 고정값으로 변수마냥 변경하려고 하면 Error가 발생
        //constVal = 1;
    }
}