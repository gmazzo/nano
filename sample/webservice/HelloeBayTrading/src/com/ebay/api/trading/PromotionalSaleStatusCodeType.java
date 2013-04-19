// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Values indicate the status of a sale. Used for the Promotional Price Display
 * feature, which enables sellers to apply discounts across many listings.
 * 
 */
public enum PromotionalSaleStatusCodeType {

    /**
     * 
   * The promotional sale is active.
   * 
     */
    ACTIVE("Active"),
  

    /**
     * 
   * The promotional sale is scheduled. That is, the start time is in the future.
   * 
     */
    SCHEDULED("Scheduled"),
  

    /**
     * 
   * The status of the promotional sale is pending. When first scheduling a Sale,
   * if you select over 200 listings to be in any given Sale, it will take some
   * time for eBay to process the request.
   * 
     */
    PROCESSING("Processing"),
  

    /**
     * 
   * The promotional sale is inactive, the sale has ended. You can reschedule a
   * sale once it has ended, but you will need to wait at least 24 hours before it
   * can become active.
   * 
     */
    INACTIVE("Inactive"),
  

    /**
     * 
   * The promotional sale has been deleted. Deleted promotional sales cannot be
   * updated or reactivated.
   * 
     */
    DELETED("Deleted"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    PromotionalSaleStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static PromotionalSaleStatusCodeType fromValue(String v) {
        if (v != null) {
            for (PromotionalSaleStatusCodeType c: PromotionalSaleStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}