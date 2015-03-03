package org.community.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.community.param.UserParam;
import org.community.param.WaterGaugeParam;
import org.community.service.UserService;
import org.community.util.Constant;
import org.community.util.ConvertTools;
import org.community.util.SessionManager;
import org.community.util.TimeTools;
import org.community.util.ValidTools;
import org.community.vo.UserInfoVO;
import org.community.vo.WaterGaugeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

/**
 * 用户管理相关controller<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private UserService userService;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(value="list.do")
	public ModelAndView getList(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		int communityid = userParam.getCommunityid();
		int pageNo = userParam.getPageNo();
		int pageNum = userParam.getPageNum();
		if(pageNum <= 0)
			pageNum = Constant.DEFAULT_PAGE_NUM;
		List<UserInfoVO> voList = this.userService.getUserList(communityid, pageNo, pageNum);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/manager/user_list");
		mv.addObject("voList", voList);
		return mv;
	}
	@RequestMapping(value="refresh.do")
	public ModelAndView getListContent(HttpServletRequest request,HttpServletResponse response) {
		int communityid = SessionManager.getAttributeInt(request, "communityid");
		List<UserInfoVO> voList = this.userService.getUserList(communityid, 0, Constant.DEFAULT_PAGE_NUM);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/manager/user_list_content");
		mv.addObject("voList", voList);
		return mv;
	}
	
	@RequestMapping(value="editPannel.do")
	public ModelAndView getEditPannel(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		long id = userParam.getId();
		UserInfoVO userInfoVO = this.userService.getUserById(id);
		ModelAndView mv = new ModelAndView("/manager/user_edit");
		mv.addObject("userInfoVO", userInfoVO);
		return mv;
	}
	
	@RequestMapping(value="addPannel.do")
	public ModelAndView getAddPannel(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("/manager/user_add");
		return mv;
	}
	
	@RequestMapping(value="addOne.do")
	public ModelAndView addOne(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		boolean isSuccess = false;
		try {
			//1.创建用户的信息
			UserInfoVO vo = new UserInfoVO();
			vo = ConvertTools.userInfoParamToVo(userParam);
			isSuccess = this.userService.addUserInfo(vo);
			
			//2.创建社区与用户的关系
			isSuccess = this.userService.addUserCommunityRelation(vo.getId(), userParam.getCommunityid());
		} catch (Exception e) {
			isSuccess = false;
		}
		
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="updateOne.do")
	public ModelAndView updateOne(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		boolean isSuccess = false;
		try {
			UserInfoVO vo = new UserInfoVO();
			vo = ConvertTools.userInfoParamToVo(userParam);
			isSuccess = this.userService.updateUserInfo(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="deleteOne.do")
	public ModelAndView deleteOne(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		boolean isSuccess = false;
		try {
			UserInfoVO vo = new UserInfoVO();
			vo = ConvertTools.userInfoParamToVo(userParam);
			isSuccess = this.userService.deleteUserInfo(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="dropOne.do")
	public ModelAndView dropOne(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		boolean isSuccess = false;
		try {
			UserInfoVO vo = new UserInfoVO();
			vo = ConvertTools.userInfoParamToVo(userParam);
			isSuccess = this.userService.dropUserInfo(vo);
		} catch (Exception e) {
			isSuccess = false;
		}
		ModelAndView mv = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
        Map attributes = new HashMap();
        attributes.put("success", isSuccess);
        view.setAttributesMap(attributes);
        mv.setView(view);
		return mv;
	}
	
	@RequestMapping(value="search.do")
	public ModelAndView search(HttpServletRequest request,HttpServletResponse response, UserParam userParam) {
		if(userParam == null)
			return null;
		int communityid = userParam.getCommunityid();
		int pageNo = userParam.getPageNo();
		int pageNum = userParam.getPageNum();
		if(pageNum <= 0)
			pageNum = Constant.DEFAULT_PAGE_NUM;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("communityid", ConvertTools.intToString(communityid));
		String searchText = userParam.getSearchText();
		if(!ValidTools.isEmptyString(searchText)) {
			map.put("islike", "yes");
			map.put("userName", searchText.trim());
			map.put("cardNo", searchText.trim());
			map.put("roominfo", searchText.trim());
			map.put("hometown", searchText.trim());
			map.put("telephone", searchText.trim());
		}
		List<UserInfoVO> voList = this.userService.getUserListByMap(map, pageNo, pageNum);
		ModelAndView mv = new ModelAndView("/manager/user_list_content");
		mv.addObject("voList", voList);
		return mv;
	}
}
