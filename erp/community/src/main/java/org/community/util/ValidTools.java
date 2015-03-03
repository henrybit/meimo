package org.community.util;

/**
 * 检验工具类<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/27
 */
public class ValidTools {
	/**
	 * 判断是否是空串或者Null<br>
	 * @param str 待判断的字符串
	 * @return boolean-true:是空串;false:不是空串.
	 */
	public final static boolean isEmptyString(String str) {
		if(str == null)
			return true;
		if(str.isEmpty())
			return true;
		if(str.trim().isEmpty())
			return true;
		return false;
	}
}
