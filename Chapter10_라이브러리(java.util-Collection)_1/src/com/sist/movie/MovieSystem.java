package com.sist.movie;

import java.util.*;
import java.io.*;

public class MovieSystem {
	private static ArrayList<Movie> movieList = new ArrayList<Movie>();

	// 초기화
	static {
		// 생성자 => 초기화 블록을 이용한다
		// 자동 저장

		try {
			// IO => CeckException
			// Ja.k. (java.io)
			FileReader fr = new FileReader("c:\\\\javaDev\\\\movie.txt");
			StringBuffer sb = new StringBuffer();
			int i = 0;
			while ((i = fr.read()) != -1) {

				sb.append((char) i);
			}
			fr.close();
			// 데이터 분리
			String data = sb.toString();
			String[] movies = data.split("\n");

			for (String movie : movies) {
				String[] ss = movie.split("\\|");
				Movie m = new Movie();
				m.setMno(Integer.parseInt(ss[0]));
				m.setTitle(ss[1]);
				m.setGenre(ss[2]);
				m.setPoster(ss[3]);
				m.setActor(ss[4]);
				m.setRegdate(ss[5]);
				m.setGrade(ss[6]);
				m.setGrade(ss[7]);

				movieList.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 전체목록
	public ArrayList<Movie> movieListData() {
		return movieList;
	}

	// 상세보기
	public Movie movieDetailDate(int mno) {
		Movie m = new Movie();
		for (Movie mm : movieList) {
			if (mm.getMno() == mno) {
				m = mm;
				break;
			}
		}
		return m;
	}

	 // 검색 => 제목 
    public ArrayList<Movie> movieFindTitle(String title)
    {
    	ArrayList<Movie> list=
    			new ArrayList<Movie>();
    	// 배열 크기 확인 => 데이터 수집 
    	// 자동으로 메모리 크기가 결정 
    	for(Movie m:movieList)
    	{
    		if(m.getTitle().contains(title))
    		{
    			list.add(m);
    		}
    	}
    	return list;
    }
    // 검색 => 출현진 
    public ArrayList<Movie> movieFindActor(String actor)
    {
    	ArrayList<Movie> list=
    			new ArrayList<Movie>();
    	// 배열 크기 확인 => 데이터 수집 
    	// 자동으로 메모리 크기가 결정 
    	for(Movie m:movieList)
    	{
    		if(m.getActor().contains(actor))
    		{
    			list.add(m);
    		}
    	}
    	return list;
    }
    // 검색 => 장르 
    public ArrayList<Movie> movieFindGenre(String genre)
    {
    	ArrayList<Movie> list=
    			new ArrayList<Movie>();
    	// 배열 크기 확인 => 데이터 수집 
    	// 자동으로 메모리 크기가 결정 
    	for(Movie m:movieList)
    	{
    		if(m.getGenre().contains(genre))
    		{
    			list.add(m);
    		}
    	}
    	return list;
    }
    // => SELECT
}