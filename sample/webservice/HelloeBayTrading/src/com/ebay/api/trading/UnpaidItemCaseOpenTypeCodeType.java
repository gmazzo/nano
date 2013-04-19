// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 *                 Enumeration type that indicates the method used to open an Unpaid Item case.
 *             
 */
public enum UnpaidItemCaseOpenTypeCodeType {

    /**
     * 
   *                       This value indicates that the Unpaid Item case was opened automatically
   *                       through eBay's Unpaid Item Assistant feature.
   *                     
     */
    AUTO("Auto"),
  

    /**
     * 
   *                       This value indicates that the seller opened an Unpaid Item case manually
   * through the Resolution Center or by using the Trading API's
   * <strong>AddDispute</strong> call.
   *                     
     */
    MANUAL("Manual"),
  

    /**
     * 
   *                      This value is reserved for future or internal use.
   *                     
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    UnpaidItemCaseOpenTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static UnpaidItemCaseOpenTypeCodeType fromValue(String v) {
        if (v != null) {
            for (UnpaidItemCaseOpenTypeCodeType c: UnpaidItemCaseOpenTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}