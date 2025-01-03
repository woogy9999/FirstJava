//64page
public class 자바선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = (int) (Math.random() * 12) + 1;

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println(month + "월은 겨울입니다");
			break;
		}
		
	}

}
