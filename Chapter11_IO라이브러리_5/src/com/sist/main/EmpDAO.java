package com.sist.main;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.*;
import java.util.List;
import java.util.Properties;

public class EmpDAO {
	private Connection conn;
	private PreparedStatement ps;
	private String driver, url, username, password;

	public EmpDAO() {

		// properties 파일 읽기
		try {
			// 키 =값 ==> Map형식
			// 키가 중복되면 안된다.
			// 보안용 => 서버주소 / 데이터베이스 주소
			
			Properties prop = new Properties();
			prop.load(new FileInputStream(
					"C:\\javaDev\\javaStudy\\Chapter11_IO라이브러리_5\\src\\com\\sist\\main\\db.properties"));
			driver = prop.getProperty("driver");
			url = prop.getProperty("url");
			username = prop.getProperty("username");
			password = prop.getProperty("password");
			// 보안용 => 데이터베이스, 네트워크 서버
			// 드라이버 설치
			Class.forName(driver);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	// 연결
	// => 위탁
	public void getConnection() {

		try {
			conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void disConnection() {
		try {

			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public List<Emp> empListData() {

		List<Emp> list = new ArrayList<Emp>();
		try {
			getConnection();
			String sql = "SELECT empno,ename,job FROM emp";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				list.add(emp);
			}
		} catch (Exception e) {
		} finally {
			disConnection();
		}
		return list;

	}
}
