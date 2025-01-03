//replaceAll("","")

public class 문자열_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Hello 자바 1234";
		//한글만 출력
		
		System.out.println(data.replaceAll("[^가-힣]",""));
		
		System.out.println(data.replaceAll("[^A-Za-z]",""));
		
		System.out.println(data.replaceAll("[^0-9]",""));
	}

}
