
import java.io.FileReader;
import java.util.Scanner;

public class 메소드_1 {

	// 화면에 출력 => 결과값이 없다. ==> void
	static String movieData = "";
	static // 실행시에 자동 인식
	{ /*
		 * 예외처리 => 에외 복구 try~catch(복구) => 예외 회피 => 컴파일러에 예외 => 알려주는 역할
		 */
		try {
			// 정상 수행
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0; // 단점 => char X , int
			StringBuffer sb = new StringBuffer();
			while ((i = fr.read()) != -1) {
				sb.append((char) i);
			}
			movieData = sb.toString();
			fr.close();
		} catch (Exception ex) {
			// 에러발생 => 복구
		} // 예외처리

	}

	static void menu() {
		System.out.println("=======Menu======");
		System.out.println("1. 영화목록");
		System.out.println("2. 영화 상세");
		System.out.println("3. 영화 검색(영화명)");
		System.out.println("4. 영화 검색(출연진)");
		System.out.println("5. 종료");
		System.out.println("==================");
	}

	static void movieList(int page) {

		String[] movie = movieData.split("\n");
		int i = 0; // for 횟수
		int j = 0; // 20개씩
		final int ROWSIZE = 20; // 시작점
		int pagecnt = (page * ROWSIZE) - ROWSIZE;
		// 1page => 0
		// 2page => 20 배열이 0번부터 시작
		// 3page => 40
		for (String s : movie) {
			// System.out.println(s);
			if (j < 20 && i >= pagecnt) {

				String[] md = s.split("\\|");
				System.out.println(md[0] + "." + md[1]);
				j++;

			}
			i++;
		}
	}

	// 상세보기 => 데이터
	static void movieDetail(int movieNo) {
		String[] movie = movieData.split("\n");
		for (String s : movie) {
			// 영화 한개 => 정보 - !
			String[] info = s.split("\\|");

			if (info[0].equals(String.valueOf(movieNo))) {
				System.out.println("영화명:" + info[1]);
				System.out.println("장르:" + info[2]);
				System.out.println("출연:" + info[4]);
				System.out.println("개봉일:" + info[5]);
				System.out.println("등급:" + info[6]);
				System.out.println("감독:" + info[7]);
				break;
			}
		}
	}

	// 영화명으로 찾기
	static void titleFind(String mn) {
		String[] movie = movieData.split("\n");
		for (String s : movie) {
			// 영화 한개 => 정보 - !
			String[] info = s.split("\\|");
			if(info[1].contains(mn)) {
				System.out.println(info[1]+"("+info[4]+")");
				
			}
		}
	}

	// 출연진으로 찾기
	static void actorFind(String actor) {
		String[] movie = movieData.split("\n");
		for (String s : movie) {
			// 영화 한개 => 정보 - !
			String[] info = s.split("\\|");
			if(info[4].contains(actor)) {
				System.out.println(info[1]+"("+info[4]+")");
				
			}
		}
	}
	// 조립 ==> 다른 클래스에서 연결해서 사용이 가능

	// 다른 클래스 연결해서 사용 / 재사용
	static void process() {
		// System.out.println(movieData);
		Scanner scan = new Scanner(System.in);
		while (true) {

			menu();
			System.out.print("메뉴 선택 : ");
			
			int m = scan.nextInt(); 
			scan.nextLine();
			if (m == 5) {
				System.out.println("프로그램 종료");
				break;

			} else if (m == 1) {
				System.out.print("페이지 입력 : (1~");
				int page = scan.nextInt();
				movieList(page);
			} else if (m == 2) {
				System.out.print("영화 선택(1~1938):");
				int no = scan.nextInt();
				movieDetail(no);

			} else if (m==3) {
				System.out.print("영화명 입력:");
				String mn=scan.next();
				titleFind(mn);
			}else if (m==4) {
				System.out.print("출연진 입력:");
				String actor=scan.nextLine();
				actorFind(actor);
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 가급적 main에서 소스 코딩을 사용하지 않는다
	}

}
