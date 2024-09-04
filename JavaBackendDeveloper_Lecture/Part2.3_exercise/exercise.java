//
//  배열 
//
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        //  배열 선언
        //  2차원 배열은 int[][] sData 이런식으로 하면 되고 그 이상의 차원 배열 역시 []를 증가 시키면 된다.
        int[] sData;
        //  배열 초기화
        sData = new int[32];
        
        //System.out.println("sData="+sData);
        
        //  배열 길이
        int len_string = sData.length;

        System.out.println("sData size="+len_string);

        //  for문으로 배열 출력
        for(int i = 0; i < len_string ; i++){
            sData[i] = i;
            System.out.printf("[%d]",sData[i]);
        }
        System.out.printf("\n");

        //  향상된 for문
        //  for(변수명:배열명)
        //      이 for문은 배열의 길이 만큼 배열 요소가 자동으로 변수에 매핑되 들어와 반복 출력 및 특정 작업을 수행 할 수 있음
        int[] eforTest;
        eforTest = new int[]{5,10,15,20,25};

        //  여기서 int x:eforTest의 의미는 x에 eforTest가 하나씩 들어간다는 의미
        for(int x:eforTest){
            System.out.println("data="+ x);
        }

    }
}
