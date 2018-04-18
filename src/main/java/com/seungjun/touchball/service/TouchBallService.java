package com.seungjun.touchball.service;

import java.util.ArrayList;

import com.seungjun.touchball.vo.RankInfoVO;
import com.seungjun.touchball.vo.UserInfoVO;
import com.seungjun.touchball.vo.UserJsonVO;

public interface TouchBallService {

    //============================================================//
	public void addUserInfo(UserInfoVO userInfo) throws Exception;
	public UserInfoVO getUserInfo(String user_id) throws Exception;
    //============================================================//

    //============================================================//
	public void addEasyRankInfo(RankInfoVO rankInfo) throws Exception;
	public ArrayList<RankInfoVO> getEasyRankInfo() throws Exception;
    //============================================================//

    //============================================================//
	public void addNormalRankInfo(RankInfoVO rankInfo) throws Exception;
	public ArrayList<RankInfoVO> getNormalRankInfo() throws Exception;
    //============================================================//

    //============================================================//
	public void addHardRankInfo(RankInfoVO rankInfo) throws Exception;
	public ArrayList<RankInfoVO> getHardRankInfo() throws Exception;
    //============================================================//

    //============================================================//
	public void addHellRankInfo(RankInfoVO rankInfo) throws Exception;
	public ArrayList<RankInfoVO> getHellRankInfo() throws Exception;
    //============================================================//

    //============================================================//
	public ArrayList<RankInfoVO> getPersonRankInfo(String user_id) throws Exception;
    //============================================================//



}
