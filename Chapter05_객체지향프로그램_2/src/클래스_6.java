
class Rand {
	int[] arr = new int[5];
	static int[] arr2 = new int[5];// 이미 저장
	
	{
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
	}

	Rand() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
		}
	}

	static {
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 100) + 1;
		}
	}
}

public class 클래스_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rand r = new Rand(); // arr이 저장되는 상태
		// r=>arr => 메모리가 따로 따로 저장
		// 접근시 => 객체명.변수 , 객체명.메소드
		for (int i = 0; i < r.arr.length; i++) {
			System.out.print(r.arr[i]+" ");
		}
		// static => 클래스명.변수 , 클래스명.메소드
		// Math.random() String.valueOf()
		/*
		 * String s=""; s.substring()
		 */
		for (int i = 0; i < Rand.arr2.length; i++) {
			System.out.println(Rand.arr2[i]);
		}

	}

}
