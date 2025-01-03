
public class 문자열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Hello Java";
		String s2="Hello Java";
		String s3=new String("Hello Java");
		// == 메모리 주소 비교. equals는 저장되어 있는 문자열 비교
		// equalsIgnoreCase는 대소문자 구분 없음
		// 나머지 String모든 메소드는 대소문자를 구분
		if(s1==s2) {
			System.out.println("s1==s2");
		}else {
			System.out.println("s1!=s2");
		}
		
		if(s1==s3) {
			System.out.println("s1==s3");
		}else {
			System.out.println("s1!=s3");
		}
	}

}
