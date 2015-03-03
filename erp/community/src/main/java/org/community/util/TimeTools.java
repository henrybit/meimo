package org.community.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间处理工具<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/28
 */
public class TimeTools {
	private final static SimpleDateFormat sdf_yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
	private final static SimpleDateFormat sdf_yyyyMMdd_HHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	/**
	 * 解析格式为yyyy-MM-dd的时间戳
	 * @param time 时间戳
	 * @return Date
	 */
	public final static Date parseDate(String time) {
		Date date = new Date();
		try {
			date = sdf_yyyyMMdd.parse(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 将日期转换成yyyy-MM-dd的格式显示<br>
	 * @param date 日期
	 * @return String-"yyyy-MM-dd"格式显示
	 */
	public final static String formatDate(Date date) {
		String str = "1970-0-0";
		try {
			str = sdf_yyyyMMdd.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	/**
	 * 解析格式为yyyy-MM-dd HH:mm:ss的时间戳
	 * @param time 时间戳
	 * @return Date
	 */
	public final static Date parseDate2(String time) {
		Date date = new Date();
		try {
			date = sdf_yyyyMMdd_HHmmss.parse(time);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	/**
	 * 将日期转换成yyyy-MM-dd HH:mm:ss的格式显示<br>
	 * @param date 日期
	 * @return String-"yyyy-MM-dd HH:mm:ss"格式显示
	 */
	public final static String formatDate2(Date date) {
		String str = "1970-0-0 00:00:00";
		try {
			str = sdf_yyyyMMdd_HHmmss.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}
	
	
	/**
	 * 获取当前时间，精确到小时分钟秒<br>
	 * @return Date
	 */
	public final static Date getCurrentTime() {
		return new Date();
	}
}
