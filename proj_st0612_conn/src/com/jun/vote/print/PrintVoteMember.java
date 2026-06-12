package com.jun.vote.print;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.jun.golf.DBConnectionManager;
import com.jun.golf.model.MemberObj;

public class PrintVoteMember {

	// c수강월, c회원번호, m회원명, m강의명, c강의장소, c수강료, m등급
	// regist_month, c_no, c_name, class_name, class_area, tuition, grade
	public void displayAllMembers() {
		String sql = """
				SELECT c.regist_month, c.c_no, m.c_name,
				               t.class_name, c.class_area, c.tuition, m.grade
				        FROM golf_class c
				        JOIN golf_member m ON c.c_no = m.c_no
				        Join golf_teacher t on c.teacher_code = t.teacher_code
				""";
		List<MemberObj> memberList = new ArrayList<>();

		try (Connection conn = DBConnectionManager.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {
				// regist_month, c_no, c_name, class_name, class_area, tuition, grade

				MemberObj member = new MemberObj(rs.getString("regist_month"), rs.getString("c_no"),
						rs.getString("c_name"), rs.getString("class_name"), rs.getString("class_area"),
						rs.getInt("tuition"), rs.getString("grade"));
				memberList.add(member);

			}
		} catch (SQLException e) {
			System.err.println("DB 조회 중 에러 발생!");
			e.printStackTrace();
			return;
		}

		// 2. 퍼온 데이터 화면에 예쁘게 인쇄(Print)하기
		System.out.println("\n====================== 회원 정보 조회 ======================");
		System.out.printf("%-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s \n", "수강월", "회원번호", "회원명", "강의명", "강의장소",
				"수강료", "등급");
		System.out.println("------------------------------------------------------------");
		DecimalFormat df = new DecimalFormat("₩#, ###");
		for (MemberObj m : memberList) {
			String formattedPrice = df.format(m.getTuition());
			
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyyMM");
			YearMonth yearMonth = YearMonth.parse(m.getRegistMonth(), inputFormatter);
			
			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy년MM월");
			String finalDate = yearMonth.format(outputFormatter);

			System.out.printf("%-8s | %-8s | %-8s | %-8s | %-8s | %-8s | %-8s \n",

					finalDate, m.getCNo(), m.getCName(), m.getClassName(), m.getClassArea(), formattedPrice,
					m.getGrade());
		}
		System.out.println("============================================================\n");
	}
}
