package com.jun.golf.print;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.jun.golf.DBConnectionManager;
import com.jun.golf.model.TeacherObj;

public class PrintGolfTeacher {

	public void displayAllTeachers() {
		String sql = "Select * from golf_teacher";
		List<TeacherObj> teacherList = new ArrayList<>();

		try (Connection conn = DBConnectionManager.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			while (rs.next()) {

				TeacherObj teacher = new TeacherObj(rs.getString("teacher_code"), rs.getString("teacher_name"),
						rs.getString("class_name"), rs.getInt("class_price"), rs.getString("teacher_regist_date"));
				teacherList.add(teacher);

			}
		} catch (SQLException e) {
			System.err.println("DB 조회 중 에러 발생!");
			e.printStackTrace();
			return;
		}

		// 2. 퍼온 데이터 화면에 예쁘게 인쇄(Print)하기
		System.out.println("\n====================== 강사조회 ======================");
		System.out.printf("%-8s | %-8s | %-8s | %-8s | %-6s%n", "강사코드", "강사명", "강의명", "수강료", "강사자격취득일");
		System.out.println("------------------------------------------------------------");
		DecimalFormat df = new DecimalFormat("₩#, ###");

		for (TeacherObj m : teacherList) {
			String formattedPrice = df.format(m.getClassPrice());
			DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
			LocalDate parsedDate = LocalDate.parse(m.getTeacherRegistDate(), inputFormatter);

			DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
			String finalDate = parsedDate.format(outputFormatter);
			System.out.printf("%-8s | %-8s | %-10s | %-8s | %-6s%n", m.getTCode(), m.getTName(), m.getClassName(),
					formattedPrice, finalDate);
		}
		System.out.println("============================================================\n");
	}
}
