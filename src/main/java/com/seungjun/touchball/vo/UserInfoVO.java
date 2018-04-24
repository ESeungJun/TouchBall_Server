package com.seungjun.touchball.vo;


/**
 * @author SeungJun
 *
 */
public class UserInfoVO {

	// ����� ���̵�
	private String user_id = "";
	// ���� ���� 
	private String account_type = "";
	// ����� ���
	private String user_pw ="";
	// ����� �̸���
	private String user_email ="";
	// sns ���̺귯������ �Ѱ��� Ű �� 
	private String sns_key = "";
	// ����� �г���
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
