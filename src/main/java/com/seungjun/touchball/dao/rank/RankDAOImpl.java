package com.seungjun.touchball.dao.rank;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.seungjun.touchball.mapper.DbDataMapper;
import com.seungjun.touchball.vo.RankInfoVO;

@Repository("rankDAO")
public class RankDAOImpl implements RankDAO{


	@Autowired
	private DbDataMapper dm;

	
	
    //============================================================//
	@Override
	public void addEasyRankInfo(RankInfoVO rankInfo) throws Exception {
		dm.addEasyRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getEasyRankInfo() throws Exception {
		return dm.getEasyRankInfo();
	}
    //============================================================//

	
	
    //============================================================//
	@Override
	public void addNormalRankInfo(RankInfoVO rankInfo) throws Exception {
		dm.addNormalRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getNormalRankInfo() throws Exception {
		return dm.getNormalRankInfo();
	}
    //============================================================//

	
	
	
    //============================================================//
	@Override
	public void addHardRankInfo(RankInfoVO rankInfo) throws Exception {
		dm.addHardRankInfo(rankInfo);	
	}
	
	@Override
	public ArrayList<RankInfoVO> getHardRankInfo() throws Exception {
		return dm.getHardRankInfo();
	}
    //============================================================//

	
	
	
    //============================================================//
	@Override
	public void addHellRankInfo(RankInfoVO rankInfo) throws Exception {
		dm.addHellRankInfo(rankInfo);
	}
	
	@Override
	public ArrayList<RankInfoVO> getHellRankInfo() throws Exception {
		return dm.getHellRankInfo();
	}
    //============================================================//

	
	
	
    //============================================================//
	
	@Override
	public ArrayList<RankInfoVO> getPersonRankInfo(String user_id) throws Exception {
		return dm.getPersonRankInfo(user_id);
	}
	
    //============================================================//




}
