// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * This type is deprecated because this type is not used by any call.
 * 
 */
public enum BulkCatalogListerStatusCodeType {

    /**
     * 
     */
    PREAPPROVED("Preapproved"),
  

    /**
     * 
     */
    ACTIVE("Active"),
  

    /**
     * 
     */
    ON_WATCH("OnWatch"),
  

    /**
     * 
     */
    ON_HOLD("OnHold"),
  

    /**
     * 
     */
    SUSPENDED("Suspended"),
  

    /**
     * 
     */
    WATCH_WARN("WatchWarn"),
  

    /**
     * 
   * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BulkCatalogListerStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BulkCatalogListerStatusCodeType fromValue(String v) {
        if (v != null) {
            for (BulkCatalogListerStatusCodeType c: BulkCatalogListerStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}