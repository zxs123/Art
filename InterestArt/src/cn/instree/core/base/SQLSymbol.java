package cn.instree.core.base;

public abstract class SQLSymbol {
	
	/**
	 * 等于
	 */
	public static final String EQ = "=";
	/**
	 * 小于
	 */
	public static final String LT = "<";
	/**
	 * 大于
	 */
	public static final String GT = ">";
	/**
	 * 大于等于
	 */
	public static final String GTE = ">=";
	/**
	 * 小于等于
	 */
	public static final String LTE = "<=";
	/**
	 * 非等于
	 */
	public static final String NOT = "!=";
	
	
	public static final String DEFAULT_SYMBOL = SQLSymbol.EQ;
	public static String obtainFirstSymbol(String... symbol){
		if(null == symbol || symbol.length <= 0){
			return DEFAULT_SYMBOL;
		}
		return symbol[0];
	}
	
	
}
