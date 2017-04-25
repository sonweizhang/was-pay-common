package com.pay.common.utils;

import java.util.HashMap;
import java.util.Map;

import com.pay.common.alipay.AlipayConfig;
/**
 * AlipayUtil:{支付宝支付辅助类}
 * date: 2015-10-30 上午10:44:01 
 * @author LiuJiangTao
 * @version
 */
public class AlipayUtil {
	
	public static String key = "wrry7ky3ont1f57fcznd8d1kzq9ystsd";
	
	/**
	 * assemblyAlipayParams:(组装要提交给支付宝的参数集合).
	 * @author LiuJiangTao
	 * @param sPra 参数集合
	 * @return
	 */
	public static Map<String, String> assemblyAlipayParams(Map<String, String> sPra){
		// 防钓鱼时间戳
		String anti_phishing_key = "";
		// 把请求参数打包成数组
		Map<String, String> sParaTemp = new HashMap<String, String>();
		sParaTemp.put("service", "create_direct_pay_by_user");
		sParaTemp.put("partner", AlipayConfig.partner);
		sParaTemp.put("seller_email",AlipayConfig.seller_email);
		sParaTemp.put("_input_charset", AlipayConfig.input_charset);
		sParaTemp.put("payment_type", "1");
		sParaTemp.put("notify_url",sPra.get("notify_url"));
		sParaTemp.put("return_url",sPra.get("return_url"));
		sParaTemp.put("out_trade_no", sPra.get("orderNum"));
		sParaTemp.put("subject", sPra.get("productName"));
		sParaTemp.put("total_fee",sPra.get("productMoney"));
		sParaTemp.put("body",sPra.get("productDescription"));
		sParaTemp.put("show_url", "");
		sParaTemp.put("anti_phishing_key", anti_phishing_key);
		sParaTemp.put("exter_invoke_ip", sPra.get("exter_invoke_ip"));
		return sParaTemp;
	}
	
	/**
	 * assemblyAlipayParams:(组装即时到帐批量退款无密接口参数).
	 * @author LiuJiangTao
	 * @return
	 */
	public static Map<String,String> assemblyAlipayRefundParams(Map<String, String> sParaTemp){
        sParaTemp.put("service", "refund_fastpay_by_platform_nopwd");
        sParaTemp.put("partner", AlipayConfig.partner);
        sParaTemp.put("_input_charset", AlipayConfig.input_charset);
		return sParaTemp;
	}
}
