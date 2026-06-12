package com.jun.golf.model;

//regist_month, c_no, c_name, class_name, class_area, tuition, grade
public class MemberObj {
	private String regist_month;
	private String c_no;
	private String c_name;
	private String class_name;
	private String class_area;
	private int tuition;
	private String grade;

	public MemberObj(
			String regist_month, 
			String c_no, 
			String c_name, 
			String class_name, 
			String class_area, 
			int tuition,
			String grade) {
		this.regist_month = regist_month;
		this.c_no = c_no;
		this.c_name = c_name;
		this.class_name = class_name;
		this.class_area = class_area;
		this.tuition = tuition;
		this.grade = grade;

	}
	
	public String getRegistMonth() {
		return regist_month;
	}

	public String getCNo() {
		return c_no;
	}

	public String getCName() {
		return c_name;
	}

	public String getClassArea() {
		return class_area;
	}

	public String getClassName() {
		return class_name;
	}

	public int getTuition() {
		return tuition;
	}
	public String getGrade() {
		return grade;
	}
}
