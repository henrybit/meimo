package org.community.util;

/**
 * 常量类<br>
 * @author henrybit
 * @version 1.0
 * @since 2015/02/26
 */
public class Constant {
	/**默认一页的展示数量*/
	public final static int DEFAULT_PAGE_NUM = 30;
	/**数据有效状态=1*/
	public final static int DATA_STATUS_VALID = 1;
	/**数据无效状态=0*/
	public final static int DATA_STATUS_INVALID = 0;
	/**session中得登陆信息名*/
	public final static String SESSION_LOGIN_INFO = "logininfo";
	
	/**水表相关常量*/
	public final static class WaterGauge {
		/**住户的水表*/
		public final static int TYPE_HOUSEHOLD = 1;
		public final static String TYPE_HOUSEHOLD_STRING = "住户";
		/**商铺的水表*/
		public final static int TYPE_SHOP = 2;
		public final static String TYPE_SHOP_STRING = "商铺";
		/**公摊的水表*/
		public final static int TYPE_PUB = 3;
		public final static String TYPE_PUB_STRING = "公摊";
		
		/**查询条件时间对应-一个月*/
		public final static int TIME_MONTH = 1;
		public final static String TIME_MONTH_STRING = "一个月";
		/**查询条件时间对应-三个月*/
		public final static int TIME_THREE_MONTHS = 2;
		public final static String TIME_THREE_MONTHS_STRING = "三个月";
		/**查询条件时间对应-半年*/
		public final static int TIME_HALF_YEAR = 3;
		public final static String TIME_HALF_YEAR_STRING = "半年";
		/**查询条件时间对应-一年*/
		public final static int TIME_YEAR = 4;
		public final static String TIME_YEAR_STRING = "一年";
		/**查询条件时间对应-全部*/
		public final static int TIME_ALL = -1;
		public final static String TIME_ALL_STRING = "全部";
		/**排序类型-自然排序*/
		public final static int ORDER_TYPE_NATURAL = 1;
		public final static String ORDER_TYPE_NATURAL_STRING = "自然序";
		/**排序类型-时间递增*/
		public final static int ORDER_TYPE_TIME_ASC = 2;
		public final static String ORDER_TYPE_TIME_ASC_STRING = "时间递增";
		/**排序类型-时间递减*/
		public final static int ORDER_TYPE_TIME_DESC = 3;
		public final static String ORDER_TYPE_TIME_DESC_STRING = "时间递减";
	}
	
	/**用户相关常量*/
	public final static class User {
		/**用户状态：在住*/
		public final static int USER_STATUS_LIVE = 1;
		public final static String USER_STATUS_LIVE_STRING = "在住";
		/**用户状态：已迁*/
		public final static int USER_STATUS_MOVE = 2;
		public final static String USER_STATUS_MOVE_STRING = "已迁";
		/**用户类型：业主*/
		public final static int USER_TYPE_OWNER = 1;
		public final static String USER_TYPE_OWNER_STRING = "业主";
		/**用户类型：租户*/
		public final static int USER_TYPE_TENANT = 2;
		public final static String USER_TYPE_TENANT_STRING = "租户";
		/**用户类型：商户*/
		public final static int USER_TYPE_SHOP = 3;
		public final static String USER_TYPE_SHOP_STRING = "商户";
		/**用户性别：男*/
		public final static int USER_SEX_MAN = 1;
		public final static String USER_SEX_MAN_STRING = "男";
		/**用户性别：女*/
		public final static int USER_SEX_LADY = 2;
		public final static String USER_SEX_LADY_STRING = "女";
		/**证件类型：身份证*/
		public final static int CARD_TYPE_ID = 1;
		public final static String CARD_TYPE_ID_STRING = "身份证";
		/**证件类型：护照*/
		public final static int CARD_TYPE_PASSPORT = 2;
		public final static String CARD_TYPE_PASSPORT_STRING = "护照";
		/**证件类型：驾照*/
		public final static int CARD_TYPE_LICENSE = 3;
		public final static String CARD_TYPE_LICENSE_STRING = "驾照";
		/**证件类型：社保卡*/
		public final static int CARD_TYPE_SECURITY = 4;
		public final static String CARD_TYPE_SECURITY_STRING = "社保卡";
		
		/**排序类型-自然排序*/
		public final static int ORDER_TYPE_NATURAL = 1;
		public final static String ORDER_TYPE_NATURAL_STRING = "自然序";
		/**排序类型-时间递增*/
		public final static int ORDER_TYPE_TIME_ASC = 2;
		public final static String ORDER_TYPE_TIME_ASC_STRING = "时间递增";
		/**排序类型-时间递减*/
		public final static int ORDER_TYPE_TIME_DESC = 3;
		public final static String ORDER_TYPE_TIME_DESC_STRING = "时间递减";
	}
}
