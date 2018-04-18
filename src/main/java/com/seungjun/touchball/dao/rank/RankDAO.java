package com.seungjun.touchball.dao.rank;

import java.util.ArrayList;

import com.seungjun.touchball.vo.RankInfoVO;

public interface RankDAO {

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
