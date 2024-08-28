//
//  반복문
//      for문
//      while문
//
public class exercise {
    public static void main(String[] args) {
        //  for문 : 일정 횟수 반복에 용이, 조건이 맞는 동안 동작하며 만약 조건없이 for(;;)하게 되면 무한 루프가 된다
        //  for( 초기화 ; 조건식 ; 증감식 ) { 
        //      //  처리내용
        //  }
        for(int i = 0 ; i < 10 ; i++ ){
            System.out.println("for data="+i);
        }

        //
        //  while문과 do while문은 항상 반복이 종료 되는 조건을 가지거나 도중에 종료 할 수단이 있어야 함. 그렇지 않으면 무한 반복하는 사태가 발생하므로 유의
        //

        //  while문 : 반복에 앞서 조건을 먼저 보고 비교하여 반복함
        boolean loopflag = true;
        int count = 0;

        //  불 변수로 제어
        while(loopflag){
            System.out.println("while (bool control)data="+count);
            count++;
            if(count >= 10){
                loopflag = false;
            }
        }

        //  조건문으로 제어
        count = 0;
        while(count < 10){
            System.out.println("while (val control) data="+count);
            count++;
        }

        //  do while문 : while문과 다른점은 무조건 최초 1번 실행 후 그다음 조건문을 비교하여 반복할지 결정
        count = 100;
        do{
            System.out.println("do while (false start) data="+count);
        }while(count != 100);

        do{
            System.out.println("do while (true start) data="+count);
            count++;
        }while(count < 110);

        //
        //  *조건식 없이 반복문 탈출 하려면 break사용
        //
        count = 0;
        while(true){
            System.out.println("while (break test) data="+count);
            count++;
            if (count >= 110){
                break;
            }
        }

        //
        //  continue : 반목분에서 이 구문을 실행하게 되면 완전 종료가 아닌 해당 회차 처리가 생략됨. 즉 skip으로 생각하면 됨
        //
        for(int i = 0 ; i < 15; i++){
            //  여기서는 1~14 숫자 중 3의 배수만 출력을 생략하고 ------로 대체
            if( i % 3 == 0){
                System.out.println("------------------------");
                continue;
            }
            System.out.println("for ( continue ) data="+i);
        }

        //
        //  이중 중첩문 : 반복문 내 또 다른 반복문을 배치하여 사용하는것으로 주로 2차원적인 배열을 처리할때 사용
        //  당연하지만 안쪽 for문이 우선 동작 하기 때문에 고려하여 어떤 변수를 먼저 투입할지 결정한다
        //
        for(int y = 0 ; y < 10 ; y++){
            for(int x = 0 ; x < 10 ; x++ ){
                System.out.printf("[%d,%d]",x,y);
            }
            System.out.printf("\n");
        }
    }
}