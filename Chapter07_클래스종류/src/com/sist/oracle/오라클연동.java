package com.sist.oracle;

import java.sql.*;

public class 오라클연동 {

    public static void main(String[] args) {
        try {
            // 드라이버 설정
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // ojdbc8.jar 파일이 클래스패스에 추가되어 있어야 합니다.

            // 오라클 연결
            String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 오라클 주소 (SID 또는 서비스 이름)
            Connection conn = DriverManager.getConnection(url, "hr", "happy");

            // SQL 쿼리 실행
            String sql = "SELECT * FROM emp"; // 이 문장을 오라클로 넘겨줌
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery(); // 실행 결과를 가져와서 rs에 넣어라

            // 결과 처리
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

        } catch (SQLException e) {
            System.out.println("SQLException 발생: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}