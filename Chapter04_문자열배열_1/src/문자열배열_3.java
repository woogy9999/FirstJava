import java.util.*;
import com.sist.data.*;
public class 문자열배열_3 {

	/*	
		class Music{
		
		String title,singer,album,state;
		int modify
		
		}
		
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title=ArrayData.title;
		String[] singer=ArrayData.singer;
		String[] album=ArrayData.album;
		String[] state=ArrayData.state;
		int[] modify=ArrayData.modify;
		
		//String[][] music=new String[50][5]
		//Music[] music=new Music[50];
		
		System.out.println("Music Top50");
		for(int i=0; i<title.length; i++) {
			String s= state[i];
			String m="";
			if(s.equals("유지")) {
				m="-";
			}else if (s.equals("상승"))
			{
				m="▲ "+modify[i];
			}else if (s.equals("하강"))
			{
				m="▼ "+modify[i];
			}
			System.out.println((i+1)+"."+ m+" "+title[i]+" "+singer[i]+ " "+album[i]);
		}
		
		System.out.println("============================================");
//		Scanner scan=new Scanner(System.in);
//		System.out.println("카테고리 선택 : 곡명(1),가수명(2):");
//		int menu=scan.nextInt();
//		int count=0;
//		if(menu==1) {//제목
//			
//			System.out.println("제목 입력: ");
//			String name=scan.next();
//			for(int i=0; i<title.length; i++) {
//				if(title[i].contains(name)) {
//					System.out.println("노래명:"+title[i]);
//					System.out.println("가수명:"+singer[i]);
//					System.out.println("앨범:"+album[i]);
//					System.out.println("등폭:"+(state[i].equals("유지")?"유지":state[i]+" "+modify[i]));
//					System.out.println("================================");
//					count++;
//				}
//			}
//			System.out.println("총"+count+"건 검색");
//			
//		}else if(menu==2) { //가수명
//			System.out.println("가수명 입력: ");
//			String name=scan.next();
//			for(int i=0; i<singer.length; i++) {
//				if(singer[i].contains(name)) {
//					System.out.println("노래명:"+title[i]);
//					System.out.println("가수명:"+singer[i]);
//					System.out.println("앨범:"+album[i]);
//					System.out.println("등폭:"+(state[i].equals("유지")?"유지":state[i]+" "+modify[i]));
//					System.out.println("================================");
//					count++;
//				}
//			}
//			System.out.println("총"+count+"건 검색");
//		}
		
		
		//등폭(상승,하강)이 가장 많은 노래명, 가수명을 출력
		
		int high=0;
		int count=0; // 가변형
		for(int i=0; i<50; i++) {

			if(modify[i]>high) {
				high=modify[i];
			}
		}
		for(int i=0; i<50; i++) {
			if(modify[i]==high) {
				count++;
			}
		}
		System.out.println("high :"+high);
		System.out.println("배열 갯수:"+count);
		
		int[] arr=new int[count];
		int j=0;
		
		for(int i=0; i<50; i++) {
			if(high==modify[i]) {
				arr[j]=i;
				j++;
			}
		}
		
		for(int i:arr) {
			System.out.println(title[i]+""+singer[i]);
		}
		
	}

}
