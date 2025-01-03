class B
{
	int a;
	int b;
}
public class 객체지향_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=a;
		B aa=new B();
		aa.a=100;
		aa.b=200;
		
		B bb=aa;// 같은 주소를 가지고 있으면 같은 주소를 제어
		System.out.println(aa+" "+bb);
		
		System.out.println("bb.a="+bb.a);
		System.out.println("bb.b="+bb.b);
		
		bb.a=1000;
		bb.b=2000;
		// 주소 참조해서 제어 => Call By Reference
		
		System.out.println("aa.a="+aa.a);
		System.out.println("aa.b="+aa.b);

		String s1="Hello";
		String s2=s1;
		System.out.println("s2="+s2);
		s2="JAVA";
		System.out.println("s1="+s1);
	
	
	
	}

}
