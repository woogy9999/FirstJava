
public class interfaceTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kim=new Student("김둘리",83);
		System.out.println("게임의 최고 레벨 : "+Gamer.GAME_MAX_LEVEL);
		kim.doGame();
		System.out.println(kim.name+"의 점수"+kim.score);
		
	}

}
