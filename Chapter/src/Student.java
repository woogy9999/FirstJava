
public class Student implements Gamer{
	String name;
	int score;
	
	Student(String name, int score){
		this.name=name;
		this.score=score;
		
	}
	
	public void doGame() {
		System.out.println(name+" 게임을 한다");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
