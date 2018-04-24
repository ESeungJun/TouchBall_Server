package com.seungjun.touchball.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.seungjun.touchball.service.TouchBallService;
import com.seungjun.touchball.vo.RankInfoVO;
import com.seungjun.touchball.vo.RankJsonVO;
import com.seungjun.touchball.vo.UserInfoVO;
import com.seungjun.touchball.vo.UserJsonVO;

@Controller
public class MainController {

	Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Resource(name="touchBallService")
	private TouchBallService service;
	

	@RequestMapping(value="/login", method= RequestMethod.POST)
	public @ResponseBody UserJsonVO checkLogin(HttpServletRequest request) {

		String user_id = ((String) request.getParameter("user_id"));
		String user_pw = ((String) request.getParameter("user_pw"));
		
		UserJsonVO result = new UserJsonVO();

		logger.debug("login check > " + user_id + " / " + user_pw);
		
		try {
			
			service.loginCheck(user_id, user_pw);

			result.setSuccess(true);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setMessage("로그인 실패. 아이디 및 비밀번호를 확안하세요.");
			
		}
		
		return result;
	}
	
	
	@RequestMapping(value="/addUserInfo", method= RequestMethod.POST)
	public @ResponseBody UserJsonVO addUserInfo(HttpServletRequest request){
		
		
		UserInfoVO userInfo = new UserInfoVO();
		userInfo.setUser_id((String)request.getParameter("user_id"));
		userInfo.setAccount_type((String)request.getParameter("account_type"));
		userInfo.setUser_pw((String)request.getParameter("user_pw"));
		userInfo.setSns_key((String)request.getParameter("sns_key"));
		userInfo.setUser_email((String)request.getParameter("user_email"));
		userInfo.setUser_nickname((String)request.getParameter("user_nickname"));

		UserJsonVO result = new UserJsonVO();
		
		logger.debug("Add User Info > " + userInfo.getUser_id() + 
				" / " + userInfo.getUser_pw() + 
				" / " + userInfo.getSns_key() + 
				" / " + userInfo.getAccount_type() + 
				" / " + userInfo.getUser_email() + 
				" / " + userInfo.getUser_nickname());
		
		try {
			
			service.addUserInfo(userInfo);

			result.setSuccess(true);
			
		}
		catch (Exception e) {
			e.printStackTrace();
			result.setSuccess(false);
			result.setMessage("아이디 생성에 실패했습니다.");
			
		}
		
		
		return result;
	}
	
	@RequestMapping(value="/getUserInfo", method= RequestMethod.GET)
	public @ResponseBody UserInfoVO getUserInfo(HttpServletRequest request){
		
		String user_id = (String)request.getParameter("user_id");
		
		
		UserInfoVO user_info = null;
		
		try {
			user_info = service.getUserInfo(user_id);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return user_info;
	}
	
	
	@RequestMapping(value="/addRankInfo", method= RequestMethod.POST)
	public @ResponseBody RankJsonVO addEasyRank(HttpServletRequest request){
		
		RankJsonVO result = new RankJsonVO();
		
		String rank_type = (String)request.getParameter("rank_type");

		RankInfoVO rankInfo = new RankInfoVO();
		rankInfo.setUser_id((String)request.getParameter("user_id"));
		rankInfo.setUser_nickname((String)request.getParameter("user_nickname"));
		rankInfo.setUser_time((String)request.getParameter("user_time"));
		
		
		try {

			switch (rank_type) {

				case "easy":
					service.addEasyRankInfo(rankInfo);
					break;
	
				case "normal":
					service.addNormalRankInfo(rankInfo);
					break;
	
				case "hard":
					service.addHardRankInfo(rankInfo);
					break;
	
				case "hell":
					service.addHellRankInfo(rankInfo);
					break;
			}


			result.setSuccess(true);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			result.setSuccess(false);
		}
		

		return result;
	}
	
	
	@RequestMapping(value="/getRankInfo", method= RequestMethod.GET)
	public @ResponseBody RankJsonVO getRankInfo(HttpServletRequest request){ 
		
		RankJsonVO result = new RankJsonVO();
		
		ArrayList<RankInfoVO> rankList = new ArrayList<RankInfoVO>();

		String rank_type = (String)request.getParameter("rank_type");

		
		try {
			
			switch (rank_type) {
			
				case "easy":
					rankList = service.getEasyRankInfo();
					break;

				case "normal":
					rankList = service.getNormalRankInfo();
					break;
					
				case "hard":
					rankList = service.getHardRankInfo();
					break;
					
				case "hell":
					rankList = service.getHellRankInfo();
					break;
			}
			
			
			result.setSuccess(true);
			result.setRankList(rankList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			result.setSuccess(false);
			result.setRankList(null);
		}
		
		return result;
	}
	
	
	@RequestMapping(value="/getPersonRankInfo", method= RequestMethod.GET)
	public @ResponseBody RankJsonVO getPersonRankInfo(HttpServletRequest request){ 
		
		RankJsonVO result = new RankJsonVO();
		
		ArrayList<RankInfoVO> rankList = new ArrayList<RankInfoVO>();

		String user_id = (String)request.getParameter("user_id");

		
		try {
			
			rankList = service.getPersonRankInfo(user_id);
		
			
			result.setSuccess(true);
			result.setRankList(rankList);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			result.setSuccess(false);
			result.setRankList(null);
		}
		
		
		return result;
	}
	
}

