// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Indicates the action taken by a seller for a best offer.
 * 
 */
public enum BestOfferActionCodeType {

    /**
     * 
   * (in) To accept something.
   * 
     */
    ACCEPT("Accept"),
  

    /**
     * 
   * (in) To decline something.
   * 
     */
    DECLINE("Decline"),
  

    /**
     * 
   * (in) To counter offer.
   * 
     */
    COUNTER("Counter"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    BestOfferActionCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static BestOfferActionCodeType fromValue(String v) {
        if (v != null) {
            for (BestOfferActionCodeType c: BestOfferActionCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}