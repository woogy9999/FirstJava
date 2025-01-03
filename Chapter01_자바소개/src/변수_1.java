/*
 *   프로그램 작성법 
 *   
 *   아이템 ===> 벤치마킹 ===> 요구사항분석 ===> 데이터베이스 설계
 *                             |
 *                           1. 어떤 데이터 
 *                           2. 어떤 기능 
 *   화면 UI ===> 기능 구현 ===> 테스트 ===> 배포 
 *   
 *   
 *   1. 프로그램에 필요한 데이터 저장 
 *      => 한개씩 메모리에 저장 => 변수 
 *      변수 메모리에 저장되는 공간의 이름 
 *      === 읽기(데이터 가지고 오기)
 *      === 쓰기(데이터를 저장) => 수정은 가능 ===> RAM(프로그램 종료시 사라진다)
 *      메모리 
 *      0=======
 *        사용중
 *      4=======
 *        사용중 
 *      8======= ==> 별칭 a
 *          10
 *      12=======
 *          사용중
 *      ..======= ==> b
 *           20
 *      ..=======
 *      
 *      변수 
 *      ======= 4byte ==> 큰것이 들어 갈 수 있다
 *      
 *      
 *      
 *      =======
 *      bit = byte
 *      1byte => 8bit => bit는 0,1울 채워주는 역할 
 *        ===============================
 *         부호비트 |  |  |  |  |  |  |
 *        ===============================
 *           |
 *           1:음수
 *           0:양수 
 *             64 32 16 8 4 2  1 ==> 127
 *           0 1 1 1 1 1 1 1
 *                 
 *      2byte => 16bit
 *           01(15)  ==> 32767
 *      4byte => 32bit ==> 21억 4천
 *      8byte => 64bit 
 *      
 *      100저장 
 *      
 *      ============= 데이터형 
 *      변수 선언 
 *      =======
 *      데이터형 변수명 
 *      ==> 저장할 메모리 크기 생성 => 별칭을 변수 
 *      ==> 변수 : 한개의 데이터를 저장하는 메모리 주소의 이름 
 *      ==> 모든 프로그램에 변수가 없는 프로그램은 존재하지 않는다 
 *              =========== 은퇴
 *              프로그램 : 변수/연산자/제어문 
 *              ======================== 관련된 내용을 묶어서 사용
 *              (입력 / 처리 / 결과 => 메소드) => 클래스
 *      자바에서 지원하는 기본형 / 데이터형 / 자료형 
 *      1) 정수 저장 
 *         1byte : byte => 파일읽기 / 네트워크 전송 
 *           저장하는 범위 : -128 ~ 127 
 *         2byte : short => C언어 호환 문제 => 거의 빈도가 없다 
 *           저장하는 범위 : -32768 ~ 32767
 *         4byte : int => 기본 : 컴퓨터는 모든 정수는 int로 인식 
 *                        정수의 디폴트 
 *           저장하는 범위 : -21억 4천 ~ 21억 4천 
 *         System.out.println(1000);
 *                           ======= int
 *         8byte : long => 금융권 / 증권 / 공기업 
 *      2) 실수 저장 
 *         float : 4byte => 소수점 : 6자리 
 *         double : 8byte => 소수점 : 15자리 
 *                  컴퓨터에서는 디폴트 (모든 실수는 double)로 인식
 *      3) 문자 저장 
 *         char : 2byte (멀티바이트=> Unicode)
 *                0~65535
 *                       1byte => 싱글바이트 => ASC 
 *                       0~255문자만 사용이 가능 => c/c++
 *                       브라우저 : C 
 *                       => 한글은 1글자당 2byte
 *      4) 논리(true/false) : 1byte 
 *          => true:1
 *          => false:0
 *     자바 기본형 
 *     로또 : 당첨금 => long
 *     => 재사용 
 *     ==========================================
 *              정수     실수    문자    논리 
 *     ==========================================
 *     1byte    ***byte              ***boolean
 *              -128~127               true/false
 *     ==========================================
 *     2byte    short          ***char : String 
 *              -32768~32767   0~65535
 *     ==========================================
 *     4byte   ***int     float(6자리)
 *             -21억4천~21억4천
 *     ==========================================
 *     8byte   ***long    ***double(15자리)
 *             2^63
 *     ==========================================
 *       * 구분 
 *          int / long 
 *                => 숫자(l,L)  10L
 *          float / double 
 *                =>  실수(f,F)  10.5F => float
 *                =>  10.5D => 생략이 가능 10.5
 *                
 *      큰데이터형 = 작은 값
 *      작은데이터형 = 큰 값(X)
 *      
 *      long = int 
 *      int = long => 오류 발생 
 *      double = int 
 *      
 *      데이터형 크기 
 *      byte < short < int < long < float < double
 *             char
 *      정수보다는 실수가 크다 (byte크기로 결정되지 않는다)
 *                         ======================
 *        => 수 표현 
 *        1 1.000000 1.000001 1.000012
 *   2. 저장된 데이터 활용 
 *   3. 결과물 출력    
 *   
 *   
 *   256 128 64 32 16 8 4 2 1(0)
 *    1   0   0  0  1 1 0 0 0
 *    
 *    
 *  1. 변수 => 선언 
 *     데이터형 변수명;
 *  2. 초기값을 설정 
 *     변수명=값
 *  3. 변경이 가능
 *     변수명=값 
 *  4. 출력 
 *     System.out.println(변수명)
 *   
 *  1) 변수를 만드는 방법 
 *     1. 알파벳이나 한글로 시작한다 
 *        단 알파벳은 대소문자 구분한다 
 *         a A
 *     2. 숫자 사용이 가능 
 *        (앞에 사용이 불가능)  1a(X)  a1 a2....
 *     3. 특수문자 사용이 가능 ( _ , $ ) 
 *        => _를 주로 사용 
 *           단어가 두개 
 *           kor_score
 *           _kor : 임시변수 
 *           file_name ., file_size ...  *** fileName
 *     4. 키워드는 사용 할 수 없다 
 *        ==== 자바에서 사용하는 단어 
 *     5. 공백을 사용할 수 없다 
 *        file name
 *     6. 문법(X) => 변수는 소문자로 시작한다 
 *     7. 문자의 길이는 상관없다 => 3~7
 *     8. 데이터 저장 (변수)
 *     
 *   2) 선언하는 방식 
 *      int a;
 *      int b;
 *      int c;
 *      int d;
 *      int e;
 *      
 *      => int a,b,c,d,e;
 *      변수 : 메모리 저장 공간 => 변경이 가능하다
 */
public class 변수_1 {
    //int a,b,c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //long a=2150000000L;
		//byte b=(byte)280;//127
		//System.out.println(b);
		float adadadadadadadadadadadadadadadadadad=10.5F;
		adadadadadadadadadadadadadadadadadad=11.5F;
		System.out.println(adadadadadadadadadadadadadadadadadad);
		
	}

}
