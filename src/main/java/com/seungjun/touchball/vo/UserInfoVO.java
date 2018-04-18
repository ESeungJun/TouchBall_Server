package com.seungjun.touchball.vo;

public class UserInfoVO {

	// 사용자 아이디
	private String user_id = "";
	// 계정 유형 
	private String account_type = "";
	// 사용자 비번
	private String user_pw ="";
	// 사용자 이메일
	private String user_email ="";
	// sns 라이브러리에서 넘겨준 키 값 
	private String sns_key = "";
	// 사용자 닉네임
	private String user_nickname ="";
	
	public String getUser_id() {
		return user_id;
	}
	
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getAccount_type() {
		return account_type;
	}
	
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	
	public String getUser_pw() {
		return user_pw;
	}
	
	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}
	
	public String getUser_email() {
		return user_email;
	}
	
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
	public String getSns_key() {
		return sns_key;
	}
	
	public void setSns_key(String sns_key) {
		this.sns_key = sns_key;
	}

	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	
	
	
}
