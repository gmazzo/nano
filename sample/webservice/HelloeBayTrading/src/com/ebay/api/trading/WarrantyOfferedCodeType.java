// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Specifies that the warranty is offered for the item by the seller.
 * 
 */
public enum WarrantyOfferedCodeType {

    /**
     * 
   * A warranty is offered for the item.
   * 
     */
    WARRANTY_OFFERED("WarrantyOffered"),
  

    /**
     * 
   * (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    WarrantyOfferedCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static WarrantyOfferedCodeType fromValue(String v) {
        if (v != null) {
            for (WarrantyOfferedCodeType c: WarrantyOfferedCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}