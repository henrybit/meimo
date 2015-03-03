package org.community.util;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * cookie管理工具<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/26
 */
public class CookieManager {
	//浏览器进程有效
	private final static int BROWSER_PROCESS_COOKIE_MAX_AGE = -1;
	//一分钟
	private final static int DEFAULT_COOKIE_MAX_AGE_MINUTE = 60;
	//一小时
	private final static int DEFAULT_COOKIE_MAX_AGE_HOUR = 3600;
	//一天
	private final static int DEFAULT_COOKIE_MAX_AGE_DAY = 86400;
	//一周
	private final static int DEFAULT_COOKIE_MAX_AGE_WEEK = 604800;
	//一月
	private final static int DEFAULT_COOKIE_MAX_AGE_MONTH = 2419200;
	//一年
	private final static int DEFAULT_COOKIE_MAX_AGE_YEAR = 29030400;
	
	/**
	 * 添加一个cookie<br>
	 * @param response HTTP响应对象
	 * @param key cookie的key值
	 * @param value cookie的value值
	 * @return boolean-true:成功;false:失败.
	 */
	public static boolean addCookie(HttpServletResponse response, String key, String value) {
		Cookie cookie = new Cookie(key, value);
		cookie.setMaxAge(DEFAULT_COOKIE_MAX_AGE_HOUR);
		cookie.setDomain(".91meimo.com");
		cookie.setPath("/");
		response.addCookie(cookie);
		return true;
	}
	
	/**
	 * 获取一个指定key值的cookie信息<br>
	 * @param request HTTP请求
	 * @param key cookie的key值
	 * @return value-cookie的value值
	 */
	public static String getCookieValue(HttpServletRequest request, String key) {
		if(key==null || key.isEmpty())
			return null;
		Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
		if(cookies != null) {
			for(Cookie cookie : cookies){
			    cookie.getName();// get the cookie name
			    if(cookie.getName().equals(key))
			    	return cookie.getValue();
			}
		}
		return null;
	}
	
	/**
	 * 获取请求中的所有cookie集合
	 * @param request HTTP请求
	 * @return Map-key:cookie的key值，value:cookie对象.
	 */
	public static Map<String, Cookie> getCookies(HttpServletRequest request) {
		Map<String,Cookie> cookieMap = new HashMap<String,Cookie>();
	    Cookie[] cookies = request.getCookies();
	    if(cookies != null){
	        for(Cookie cookie : cookies){
	            cookieMap.put(cookie.getName(), cookie);
	        }
	    }
	    return cookieMap;
	}
}
