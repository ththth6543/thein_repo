package com.jun.golf.print;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import com.jun.golf.DBConnectionManager;
import com.jun.golf.model.ProfitObj;

public class PrintGolfProfit {
	// 강사코드 강의명 강사명 총매출
	public void displayAllClasses() {
		String sql = """
							SELECT t.teacher_code, t.class_name, t.teacher_name,
				               sum(c.tuition) as profit
				        FROM golf_teacher t
				        Join golf_class c on c.teacher_code = t.teacher_code
				        group by t.teacher_code
				""";
		List<ProfitObj> profitList = new ArrayList<>();

		try (Connection conn = DBConnectionManager.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {

				ProfitObj profitObj = new ProfitObj(rs.getString("teacher_code"), rs.getString("class_name"),
						rs.getString("teacher_name"), rs.getInt("profit"));
				profitList.add(profitObj);

			}
		} catch (SQLException e) {
			System.err.println("DB 조회 중 에러 발생!");
			e.printStackTrace();
			return;
		}
		DecimalFormat df = new DecimalFormat("₩#, ###");
		// 2. 퍼온 데이터 화면에 예쁘게 인쇄(Print)하기
		System.out.println("\n====================== 강사 매출 현황 ======================");
		System.out.printf("%-8s | %-8s | %-8s | %-8s %n", "강사코드", "강의명", "강사명", "총매출");
		System.out.println("------------------------------------------------------------");

		for (ProfitObj m : profitList) {
			String formattedPrice = df.format(m.getProfit());
			System.out.printf("%-8s | %-8s | %-10s | %-8s %n", m.getTeacherCode(), m.getClassName(), m.getTeacherName(),
					formattedPrice);
		}
		System.out.println("============================================================\n");
	}
}
