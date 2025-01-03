package com.sist.music;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicSystem {


	/*
		가요
		POP
		OST
		트롯
		JAZZ
		CLASSIC
		
	*/
	private String[] url = { "", "https://www.genie.co.kr/chart/top200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0100",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0300",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0107",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0500",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20241217&genrecode=M0600", };

	public MusicVO[] musicData(int type) {
		MusicVO[] music = new MusicVO[50];
		
		try {

			// 사이트의 html 읽어온다
			Document doc = Jsoup.connect(url[type]).get();
			// 필요한 값 => HTML(태그 ) <> => 자바 : Element
			Elements title = doc.select("table.list-wrap td.info a.title");
			//System.out.println(title);
			Elements singer = doc.select("table.list-wrap td.info a.artist");
			Elements album = doc.select("table.list-wrap td.info a.albumtitle");

			for (int i = 0; i < 50; i++) {
				music[i] = new MusicVO();
				music[i].setTitle(title.get(i).text());
				music[i].setSinger(singer.get(i).text());
				music[i].setAlbum(album.get(i).text());
			}
		} catch (Exception e) {
			return music;
			// TODO: handle exception
		}
		return music;
	}
}
