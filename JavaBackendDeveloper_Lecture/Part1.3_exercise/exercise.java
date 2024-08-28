//
//  연산자 : 데이터를 계산이나 비교 할때 사용하는 기호
//      산술 연산자 : + - * / % ++ --
//      관계 연산자 : == != >= <= > <
//      조건 연산자 : a ? b : c
//      논리 연산자 : && || !
//      대입 연산자 : = += -= *= /= %=
//      비트 연산자 : 
//
public class exercise {
    public static void main(String[] args) {
        //  산술 연산자
        System.out.println("add : 1 + 2 = " + (1 + 2));
        System.out.println("sub : 2 - 1 = " + (2 - 1));
        System.out.println("mul : 2 * 2 = " + (2 * 2));
        System.out.println("div : 6 / 2 = " + (6 / 2));

        //  몫과 나머지 출력
        int x = 10;
        int y = 3;
        //  # println에서는 %d와 같이 형식지정자가 안 먹힘.
        System.out.printf("%d / %d = 몫:%d , 나머지:%d \n", x, y, (x/y), (x%y));

        //  증감 연산자
        int i = 0;
        System.out.println("0: i = " + i);  //  0
        i++;
        System.out.println("1: i = " + i);  //  1
        i++;
        System.out.println("2: i = " + i);  //  2
        i--;
        System.out.println("3: i = " + i);  //  1
        i--;
        System.out.println("4: i = " + i);  //  0

        //  평균 구해서 출력
        //  결론적으로 정수를 정수로 나누면 정수값이 출력되지만 정수나 실수에 실수값으로 나누게 되면 실수값으로 출력이 됨
        //  추가적으로 정수로 계산 후 실수 타입으로 바꾸면 출력은 실수가 되지만 소수 부분은 계산이 안된 상태로 나온다. 즉 실수 형태로만 변환 됨
        int data_0 = 100;
        int data_1 = 200;
        int data_2 = 300;
        int data_3 = 400;

        int sum = data_0 + data_1 + data_2 + data_3;

        double avgInt = sum / 3;
        double avgFp = sum / 3.0;

        System.out.println("avg int = " + avgInt);
        System.out.println("avg fp = " + avgFp);

        double avgInt_typeConvert = (double)(sum / 3);

        System.out.println("avg int (type Convert) = " + avgInt_typeConvert);

        //  숫자 + 문자 연산
        int source = 100;

        System.out.println(source + 100);   //  200
        System.out.println(source + "100"); //  100100
        //System.out.println(source - "100"); //  Error
        //System.out.println(source * "100"); //  Error
        System.out.println(source + "K");   //  100K
        System.out.println(source + 'K');   //  175
        System.out.println(source * 'K');   //  7500
        System.out.println(source + 'ㄱ');  //  12693
        System.out.println(source * 'ㄱ');  //  1259300
        System.out.println(source + "ㄱ");  //  100ㄱ
        
        //  즉. 정수나 실수같은 일반 변수에 일반 숫자를 연산하면 그대로 산술 연산이 됨.
        //  일반 변수에 큰따옴표. 즉 String Data를 산술 연산하면 먹히지 않음, 덧셈의 기호가 덧셈이 아닌 문자열을 그대로 이어준다는것으로 받아들임
        //  일반 변수에 char형태 문자를 산술 연산하면 해당 문자가 가진 고유 값으로 산술연산이 가능해짐
        //  이러한 문자의 고유 값은 아스키코드표나 해당 문자를 지원하는 유니코드 등 값을 알수 있는 테이블을 참조해야함

        //  16진수 표현 방법
        int HexCode = 0xFFFF;
        System.out.format("Hex Code print = %x \n",HexCode);  //  100ㄱ

        //
    }
}