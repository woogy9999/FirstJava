/*
	문자의 위치 찾기
	indexOf(문자) => 문자열 처음부터 -- 지정된 문자 찾음
	lastIndexOf(문자) => 문자열 뒤에서부터
	**없는 경우 -1
	=>확장자?
	

*/
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Hello Java";

		int a = data.indexOf("a");
		int b = data.lastIndexOf("a");
		int c = data.indexOf("c");
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		
	}

}
