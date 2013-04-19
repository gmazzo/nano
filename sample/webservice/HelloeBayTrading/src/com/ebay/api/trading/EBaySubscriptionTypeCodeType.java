// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

public enum EBaySubscriptionTypeCodeType {

    /**
     * 
     */
    SELLER_ASSISTANT("SellerAssistant"),
  

    SELLER_ASSISTANT_PRO("SellerAssistantPro"),
  

    E_BAY_STORE_BASIC("EBayStoreBasic"),
  

    E_BAY_STORE_FEATURED("EBayStoreFeatured"),
  

    E_BAY_STORE_ANCHOR("EBayStoreAnchor"),
  

    SELLING_MANAGER("SellingManager"),
  

    SELLING_MANAGER_PRO("SellingManagerPro"),
  

    PICTURE_MANAGER_LEVEL_1("PictureManagerLevel1"),
  

    PICTURE_MANAGER_LEVEL_2("PictureManagerLevel2"),
  

    PICTURE_MANAGER_LEVEL_3("PictureManagerLevel3"),
  

    PICTURE_MANAGER_LEVEL_4("PictureManagerLevel4"),
  

    PICTURE_MANAGER_LEVEL_5("PictureManagerLevel5"),
  

    PICTURE_MANAGER_LEVEL_6("PictureManagerLevel6"),
  

    PICTURE_MANAGER_LEVEL_7("PictureManagerLevel7"),
  

    SELLER_REPORTS_BASIC("SellerReportsBasic"),
  

    SELLER_REPORTS_PLUS("SellerReportsPlus"),
  

    FILE_EXCHANGE("FileExchange"),
  

    /**
     * 
   * Allowed categories are Motorcycles, Powersports, and Other Vehicles.
   *  
     */
    LOCAL_MARKET_SPECIALTY("LocalMarketSpecialty"),
  

    /**
     * 
   * In addition to the categories allowed by LocalMarketSpecialty, allows
   * Passenger Vehicles. Includes five sub-types. See LocalMarketRegularSubscriptionDefinitionType for details.
   *  
     */
    LOCAL_MARKET_REGULAR("LocalMarketRegular"),
  

    /**
     * 
   * Allows same categories as LocalMarketRegular.
   * 
     */
    LOCAL_MARKET_PREMIUM("LocalMarketPremium"),
  

    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    EBaySubscriptionTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static EBaySubscriptionTypeCodeType fromValue(String v) {
        if (v != null) {
            for (EBaySubscriptionTypeCodeType c: EBaySubscriptionTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}