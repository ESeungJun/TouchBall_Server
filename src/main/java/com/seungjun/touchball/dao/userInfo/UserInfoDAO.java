package com.seungjun.touchball.dao.userInfo;

import com.seungjun.touchball.vo.UserInfoVO;

public interface UserInfoDAO {

	public UserInfoVO getUserInfo(String user_id) throws Exception;

	public void addUserInfo(UserInfoVO userInfo) throws Exception;

	
}
