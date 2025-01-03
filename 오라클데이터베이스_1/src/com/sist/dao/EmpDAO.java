package com.sist.dao;

/*
 		오라클 연동
 		--------
 		1. 드라이버 설치
 			=> 한번만 설정
 			=> 생성자 이용
 			=> Class.forName("드라이버명")
 							  -------- oracle.jdbc.driver.OracleDriver
 							  -------- com.mysql.cj.jdbc.Driver
 		2. 오라클 연결
 		   Connection conn=DriverManager.getConnection(URL,"hr","happy")
 		
 		3. 오라클로 SQL문장 전송
 		
 			PreparedStatment ps=conn.preparedStatment(sql)
 		4. 오라클에서 SQL실행하고 결과값 요청
 			ResultSet rs=ps.executeQuery();
 		
 		=> rs.close()
 		=> ps.close()
 		=> conn.close()
 		
 */
import java.util.*;
import java.sql.*;
import com.sist.vo.*;

public class EmpDAO {

	private Connection conn;
	private PreparedStatement ps;

	private static EmpDAO dao;
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";

	public EmpDAO() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ojdbc8.jar
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// TCP => Socket을 이용해서 오라클로 SQL문장을 전송
	// =_ 오라클 서버 => 자바응용프로그램 : Client
	// 4. 기능
	// 4-0 오라클 연결 / 오라클 연결 해제
	public void getConnection() {

		try {
			conn = DriverManager.getConnection(URL, "hr", "happy");
			//
		} catch (Exception e) {

		}
	}

	public void disConnection() {
		try {
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
		}
	}

	// 4-0-1 : 싱글턴 => 메모리 공간을 한개만 생성
	public static EmpDAO newInstance() {
		if (dao == null) {
			dao = new EmpDAO();
		}
		return dao;
	}

	// ------------------------------------------ 항상 => jar
	// 2차 => JSP :MyBatis (XML) => Jquery,Ajax
	// 4-1 : 목록 => SELECT column_list
	public List<EmpVO> empListData(int type) {
		List<EmpVO> list = new ArrayList<EmpVO>();
		String order = "";
		if (type == 1)
			order = "ORDER BY empno ASC";
		else if (type == 2)
			order = "ORDER BY hiredate DESC";
		else if (type == 3)
			order = "ORDER BY ename ASC";

		try {
			// 1. 오라클 연결
			getConnection();
			// 2 . SQL문장 제작
			String sql = "SELECT empno,ename,job,hiredate FROM emp " + order;
			// 3. 오라클로 전송
			ps = conn.prepareStatement(sql);
			// 4. SQL을 실행후에 결과값을 가지고 온다
			ResultSet rs = ps.executeQuery();

			while (rs.next()) { // 처음부터 마지막까지 데이터를 읽어옴
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				list.add(vo);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 오라클 해제
			disConnection();
		}
		return list;
	}

	// 4-2 정렬 => ORDER BY
	// 4-3 상세보기 => WHERE
	public EmpVO empDetailData(int empno) {
		EmpVO vo = new EmpVO(); // 사원 한명에 대한 정보
		try {
			// 연결
			getConnection();
			// SQL 제작
			String sql = "SELECT * FROM emp WHERE empno=" + empno;
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();

			vo.setEmpno((rs.getInt(1)));
			vo.setEname((rs.getString(2)));
			vo.setJob((rs.getString(3)));
			vo.setMgr((rs.getInt(4)));
			vo.setHiredate((rs.getDate(5)));
			vo.setSal((rs.getInt(6)));
			vo.setComm((rs.getInt(7)));
			vo.setDeptno((rs.getInt(8)));
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			disConnection();
		}
		return vo;
	}
}
