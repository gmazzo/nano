// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * This enumerated type contains the list of values that can be used by the seller to set
 * the number of days after item purchase that an unpaid order can be combined with one
 * or more other mutual (same buyer and same seller) unpaid orders into one "Combined
 * Payment" order. Either the buyer or the seller can initiate the Combined Payment
 * process. Sellers can offer buyers shipping discounts through Combined Payment orders,
 * and buyers only have to make one payment for multiple orders as oppposed to a payment
 * for each order.
 * 
 */
public enum CombinedPaymentPeriodCodeType {

    /**
     * 
   * This value indicates that an unpaid order can be combined into a Combined Payment
   * order within three days after purchase (creation of order).
   * 
     */
    DAYS_3("Days_3"),
  

    /**
     * 
   * This value indicates that an unpaid order can be combined into a Combined Payment
   * order within five days after purchase (creation of order).
   * 
     */
    DAYS_5("Days_5"),
  

    /**
     * 
   * This value indicates that an unpaid order can be combined into a Combined Payment
   * order within seven days after purchase (creation of order).
   * 
     */
    DAYS_7("Days_7"),
  

    /**
     * 
   * This value indicates that an unpaid order can be combined into a Combined Payment
   * order within 14 days after purchase (creation of order).
   * 
     */
    DAYS_14("Days_14"),
  

    /**
     * 
   * This value indicates that an unpaid order can be combined into a Combined Payment
   * order within 30 days after purchase (creation of order).
   * 
     */
    DAYS_30("Days_30"),
  

    /**
     * 
   * This value indicates that an order is not eligible to be combined into a Combined
   * Payment order.
   * 
     */
    INELIGIBLE("Ineligible"),
  

    /**
     * 
   * This value is reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    CombinedPaymentPeriodCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static CombinedPaymentPeriodCodeType fromValue(String v) {
        if (v != null) {
            for (CombinedPaymentPeriodCodeType c: CombinedPaymentPeriodCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}