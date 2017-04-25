package com.pay.common.utils;

public class MemberPayConfig {
	/** 支付方式-用户未选择 */
	public static final int PAY_TYPE_NOCHECK_STATUS = 0;
	/** 支付方式-支付宝 */
	public static final int PAY_TYPE_ALIPAY_STATUS = 1;
	/** 支付方式-库币 */
	public static final int PAY_TYPE_COIN_STATUS = 2;
	
	/** 请求来源-库币商城 */
	public static final int TRADING_COIN_TYPE = 1;
	/** 请求来源-会员中心 */
	public static final int TRADING_MEMBER_TYPE = 2;
	/** 请求来源-品类网 */
	public static final int TRADING_CATEGORY_TYPE = 3;
	
	/** 交易状态-待付款 */
	public static final int TRADE_SATTUS_PAY = 0;
	/** 交易状态-已付款 */
	public static final int TRADE_SATTUS_COMPLETE = 1;
	/** 交易状态-付款失败 */
	public static final int TRADE_SATTUS_CLOES = 2;
	
	/** 请求类别-在线充值 */
	public static final int DETAIL_MODE_TOPUP_ONLINE = 1;
	/** 请求类别-客服代充*/
	public static final int DETAIL_MODE_SERVICE_TOPUP = 2;
	/** 请求类别-提单充值 */
	public static final int DETAIL_MODE_LADING = 3;
	/** 请求类别-购买服务 */
	public static final int DETAIL_MODE_BUY_SERVICE = 4;
	/** 请求类别-客服代扣 */
	public static final int DETAIL_MODE_SERVICE_DEDUCT = 5;
	/** 请求类别-平台活动 */
	public static final int DETAIL_MODE_ACTIVITY = 6;
	
	/** 交易类型-充值 */
	public static final int DETAIL_TYPE_TOPUP = 1;
	/** 交易类型-消费 */
	public static final int DETAIL_TYPE_CONSUME = 2;
	/** 交易类型-活动 */
	public static final int DETAIL_TYPE_ACTIVITY = 3;
}
