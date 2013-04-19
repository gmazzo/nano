// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Sorting specifications for retrieved Selling Manager inventory products.
 * 
 */
public enum SellingManagerProductSortCodeType {

    /**
     * 
   *  Sort products by by quantity currently listed.
   * 
     */
    ACTIVE_QUANTITY("ActiveQuantity"),
  

    /**
     * 
   *  Sort unlisted products by availability to list.
   * 
     */
    AVAILABLE_TO_LIST("AvailableToList"),
  

    /**
     * 
   *  Sort by average price of sold items.
   * 
     */
    AVERAGE_PRICE("AveragePrice"),
  

    /**
     * 
   *  Sort by average unit cost of items.
   * 
     */
    AVERAGE_UNIT_COST("AverageUnitCost"),
  

    /**
     * 
   *  Sort products by label.
   * 
     */
    CUSTOM_LABEL("CustomLabel"),
  

    /**
     * 
   *  Sort by product name.
   * 
     */
    PRODUCT_NAME("ProductName"),
  

    /**
     * 
   *  Sort by submitted date.
   * 
     */
    LAST_SUBMITTED_DATE("LastSubmittedDate"),
  

    /**
     * 
   *  Sort by quantity scheduled to be listed.
   * 
     */
    SCHEDULED_QUANTITY("ScheduledQuantity"),
  

    /**
     * 
   *  Sort by quantity sold.
   * 
     */
    SOLD_QUANTITY("SoldQuantity"),
  

    /**
     * 
   *  Sort by the percentage of ended listings that had a sale.
   * 
     */
    SUCCESS_PERCENT("SuccessPercent"),
  

    /**
     * 
   *  Sort by number of unsold items.
   * 
     */
    UNSOLD_QUANTITY("UnsoldQuantity"),
  

    /**
     * 
   *  Sort products by folder name.
   * 
     */
    FOLDER_NAME("FolderName"),
  

    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    SellingManagerProductSortCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static SellingManagerProductSortCodeType fromValue(String v) {
        if (v != null) {
            for (SellingManagerProductSortCodeType c: SellingManagerProductSortCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}