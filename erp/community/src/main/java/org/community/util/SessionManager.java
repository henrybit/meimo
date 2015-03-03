package org.community.util;

import javax.servlet.http.HttpServletRequest;

import org.community.vo.session.LoginInfoVO;

/**
 * Session管理工具<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/01
 */
public class SessionManager {
	/**
	 * 获取session中指定名称的String对象信息<br>
	 * @param request HTTP请求
	 * @param name session中对象名称
	 * @return String-session中对象值
	 */
	public static final String getAttribute(HttpServletRequest request, String name) {
		String value = null;
		try {
			value = (String)request.getSession(false).getAttribute(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * 获取session中指定名称的Int对象信息<br>
	 * @param request HTTP请求
	 * @param name session中对象名称
	 * @return int-session中对象值
	 */
	public static final int getAttributeInt(HttpServletRequest request, String name) {
		int value = 0;
		try {
			value = (Integer)request.getSession(false).getAttribute(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}
	/**
	 * 获取session中的登陆信息<br>
	 * @param request HTTP请求
	 * @return LoginInfoVO-登陆信息对象
	 */
	public static final LoginInfoVO getLoginInfo(HttpServletRequest request) {
		LoginInfoVO vo = null;
		try {
			vo = (LoginInfoVO)request.getSession(false).getAttribute(Constant.SESSION_LOGIN_INFO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	/**
	 * 在session中放入登陆信息<br>
	 * @param request HTTP请求
	 * @param vo 登陆信息
	 */
	public static final void addLoginInfo(HttpServletRequest request, LoginInfoVO vo) {
		addSession(request, Constant.SESSION_LOGIN_INFO, vo);
	}
	
	/**
	 * 在session中新增一个属性对象<br>
	 * @param request HTTP请求
	 * @param name 属性名
	 * @param value 属性值
	 */
	public static final void addSession(HttpServletRequest request, String name, Object value) {
		request.getSession(true).setAttribute(name, value);
	}
}
