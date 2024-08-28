//
//  조건문
//      if문 형태
//      switch문 형태
//      삼항연산자
//
public class exercise {
    public static void main(String[] args) {
        
        //  if문으로 성인 구분
        //      *if문의 조건에 boolean변수로 제어 할 수 있음.
        int age = 20;

        if((age<19)&&(age>=0)){
            System.out.println("미성년자 입니다.");
        }
        else if(age>=19){
            System.out.println("성인 입니다."); 
        }
        else{
            System.out.println("잘못된 입력값입니다."); 
        }

        //  삼항연산자 사용
        //  조건 ? <참> : <거짓>
        boolean flag = true;
        String sData;

        sData = flag ? "제시한 조건은 참" : "제시한 조건은 거짓";
        System.out.println(sData); 

        //  switch
        //  조건에 따라 case 문으로 이동하여 처리하는 방식으로 case문 마다 break로 끊어주기도 가능.
        //  여기서 조건은 다음 변수로 사용 가능
        //      1. 일반 숫자 데이터
        //      2. 문자열 데이터
        //      3. enum 타입 가능
        //  
        //  switch(조건) {
        //      //  조건1이 해당하는 경우
        //      case 조건1:
        //          처리내용
        //          break;
        //      ...
        //      //  조건3,4,5가 해당하는 경우
        //      case 조건3:
        //      case 조건4:
        //      case 조건5:
        //          처리내용
        //          break;
        //
        //      //  제시한 조건이 해당하지 않는 경우
        //      default:
        //          처리내용
        //          break;
        //  }

        int selectNum = 4;

        switch(selectNum){
            case 0:
                System.out.println("0을 선택함"); 
                break;

            case 1:
                System.out.println("1을 선택함"); 
                break;

            case 2:
                System.out.println("2을 선택함"); 
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("3,4,5중 하나를 선택함"); 
                break;

            default:
                System.out.println("잘못된 입력"); 
                break;
        }
    }
}