// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

public enum OrderRoleCodeType {

    BUYER("Buyer"),
  

    SELLER("Seller"),
  

    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    OrderRoleCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static OrderRoleCodeType fromValue(String v) {
        if (v != null) {
            for (OrderRoleCodeType c: OrderRoleCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}