package com.jun.vote.model;

//성명 (생년월일 나이 성별) 후보번호 투표시간 유권자확인
public class HistoryObj {
	private String v_name;
	private String v_jumin; // 생년월일 나이 성별
	private String m_no;
	private String v_time;
	private String v_confirm;

	public HistoryObj(String name, String jumin, String num, String time, String confirm) {
		this.v_name = name;
		this.v_jumin = jumin;
		this.m_no = num;
		this.v_time = time;
		this.v_confirm = confirm;
	}

	// v_name (성명) Getter
    public String getV_name() {
        return v_name;
    }

    // v_jumin (주민번호) Getter
    public String getV_jumin() {
        return v_jumin;
    }

    // m_no (후보번호) Getter
    public String getM_no() {
        return m_no;
    }

    // v_time (투표시간) Getter
    public String getV_time() {
        return v_time;
    }

    // v_confirm (유권자확인) Getter
    public String getV_confirm() {
        return v_confirm;
    }
}
