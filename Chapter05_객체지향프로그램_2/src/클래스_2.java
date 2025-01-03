class Student {
	int hakbun = 1;
	String name = "홍길동";
	String sex = "남자";

	Student() {

		System.out.println("Student 디폴트 생성자");
		hakbun = 2;
		name = "심청이";
		sex = "여자";
	}

	Student(int h, String n, String s) {

		hakbun = h;
		name = n;
		sex = s;
	}

	Student(int h, String n) {
		// 생성자 => 자신의 생성자 호출
		this();
		hakbun = h;
		name = n;
	}

	Student(String h, String n) {
		this(5, "이산");
		name = h;
		sex = n;
	}
	//Student(10.5,'A',100)
	Student(int a, int b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	Student(int a, double b, int c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	Student(double a, double b, double c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class 클래스_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student lee = new Student(2, "이순신");
		System.out.println("이름 :" + lee.name);
		System.out.println("성별 :" + lee.sex);
		System.out.println("학번 :" + lee.hakbun);

		Student kim = new Student("김두한", "남자");
		System.out.println("이름 :" + kim.name);
		System.out.println("성별 :" + kim.sex);
		System.out.println("학번 :" + kim.hakbun);
		
		Student d=new Student(10.5,'A',100);
	}

}
