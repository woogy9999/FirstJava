package com.sist.music;

import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicMain {

	// 지니뮤직
	// 멜론
	// => 공통 (교집합) , 차집합 / 합집합

	public Set<String> genieMusic() {
		Set<String> set = new HashSet();

		try {

			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
			// 웹서버에 접근
			Elements title = doc.select("table.list-wrap a.title");
			for (int i = 0; i < title.size(); i++) {
				set.add(title.get(i).text());
			}
		} catch (Exception e) {

		}
		return set;
	}

	public Set<String> melonMusic() {
		Set<String> set = new HashSet();
		try {
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			// 웹서버에 접근
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			// System.out.println(title);
			for (int i = 0; i < title.size(); i++) {
				set.add(title.get(i).text());
			}

		} catch (Exception e) {

		}
		return set;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicMain mm = new MusicMain();
		Set<String> genie = mm.genieMusic();
		for (String music : genie) {
			System.out.println(music);
		}

		System.out.println("===============");
		Set<String> melon = mm.melonMusic();
		for (String music : melon) {
			System.out.println(music);
		}

		System.out.println("======차집합======");
		// 오라클 => MINUS removeAll()
//		
//		genie.removeAll(melon);
//		for(String music:genie) {
//			System.out.println(music);
//		}

		System.out.println("======동일곡 출력======");
//		// retainAll() => INTERSECT => JOIN
//		genie.retainAll(melon);
//		System.out.println("동일곡"+genie.size());
//		for (String music : melon) {
//			System.out.println(music);
//		}

		System.out.println("======멜론 +지니 (합집합)======");
		// UNION => addAll
		List<String> list = new ArrayList<String>();
		list.addAll(genie);
		list.addAll(melon);
		System.out.println("합집합 : "+list.size());
		for (String music : list) {
			System.out.println(music);
		}
		
		//중복제거
		Set<String> hap=new HashSet<String>();
		hap.addAll(list);
		System.out.println("======중복없는 곡======");
		System.out.println("총 개수 : "+hap.size());
		
		for (String music : hap) {
			System.out.println(music);
		}
		
		// addAll() : 모든 데이터 (합집합) / removeAll() : 차집합 / retainAll() : 교집합
		// => JOIN
	}

}
