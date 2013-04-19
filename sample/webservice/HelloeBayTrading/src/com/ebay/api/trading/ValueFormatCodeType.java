// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * The format of a ValueType.  The ValueFormatCodeType places additional constraints on the format a value takes
 * on which are enforceable for validation purposes
 * 
 */
public enum ValueFormatCodeType {

    /**
     * 
   * A date including the month, day, and year in the following format:
   * '<em>YYYYMMDD</em>'
   * 
     */
    FULL_DATE("FullDate"),
  

    /**
     * 
   * A date including the month and year in the following format: '<em>YYYYMM</em>'
   * 
     */
    PARTIAL_DATE("PartialDate"),
  

    /**
     * 
   * A date including only the year in the following format: '<em>YYYY</em>'
   * 
     */
    YEAR("Year"),
  

    /**
     * 
   * Reserved for future or internal use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    ValueFormatCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static ValueFormatCodeType fromValue(String v) {
        if (v != null) {
            for (ValueFormatCodeType c: ValueFormatCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}