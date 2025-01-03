package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.sist.vo.*;

/*
	1. 목록 => 페이지 나누기 => ArrayList
	2. 상세보기 => MusicVO 
				=> 버튼 클릭 => 동영상 실행
	3. 검색 => ArrayList
	4. 게시판 => LinkedList
	5. 구매 => Map
	6. 찜하기 => Set
	--------------------------------------
	

*/
public class MusicDAO {
	// 연결 객체
	private Connection conn;
	// SQL문장 전송 객체
	private PreparedStatement ps;
	// URL을 등록
	private final String URL = "jdbc:oracle:thin:@211.238.142.124:1521:XE";

	// 싱글턴 => 열기 / 닫기
	private static MusicDAO dao;

	// => ArrayList
	// 1. 드라이버 등록
	public MusicDAO() {
		try {

			// ojdbc8.jar => 자바에서 지원(X) => 오라클에서 지원
			// mvnrepository.com
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

	// 2. 오라클 연결
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
			// 오라클 => conn hr/happy
		} catch (Exception e) {

			e.printStackTrace();
		}
		{

		}
	}
	// 3. 오라클 닫기

	public void disConnection() {
		try {
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DAO는 사용자당 1개만 사용이 가능하게 만든다
	// ----------------------------------
	// => 싱글턴

	/*
	 * 디자인 패턴 => 싱글턴 => Static => 팩토리 패턴 => Map => MV 패턴 => JSP (Java+HPTML) | |
	 * model view => MVC 패턴 => Observer => prototype
	 * 
	 * 문법 => 형식 응용 디자인패턴 / 알고리즘
	 * 
	 */

	public static MusicDAO newInstance() {
		if (dao == null)
			dao = new MusicDAO();
		return dao;
	}

	// 4. 뮤직 목록 출력
	// 5. 뮤직 상세보기
	// 6. 뮤직 검색
	public List<MusicVO> musicFindData(String fd) {
		List<MusicVO> list = new ArrayList<MusicVO>();
		try {
			getConnection();
			// 2. 오라클로 전송할 문장
			String sql = "SELECT mno,title,singer,album,poster " 
						+ "FROM genie_music " 
					    + "WHERE title LIKE '%'||?||'%'";
			
			// contains() => LIKE => REGEXP_LIKE
			// 3. sql을 전송
			ps = conn.prepareStatement(sql);
			// 4. ?에 값을 채운다
			ps.setString(1, fd);
			// 5. 실행후에 결과값을 가지고 온다
			ResultSet rs = ps.executeQuery();
			// 6. List에 값을 채운다
			while (rs.next())// 처음부터 마지막까지 읽어온다
			{
				// 한줄씩 읽어온다
				MusicVO vo = new MusicVO();
				vo.setMno(rs.getInt(1));
				vo.setTitle(rs.getString(2));
				vo.setSinger(rs.getString(3));
				vo.setAlbum(rs.getString(4));
				vo.setPoster(rs.getString(5));
				list.add(vo);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return list;
	}
}
