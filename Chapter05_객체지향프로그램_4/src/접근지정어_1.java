



	/*	추상클래스, 인터페이스 => 구현(x)
	 *  서로 다른 클래스를 연결해서 사용
	 *  클래스 여러개 제어
	 *  결합성을 낮게 만들 수 있다
	 *  
	 *  
	 *  지역변수 : 접근지정어가 필요없다 (메소드 안에서만 사용이 가능
	 *  		=> 상수(final)
	 *   객체지향의 3대 특성(권장)
	 *   1.캡슐화
	 *   2.상속
	 *   3.다형성
	 *   4.추상화
	 */

class Sawon {
	public Sawon() {
		// TODO Auto-generated constructor stub
	}
}

class Member{
	private String id; // Member 클래스 안에서만
	protected String pwd; //같은 폴더 
	int age;			  //같은 폴더
	public String name;	//모든 클래스
	
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m=new Member();
		m.pwd="";
	}

}
