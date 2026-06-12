package com.jun.golf.model;

public class ProfitObj {
	// 강사코드 강의명 강사명 총매출
	private String teacher_code;
	private String class_name;
	private String teacher_name;
	private int profit;

	public ProfitObj(String teacher_code, String class_name, String teacher_name, int profit) {
		this.teacher_code = teacher_code;
		this.class_name = class_name;
		this.teacher_name = teacher_name;
		this.profit = profit;
	}

	public String getTeacherCode() {
		return teacher_code;
	}

	public String getClassName() {
		return class_name;
	}

	public String getTeacherName() {
		return teacher_name;
	}

	public int getProfit() {
		return profit;
	}
}
