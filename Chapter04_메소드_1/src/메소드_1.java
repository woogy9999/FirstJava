//구구단 출력
public class 메소드_1 {
	static void gugudan()
	{
		for(int i=1; i<=9;i++) {
			for(int j=2;j<=9; j++) {
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan();
		return;
	}

}
