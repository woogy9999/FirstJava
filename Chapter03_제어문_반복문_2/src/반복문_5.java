import java.io.*;
public class 반복문_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("C:\\javaDev\\javaStudy\\Chapter03_제어문_반복문_2\\src\\반복문_4.java");
	
		int i=0; // => 한글자씩 읽어옴 => 문자(x) 정수로 읽어옴
		
		//횟수를 모르는 경우
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}

}
