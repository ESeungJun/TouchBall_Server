package com.seungjun.touchball.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.seungjun.touchball.vo.RankInfoVO;
import com.seungjun.touchball.vo.UserInfoVO;

public interface DbDataMapper {

    //============================================================//
	public UserInfoVO loginCheck(@Param("user_id") String user_id, @Param("user_pw") String user_pw) throws Exception;
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
