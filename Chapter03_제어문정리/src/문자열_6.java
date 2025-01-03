/*
	문자 자르기 * 중요 *
	
	substring : 문자열을 자르기.
		지정된 위치부터 마지막까지 자르기
		Hello Java
		0123456789
		substring(6) Java
		중간에서 자르기
		substring(1,4) => ell
					   == endIndex -1
		--------------------------------javaScript 동일
*/
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String data="Hello.Hello.java";
		//System.out.println(data.substring(data.lastIndexOf(".")));
		String data="ID:admin,PWD:1234";
		String id=data.substring(data.indexOf(":")+1,data.indexOf(","));
		System.out.println(id);
		
		String pwd=data.substring(data.lastIndexOf(":")+1);
		System.out.println(pwd);
		
		String adress="서울 동대문구 회기동 346-14[새주소]     서울 동대문구 경희대로4길 76";
		System.out.println(adress.substring(0,adress.indexOf("[")));
		System.out.println(adress.substring(adress.indexOf("]")+2).trim());
		//trim() => 좌우의 공백을 제거
		
		String s="Hello.Java";
		String ss= s=s.substring((s.indexOf(" ")+1));
		System.out.println(ss);
	}

}
