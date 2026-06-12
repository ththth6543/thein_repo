package com.jun.conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyMain2 {

	public static void main(String[] args) {
		
		String sql = "SELECT * FROM departments";
		
		System.out.println("데이터 조회를 시작합니다...");

        // try-with-resources 구문으로 자원 자동 반환
        try (Connection conn = DBConnectionManager.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            System.out.println("=== 테이블 조회 결과 ===");
            System.out.println("--------------------------------------------------");

            int count = 0;
            // rs.next()가 true인 동안 반복하여 모든 행(Row)을 읽음
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                
                System.out.printf("%-10d | %-15s\n", id, name);
       
                count++;
            }

            System.out.println("--------------------------------------------------");
            System.out.println("총 " + count + "건의 데이터가 조회되었습니다.");

        } catch (SQLException e) {
            System.err.println("데이터 조회 중 오류가 발생했습니다.");
            e.printStackTrace();
        }

	}

}
