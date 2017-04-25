package com.pay.common.alipay;



/**
 * AlipayConfig:{支付宝帐号信息类}
 * date: 2015年11月3日 下午4:09:23 
 * @author LiuJiangTao
 * @version
 */
public class AlipayConfig {
	
	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	//请求用key,支付服务专用
	public static String key = "wrry7ky3ont1f57fcznd8d1kzq9yyuti";
	// 合作身份者ID，以2088开头由16位纯数字组成的字符串
	public static String partner = "2088811741778653";
	// 签约支付宝账号或卖家收款支付宝帐户
    public static String seller_email = "jiaoyi@99114.com";
    // 调试用，创建TXT日志文件夹路径
	public static String log_path = "D:\\alipay_log_" + System.currentTimeMillis() + ".txt";
	// 字符编码格式 目前支持 gbk 或 utf-8
	public static String input_charset = "utf-8";
	// 签名方式 不需修改
	public static String sign_type = "MD5";

}
