package com.jun.vote.model;

public class MemberObj {
	// 후보번호 성명 소속정당 학력 주민번호 지역구 대표전화
	// 전화번호 1,2,3을 합쳐야
	private String m_no;
	private String m_name;
	private String p_code;
	private String p_school;
	private String m_jumin;
	private String m_city;
	private String p_tel1;
	private String p_tel2;
	private String p_tel3;

	public MemberObj(String m_no, String m_name, String p_code, String p_school, String m_jumin, String m_city,
			String p_tel1, String p_tel2, String p_tel3) {
		this.m_no = m_no;
		this.m_name = m_name;
		this.p_code = p_code;
		this.p_school = p_school;
		this.m_jumin = m_jumin;
		this.m_city = m_city;
		this.p_tel1 = p_tel1;
		this.p_tel2 = p_tel2;
		this.p_tel3 = p_tel3;
	}

	public String getM_no() {
		return m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public String getP_code() {
		return p_code;
	}

	public String getP_school() {
		return p_school;
	}

	public String getM_jumin() {
		return m_jumin;
	}

	public String getM_city() {
		return m_city;
	}

	public String getP_tel1() {
		return p_tel1;
	}

	public String getP_tel2() {
		return p_tel2;
	}

	public String getP_tel3() {
		return p_tel3;
	}
	public String getFullTel() {
        // 공백이나 null 체크를 안전하게 한 뒤 조합합니다.
        if (p_tel1 == null || p_tel2 == null || p_tel3 == null) {
            return "";
        }
        return p_tel1 + "-" + p_tel2 + "-" + p_tel3; // 예: "02-1234-5678"
    }
}
