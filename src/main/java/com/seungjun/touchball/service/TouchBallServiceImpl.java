package com.seungjun.touchball.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.seungjun.touchball.dao.rank.RankDAO;
import com.seungjun.touchball.dao.userInfo.UserInfoDAO;
import com.seungjun.touchball.vo.RankInfoVO;
import com.seungjun.touchball.vo.UserInfoVO;


/**
 * @author SeungJun
 *
 */
@Service("touchBallService")
public class TouchBallServiceImpl implements TouchBallService{


    @Resource(name="userInfoDAO")
    private UserInfoDAO userInfoDAO;

    @Resource(name="rankDAO")
    private RankDAO rankDAO;

    //============================================================//

	@Override
	public void loginCheck(String user_id, String user_pw) throws Exception {
		userInfoDAO.loginCheck(user_id, user_pw);
	}


	@Override
	public void addUserInfo(UserInfoVO userInfo) throws Exception {
		userInfoDAO.addUserInfo(userInfo);
	}
    
	@Override
	public UserInfoVO getUserInfo(String user_id) throws Exception{
		return userInfoDAO.getUserInfo(user_id);
	}
    //============================================================//

	
    //============================================================//
	@Override
	public void addEasyRankInfo(RankInfoVO rankInfo) throws Exception {
		rankDAO.addEasyRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getEasyRankInfo() throws Exception {
		return rankDAO.getEasyRankInfo();
	}
    //============================================================//
	
    //============================================================//
	@Override
	public void addNormalRankInfo(RankInfoVO rankInfo) throws Exception {
		rankDAO.addNormalRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getNormalRankInfo() throws Exception {
		return rankDAO.getNormalRankInfo();
	}
    //============================================================//
	
	
    //============================================================//
	@Override
	public void addHardRankInfo(RankInfoVO rankInfo) throws Exception {
		rankDAO.addHardRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getHardRankInfo() throws Exception {
		return rankDAO.getHardRankInfo();
	}
    //============================================================//
	
	
    //============================================================//
	@Override
	public void addHellRankInfo(RankInfoVO rankInfo) throws Exception {
		rankDAO.addHellRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getHellRankInfo() throws Exception {
		return rankDAO.getHellRankInfo();
	}
    //============================================================//
	
	
    //============================================================//
	@Override
	public ArrayList<RankInfoVO> getPersonRankInfo(String user_id) throws Exception {
		return rankDAO.getPersonRankInfo(user_id);
	}
    //============================================================//


}
