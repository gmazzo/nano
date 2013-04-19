// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * This type is deprecated because Coss Promotions are no longer supported in the APIs.
 * 
 * 
 */
public enum MerchDisplayCodeType {

    /**
     * 
   * 
   * Uses the default eBay theme for cross-promotion widgets.
   * 
     */
    DEFAULT_THEME("DefaultTheme"),
  

    /**
     * 
   * 
   * Uses the store theme for cross-promotion widgets.
   * 
     */
    STORE_THEME("StoreTheme"),
  

    /**
     * 
   * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    MerchDisplayCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static MerchDisplayCodeType fromValue(String v) {
        if (v != null) {
            for (MerchDisplayCodeType c: MerchDisplayCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}