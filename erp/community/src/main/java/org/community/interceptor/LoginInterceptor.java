package org.community.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.community.util.SessionManager;
import org.community.util.Tools;
import org.community.vo.session.LoginInfoVO;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 登陆拦截器<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/02
 */
public class LoginInterceptor implements HandlerInterceptor {
	//不进行拦截的URL地址
	private String[] allowUrls;
	public String[] getAllowUrls() {
		return allowUrls;
	}
	public void setAllowUrls(String[] allowUrls) {
		this.allowUrls = allowUrls;
	}
	public LoginInterceptor() {
	}
	/**
	 * 判断用户是否登陆<br>
	 * @param request HTTP请求
	 * @return boolean-true:登陆;false:未登录.
	 */
	private boolean isLogin(HttpServletRequest request) {
		boolean login = false;
		LoginInfoVO vo = SessionManager.getLoginInfo(request);
		if(vo != null)
			login = true;
		return login;
	}
	/**
	 * 判断拦截的请求是否是登陆相关<br>
	 * 1.登陆相关请求放行
	 * 2.其他请求正常拦截
	 * @param request HTTP请求
	 * @return boolean-true:是登陆请求;false:不是登陆请求.
	 */
	private boolean isLoginRequest(HttpServletRequest request) {
		String uri = request.getRequestURI();
		try {
			if(uri.contains("login"))
				return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	/** 
     * 在业务处理器处理请求之前被调用 
     * 如果返回false 
     *     从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链 
     *  
     * 如果返回true 
     *    执行下一个拦截器,直到所有的拦截器都执行完毕 
     *    再执行被拦截的Controller 
     *    然后进入拦截器链, 
     *    从最后一个拦截器往回执行所有的postHandle() 
     *    接着再从最后一个拦截器往回执行所有的afterCompletion() 
     */  
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		//如果是css,js,image,font等静态资源不进行拦截
		String requestUrl = request.getRequestURI().replace(request.getContextPath(),"");
		if(null!=allowUrls && allowUrls.length>=1) {  
            for(String url : allowUrls) {    
                if(requestUrl.contains(url)) {   
                	return true;
                }
            }
		}
		//session中登陆信息失效时，重定向到登陆界面;并且当前请求不是登陆请求
		if(!isLogin(request)) {
			StringBuilder url = new StringBuilder(Tools.getBaseUrl(request));
			url.append("/login/loginPannel.do");
			response.sendRedirect(url.toString());
			return false;
		}
		return true;
	}
	
	//在业务处理器处理请求执行完成后,生成视图之前执行的动作
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
	}

	/** 
     * 在DispatcherServlet完全处理完请求后被调用  
     * 当有拦截器抛出异常时,会从当前拦截器往回执行所有的拦截器的afterCompletion() 
     */  
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
	}

}
