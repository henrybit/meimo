package org.community.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.community.param.CommunityInfoParam;
import org.community.param.HttpParam;
import org.community.param.PropertyInfoParam;
import org.community.service.CommunityInfoService;
import org.community.service.PropertyInfoService;
import org.community.util.ConvertTools;
import org.community.util.SessionManager;
import org.community.util.Tools;
import org.community.vo.CommunityInfoVO;
import org.community.vo.PropertyInfoVO;
import org.community.vo.session.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆控制器<br>
 * @author henrybit
 * @version 1.0
 * @since 2014/12/09
 */
@Controller
@RequestMapping(value="/login")
public class LoginController {
	@Autowired
	private PropertyInfoService propertyInfoService;
	@Autowired
	private CommunityInfoService communityInfoService;
	public PropertyInfoService getPropertyInfoService() {
		return propertyInfoService;
	}
	public void setPropertyInfoService(PropertyInfoService propertyInfoService) {
		this.propertyInfoService = propertyInfoService;
	}
	public CommunityInfoService getCommunityInfoService() {
		return communityInfoService;
	}
	public void setCommunityInfoService(CommunityInfoService communityInfoService) {
		this.communityInfoService = communityInfoService;
	}
	
	@RequestMapping(value="login.do")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,PropertyInfoParam propertyInfoParam) {
		if(propertyInfoParam == null)
			return null;
		try {
			String loginName = propertyInfoParam.getLoginName();
			String password = Tools.encodeBase64(propertyInfoParam.getPassword());
			PropertyInfoVO vo = this.propertyInfoService.queryByLogin(loginName, password);
			if(vo!=null && vo.getLoginName().equals(loginName) && vo.getPassword().equals(password)) {
				//在session中放入登陆信息
				LoginInfoVO loginInfoVo = new LoginInfoVO();
				loginInfoVo.setPropertyid(vo.getId());
				loginInfoVo.setPropertyName(vo.getPropertyName());
				SessionManager.addLoginInfo(request, loginInfoVo);
				
				ModelAndView mv = new ModelAndView("/main");
				return mv;
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value="loginPannel.do")
	public ModelAndView loginPannel(HttpServletRequest request,HttpServletResponse response, HttpParam httpParam) {
		ModelAndView mv = new ModelAndView("/login");
		return mv;
	}
	
	@RequestMapping(value="registerPannel.do")
	public ModelAndView registerPannel(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv = new ModelAndView("/register/registerProperty");
		return mv;
	}
	
	@RequestMapping(value="registerProperty.do")
	public ModelAndView registerProperty(HttpServletRequest request,HttpServletResponse response, PropertyInfoParam propertyInfoParam){
		if(propertyInfoParam == null)
			return null;
		//1.新增一个物业信息
		PropertyInfoVO vo = ConvertTools.propertyInfoParamToVo(propertyInfoParam);
		boolean success = this.propertyInfoService.addOne(vo);
		if(success) {
			ModelAndView mv = new ModelAndView("/register/registerCommunity");
			mv.addObject("propertyId", vo.getId());
			return mv;
		} else
			return null;
	}
	
	@RequestMapping(value="registerCommunity.do")
	public ModelAndView registerCommunity(HttpServletRequest request,HttpServletResponse response, CommunityInfoParam communityInfoParam) {
		ModelAndView mv = new ModelAndView("/register/registerFinish");
		if(communityInfoParam == null) { //跳过社区信息填写
		} else {
			CommunityInfoVO communityInfoVo = ConvertTools.communityInfoParamToVo(communityInfoParam);
			boolean success = this.communityInfoService.addOne(communityInfoVo);
		}
		return mv;
	}
	
	@RequestMapping(value="forgetPannel.do")
	public ModelAndView forgetPannel(HttpServletRequest request,HttpServletResponse response) {
		//TODO
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	@RequestMapping(value="forgetPassword.do")
	public ModelAndView forgetPassword(HttpServletRequest request,HttpServletResponse response) {
		//TODO
		ModelAndView mv = new ModelAndView();
		return mv;
	}
}
