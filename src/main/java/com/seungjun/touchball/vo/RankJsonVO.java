package com.seungjun.touchball.vo;

import java.util.ArrayList;

public class RankJsonVO {
	
	private boolean success = false;
	
	private ArrayList<RankInfoVO> rankList = new ArrayList<RankInfoVO>();

	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public ArrayList<RankInfoVO> getRankList() {
		return rankList;
	}

	public void setRankList(ArrayList<RankInfoVO> rankList) {
		this.rankList = rankList;
	}
	
}
