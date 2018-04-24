package com.seungjun.touchball.dao.userInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seungjun.touchball.mapper.DbDataMapper;
import com.seungjun.touchball.vo.UserInfoVO;

@Repository("userInfoDAO")
public class UserInfoDAOImpl implements UserInfoDAO{
	

	@Autowired
	private DbDataMapper dm;
	
	
	public UserInfoVO getUserInfo(String user_id) throws Exception {
		
		
		UserInfoVO user_info = null;
		
		user_info = dm.getUserInfo(user_id);
		
		return user_info;
	}


	@Override
	public void addUserInfo(UserInfoVO userInfo) throws Exception {
		dm.addUserInfo(userInfo);
	}


	@Override
	public void loginCheck(String user_id, String user_pw) throws Exception {
		dm.loginCheck(user_id, user_pw);
	}

	
}
