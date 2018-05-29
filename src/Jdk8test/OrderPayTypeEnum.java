/**
 * 
 */
package Jdk8test;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单支付类型
 * @author gaoyan
 *
 */
public enum OrderPayTypeEnum {
	
	/**
	 * 现金
	 */
	S_ZFFS_XJ("S_ZFFS_XJ"),
	/**
	 * 刷卡
	 */
	S_ZFFS_SK("S_ZFFS_SK"),
	/**
	 * 微信-代收（可能不用）
	 */
	@Deprecated
	S_ZFFS_WX("S_ZFFS_WX"),
	/**
	 * 微信-自有（可能不用）
	 */
	@Deprecated
	S_ZFFS_WX_P("S_ZFFS_WX_P"),
	/**
	 * 团购
	 */
	S_ZFFS_TG("S_ZFFS_TG"),
	/**
	 * 支付宝
	 */
	S_ZFFS_ZFB("S_ZFFS_ZFB"),
//	/**
//	 * 支付宝-自有
//	 */
//	S_ZFFS_ZFB_P("S_ZFFS_ZFB_P"),
	/**
	 * 余额
	 */
	S_ZFFS_CZK("S_ZFFS_CZK"),
	/**
	 * 储值卡
	 */
	S_ZFFS_CARD_CZK("S_ZFFS_CARD_CZK"),
	/**
	 * 计次卡
	 */
	S_ZFFS_CK("S_ZFFS_CK"),
	/**
	 * 组合支付
	 */
	S_ZFFS_ZHZF("S_ZFFS_ZHZF"),
	/**
	 * 微信
	 */
	S_ZFFS_WJZ("S_ZFFS_WJZ"),
	/**
	 * 预存消耗
     */
	S_ZFFS_YCXH("S_ZFFS_YCXH"),
	/**
	 * 欠款
	 */
	S_ZFFS_QK("S_ZFFS_QK");
	
	
	
	public static Map<String,OrderPayTypeEnum> mapping = new HashMap<String,OrderPayTypeEnum>();
	
	static {
		mapping.put(S_ZFFS_XJ.value(), S_ZFFS_XJ);
		mapping.put(S_ZFFS_SK.value(), S_ZFFS_SK);
		mapping.put(S_ZFFS_WX.value(), S_ZFFS_WX);
		mapping.put(S_ZFFS_WX_P.value(), S_ZFFS_WX_P);
		mapping.put(S_ZFFS_TG.value(), S_ZFFS_TG);
		mapping.put(S_ZFFS_ZFB.value(), S_ZFFS_ZFB);
		//mapping.put(S_ZFFS_ZFB_P.value(), S_ZFFS_ZFB_P);
		mapping.put(S_ZFFS_CZK.value(), S_ZFFS_CZK);
		mapping.put(S_ZFFS_CARD_CZK.value(), S_ZFFS_CARD_CZK);
		mapping.put(S_ZFFS_CK.value(), S_ZFFS_CK);
		mapping.put(S_ZFFS_WJZ.value(), S_ZFFS_WJZ);
		mapping.put(S_ZFFS_YCXH.value(), S_ZFFS_YCXH);
		mapping.put(S_ZFFS_QK.value(), S_ZFFS_QK);
		
	}
	
	
	private final String value;
	
	private OrderPayTypeEnum(final String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}
}
