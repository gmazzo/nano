// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Specifies the action taken by eBay as a result of the dispute resolution.
 * 
 */
public enum DisputeResolutionRecordTypeCodeType {

    /**
     * 
   * The buyer received an Unpaid Item Strike.
   * 
     */
    STRIKE_BUYER("StrikeBuyer"),
  

    /**
     * 
   * The buyer is suspended and unable to use the eBay site.
   * 
     */
    SUSPEND_BUYER("SuspendBuyer"),
  

    /**
     * 
   * The buyer is restricted and unable to bid or purchase items.
   * 
     */
    RESTRICT_BUYER("RestrictBuyer"),
  

    /**
     * 
   * The seller received a Final Value Fee credit.
   * 
     */
    FVF_CREDIT("FVFCredit"),
  

    /**
     * 
   * The seller's listing fee was credited.
   * 
     */
    INSERTION_FEE_CREDIT("InsertionFeeCredit"),
  

    /**
     * 
   * The buyer's Unpaid Item Strike was appealed.
   * 
     */
    APPEAL_BUYER_STRIKE("AppealBuyerStrike"),
  

    /**
     * 
   * The restriction on the buyer was lifted.
   * 
     */
    UNSUSPEND_BUYER("UnsuspendBuyer"),
  

    /**
     * 
   * The restriction on the buyer was lifted.
   * 
     */
    UNRESTRICT_BUYER("UnrestrictBuyer"),
  

    /**
     * 
   * The seller's Final Value Fee credit was reversed.
   * 
     */
    REVERSE_FVF_CREDIT("ReverseFVFCredit"),
  

    /**
     * 
   * The seller's listing fee was reversed.
   * 
     */
    REVERSE_INSERTION_FEE_CREDIT("ReverseInsertionFeeCredit"),
  

    /**
     * 
   * The buyer is given a ticket.
   * 
     */
    GENERATE_CS_TICKET_FOR_SUSPEND("GenerateCSTicketForSuspend"),
  

    /**
     * 
   * The seller did not receive a Final Value Fee credit.
   * 
     */
    FVF_CREDIT_NOT_GRANTED("FVFCreditNotGranted"),
  

    /**
     * 
   * The buyer did not received the item, and the buyer filed a claim.
   * 
     */
    ITEM_NOT_RECEIVED_CLAIM_FILED("ItemNotReceivedClaimFiled"),
  

    /**
     * 
   * 
   * Reserved for future use.
   * 
     */
    UNPAID_ITEM_RELISTED("UnpaidItemRelisted"),
  

    /**
     * 
   * 
   * Reserved for future use.
   * 
     */
    UNPAID_ITEM_REVISED("UnpaidItemRevised"),
  

    /**
     * 
   * 
   * Reserved for future use.
   * 
     */
    FVF_ON_SHIPPING_CREDIT("FVFOnShippingCredit"),
  

    /**
     * 
   * 
   * Reserved for future use.
   * 
     */
    FVF_ON_SHIPPING_CREDIT_NOT_GRANTED("FVFOnShippingCreditNotGranted"),
  

    /**
     * 
   * 
   * Reserved for future use.
   * 
     */
    REVERSE_FVF_ON_SHIPPING_CREDIT("ReverseFVFOnShippingCredit"),
  

    /**
     * 
   * Credit amount for feature fees.
   * 
     */
    FEATURE_FEE_CREDIT("FeatureFeeCredit"),
  

    /**
     * 
   * Amount not returned or credited for feature fees. Item price.
   * 
     */
    FEATURE_FEE_NOT_CREDIT("FeatureFeeNotCredit"),
  

    /**
     * 
   * Amount reversed on credit card for feature fees.
   * 
     */
    REVERSE_FEATURE_FEE_CREDIT("ReverseFeatureFeeCredit"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeResolutionRecordTypeCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeResolutionRecordTypeCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeResolutionRecordTypeCodeType c: DisputeResolutionRecordTypeCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}