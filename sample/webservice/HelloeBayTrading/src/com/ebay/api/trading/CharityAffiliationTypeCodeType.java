// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 *     CharityAffiliationTypeCodeType - Type declaration to be used by other schema.
 *     Indicates the affiliation status for nonprofit charity organizations registered with the dedicated eBay Giving Works provider.
 * 
 */
public enum CharityAffiliationTypeCodeType {

    /**
     * 
   *   (out)The specified nonprofit charity organization has a community affiliation.
   * 
     */
    COMMUNITY("Community"),
  

    /**
     * 
   *   (out) The specified nonprofit charity organization has direct affiliation.
   * 
     */
    DIRECT("Direct"),
  

    /**
     * 
   *   (out)The specified nonprofit charity organization is no longer affiliated.
   * 
     */
    REMOVE("Remove"),
  

    /**
     * 
   *  (out) Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    CharityAffiliationTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static CharityAffiliationTypeCodeType fromValue(String v) {
        if (v != null) {
            for (CharityAffiliationTypeCodeType c: CharityAffiliationTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}