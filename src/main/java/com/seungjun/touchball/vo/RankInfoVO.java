package com.seungjun.touchball.vo;

/**
 * @author SeungJun
 *
 */
public class RankInfoVO {
	
	// ����
	private int rank = 0;
	// ����� ���̵� 
	private String user_id = "";
	// ����� ��� 
	private String user_time = "";
	// ����� �г��� 
	private String user_nickname = "";
	// ��ũ Ÿ��
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
