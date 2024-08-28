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
		
		//
		//  변수 선언 및 초기화
		//
	
		//  32비트 정수 선언 및 초기화
		int int32Data = 2147483647;
		//  64비트 정수 선언 및 초기화 >> 반드시 데이터 끝에 L을 붙여 long Type인것을 명시함
		long int64Data = 9223372036854775807L;
		//  32비트 실수 선언 및 초기화 >> 반드시 데이터 끝에 L을 붙여 float Type인것을 명시함
		float f32Data = 3.4028235e38f;
		//  64비트 실수 선언 및 초기화
		double f64Data = 1.7976931348623157e308;
		//  문자 선언 및 초기화
		char cData = 'T';
		//  bool tyep 선언 및 초기화
		boolean bFlag = true;
		//  문자열 선언 및 초기화
		String sData = "Hello String Data!";
	
		//  출력 테스트
		System.out.println("int32Data="+int32Data);
		System.out.println("int64Data="+int64Data);
		System.out.println("f32Data="+f32Data);
		System.out.println("f64Data="+f64Data);
		System.out.println("cData="+cData);
		System.out.println("bFlag="+bFlag);
		System.out.println("sData="+sData);
	}
}