/*
1. 자바> 자바 정리(네트워크,데이터베이스)
2. 웹 데이터베이스 활용 / JSP 사용 / MVC 구조
3. 웹 Spring 관련 내용 습득, 데이터베이스 고급  >>80% 완료시 보통 취업
4. 웹 (개인프로젝트) > 신기술


*/
import java.io.*;
public class 반복문_6 {
	public static void main(String[] args) throws Exception{
		FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
		//String movie="";
		StringBuffer sb =new StringBuffer();
		
		
		int i=0; //문자 읽기.

		while((i=fr.read())!=-1) //-1 EOF(파일 끝)
		{
			sb.append((char)i);
			//movie+=(char)i;
			
		}
		fr.close();
		//System.out.println(movie);
		System.out.println(sb.toString());
	}
}
