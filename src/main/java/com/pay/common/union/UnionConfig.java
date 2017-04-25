package com.pay.common.union;


/**
 * UnionConfig:{银联帐号信息配置}
 * date: 2015年11月3日 下午4:08:56 
 * @author LiuJiangTao
 * @version
 */
public class UnionConfig {
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	//请求用key,支付服务专用
	public static String key = "zwnq1186l1zf3n45zm84rn1qwm93cw0mqg";
	
	/** 开户名  */
	public static String username = "北京网库互通信息技术有限公司";
	/** 开户行  */
    public static String bank_name = "中国建设银行北京安华支行";
    /** 开帐号  */
    public static String bank_account = "11001071700053003842";
	/** 字符编码格式 目前支持 gbk 或 utf-8 */
	public static String input_charset = "utf-8";
	/** 签名方式 不需修改 */
	public static String sign_type = "MD5";

}
