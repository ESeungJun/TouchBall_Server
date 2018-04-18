package com.seungjun.touchball.vo;

public class RankInfoVO {
	
	// 순위
	private int rank = 0;
	// 사용자 아이디 
	private String user_id = "";
	// 사용자 기록 
	private String user_time = "";
	// 사용자 닉네임 
	private String user_nickname = "";
	// 랭크 타입
	private String type = "";
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	public int getRank() {
		return rank;
	}
	
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_time() {
		return user_time;
	}
	
	public void setUser_time(String user_time) {
		this.user_time = user_time;
	}
	
	
	
	
}
