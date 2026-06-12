package com.jun.golf.model;

public class TeacherObj {
	private String teacher_code;
	private String teacher_name;
	private String class_name;
	private int class_price;
	private String teacher_regist_date;

	public TeacherObj(String c_no, String c_name, String phone, int address, String grade) {
		this.teacher_code = c_no;
		this.teacher_name = c_name;
		this.class_name = phone;
		this.class_price = address;
		this.teacher_regist_date = grade;
	}

	public String getTCode() {
		return teacher_code;
	}

	public String getTName() {
		return teacher_name;
	}

	public String getClassName() {
		return class_name;
	}

	public int getClassPrice() {
		return class_price;
	}

	public String getTeacherRegistDate() {
		return teacher_regist_date;
	}
}
