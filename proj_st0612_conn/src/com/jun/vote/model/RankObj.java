package com.jun.vote.model;

public class RankObj {
	// 후보번호 성명 총투표건수
	private String m_no;
	private String m_name;
	private int vote_count;

	// 1. 모든 필드를 초기화하는 생성자
	public RankObj(String m_no, String m_name, int vote_count) {
		this.m_no = m_no;
		this.m_name = m_name;
		this.vote_count = vote_count;
	}

	// 2. Getter 메서드들
	public String getM_no() {
		return m_no;
	}

	public String getM_name() {
		return m_name;
	}

	public int getVote_count() {
		return vote_count;
	}
}
