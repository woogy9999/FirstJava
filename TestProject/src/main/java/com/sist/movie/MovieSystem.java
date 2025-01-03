package com.sist.movie;
import java.util.*;
import java.io.*;

public class MovieSystem {
	// 영화 전체 정보 => 모든 사용자가 공유
	static Movie[] movies=new Movie[1938];
	
	// 초기화
	static
	{
		try {
			//파일 전체 읽기
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			int i=0;
			StringBuffer sb=new StringBuffer();
			//String data="";
			while((i=fr.read())!=-1) {
				
				sb.append((char)i);
				
				
			}
			fr.close();
			//System.out.println(sb.toString());
			String data=sb.toString();
			
			//분리
			String[] temp=data.split("\n");
			//영화 한개에 대한 정보
			int j=0;
			for(String s:temp) {
				movies[j]=new Movie();
				String[] ss=s.split("\\|");
				movies[j].no=ss[0];
				movies[j].title=ss[1];
				movies[j].genre=ss[2];
				movies[j].poster=ss[3];
				movies[j].actor=ss[4];
				movies[j].regdate=ss[5];
				movies[j].grade=ss[6];
				movies[j].director=ss[7];
				j++;
			}
			
			
		}catch (Exception ex) { // io=> 파일 입력 출력 => 반드시 예외처리
			// TODO: handle exception
			
		}
	} 
	// 목록 => 페이지를 나눠서 처리
	public Movie[] movieListData(int page)
	{
		final int ROWSIZE =20;
	//	int i=0;
		int start=(page-1)*ROWSIZE;
	//	int pagecnt=(page*ROWSIZE)-ROWSIZE;
		int end=page*ROWSIZE;
		int totalpage=(int)(Math.ceil(movies.length/20.0));
		//						올림함수
		int ARRSIZE=20;
		if(page==totalpage) {
			end=page*ROWSIZE-2;
			ARRSIZE=18;
		}
		Movie[] movieData=new Movie[ARRSIZE];
		
		int j=0;
		for(int i=start; i<end; i++) {
			movieData[j]=movies[i];
			j++;
		}
		return movieData;
	}
	// 상세보기
	public Movie movieDetail(int no) 
	{
		return movies[no-1];
	}
	
	// 검색
	
	
}
