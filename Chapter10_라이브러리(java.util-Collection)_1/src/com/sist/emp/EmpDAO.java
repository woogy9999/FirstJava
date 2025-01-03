package com.sist.emp;

import java.sql.*;
import java.util.*;

public class EmpDAO {
	private Connection conn; // 연결 객체
	private PreparedStatement ps;
	// => 오라클 => 데이터 => 오라클에서 실행이 가능한 문장을 전송

	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	// jdbc:업체명:드라이버명:@IP:PORT:데이터베이스명
	// 자바 지원이 아니라 해당 데이터베이스업체 지원

	// 1. 싱글턴 => 객체를 한번만 생성
	private static EmpDAO dao;

	// 2. 드리아버 등록 => 1번 등록 => 생성자
	public EmpDAO() {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 클래스 정보를 읽어서 메모리 할당 => 리플렉션
			// 클래스가 가지고 있는 변수 메소드 / 생성자 제어
			// -----------------------------------스프링
			// 스프링: 객체의 생명주기 (컨테이너)
			// => JSP (MVC => 구조 : 스프링 형식)
			// 2차 => 1차 프로젝트가 어렵다
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static EmpDAO newInstance() {
		if (dao == null) {
			dao = new EmpDAO();

		}
		return dao;
	}

	// 1. 반복 제거
	// => 연결 / 닫기
	public void getConnection() {
		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
			// conn hr/happy
		} catch (Exception e) {
		}
	}

	public void disConnection() {
		try {
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
			// exit
		} catch (Exception e) {

		}
	}

	// 검색
	public TreeSet<String> empGetNames() {
		TreeSet<String> set = new TreeSet<String>();
		try {
			// 1. 연결
			getConnection();
			// 2. 오라클 => SQL문장
			String sql = "SELECT ename FROM emp";
			// 3. 오라클 전송
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				set.add(rs.getString(1));

			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return set;

	}

	// 직위 => 중복 => 중복제거
	public HashSet<String> empGetJobs() {
		HashSet<String> set = new HashSet<String>();

		try {
			// 1. 연결
			getConnection();
			// 2. 오라클 => SQL문장
			String sql = "SELECT job FROM emp";
			// 3. 오라클 전송
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				set.add(rs.getString(1));

			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return set;
	}
	// 사원의 모든 정보 => 목록 (ArrayList)
}
