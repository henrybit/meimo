package org.community.util;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;

/**
 * 常用工具类<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/03/03
 */
public class Tools {
	/**
	 * 返回网站的绝对URL地址<br>
	 * @param request HTTP请求
	 * @return String-url地址
	 */
	public static String getBaseUrl(HttpServletRequest request) {
		StringBuilder baseUrl = new StringBuilder();
		baseUrl.append(request.getScheme()).append("://").append(request.getServerName()).append(":")
		.append(request.getServerPort()).append(request.getContextPath());
		return baseUrl.toString();
	}
	/**
	 * 解析Base64编码数据<br>
	 * @param decodeContent 待解析内容
	 * @return String-解析后的结果数据
	 */
	public static String decodeBase64(String decodeContent) {
		String decodeStr = "";
		try {
			byte[] decodeBytes = Base64.decodeBase64(decodeContent.getBytes());
			decodeStr = new String(decodeBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return decodeStr;
	}
	
	/**
	 * Base64编码数据<br>
	 * @param encodeContent 待编码内容
	 * @return String-编码后的结果数据
	 */
	public static String encodeBase64(String encodeContent) {
		String encodeStr = "";
		try {
			byte[] encodeBytes = Base64.encodeBase64(encodeContent.getBytes());
			encodeStr = new String(encodeBytes);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encodeStr;
	}
	/**
	 * 适用于form表单获取真实中文数据<br>
	 * @param origin 源数据
	 * @param charset 编码格式
	 * @return String-目标数据
	 */
	public static String getRealString(String origin, String charset) {
		String dest = origin;
		try {
			byte[] bytes = origin.getBytes("ISO-8859-1");
			dest = new String(bytes,charset);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dest;
	}
	
	public static void main(String[] args) throws Exception {
		String a = "123456";
		System.out.println(encodeBase64(a));
		String b = "MTIzNDU2";
		System.out.println(decodeBase64(b));
	}
}
