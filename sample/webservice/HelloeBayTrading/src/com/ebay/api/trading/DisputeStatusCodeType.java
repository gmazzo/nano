// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

/**
 * 
 * Describes the status of the dispute, which supplements the DisputeState.
 * Some values apply to Unpaid Item disputes and some to Item Not Received disputes.
 * Disputes can be sorted by DisputeStatus. Ascending order is:<br>
 *  1 - WaitingForSellerResponse<br>
 *  2 - WaitingForBuyerResponse<br>
 *  3 - ClosedFVFCreditStrike<br>
 *  4 - ClosedNoFVFCreditStrike<br>
 *  5 - ClosedFVFCreditNoStrike<br>
 *  6 - ClosedNoFVFCreditNoStrike<br>
 *  7 - Closed<br>
 *  8 - StrikeAppealedAfterClosing<br>
 *  9- FVFCreditReversedAfterClosing<br>
 *  10 - StrikeAppealedAndFVFCreditReversed<br>
 * Descending order is the reverse.
 * 
 */
public enum DisputeStatusCodeType {

    /**
     * 
   * The dispute is closed. For Item Not Received disputes.
   * 
     */
    CLOSED("Closed"),
  

    /**
     * 
   * The dispute is waiting for the seller's response. For both
   * Unpaid Item and Item Not Received disputes.
   * 
     */
    WAITING_FOR_SELLER_RESPONSE("WaitingForSellerResponse"),
  

    /**
     * 
   * The dispute is waiting for the buyer's response. For both
   * Unpaid Item and Item Not Received disputes.
   * 
     */
    WAITING_FOR_BUYER_RESPONSE("WaitingForBuyerResponse"),
  

    /**
     * 
   * The dispute is closed, the seller received
   * a Final Value Fee credit, and the buyer received a strike.
   * For Unpaid Item disputes.
   * 
     */
    CLOSED_FVF_CREDIT_STRIKE("ClosedFVFCreditStrike"),
  

    /**
     * 
   * The dispute is closed, the seller did not receive
   * a Final Value Fee credit, and the buyer received a strike.
   * For Unpaid Item disputes.
   * 
     */
    CLOSED_NO_FVF_CREDIT_STRIKE("ClosedNoFVFCreditStrike"),
  

    /**
     * 
   * The dispute is closed, the seller received a
   * Final Value Fee credit, and the buyer did not receive a strike.
   * For Unpaid Item disputes.
   * 
     */
    CLOSED_FVF_CREDIT_NO_STRIKE("ClosedFVFCreditNoStrike"),
  

    /**
     * 
   * The dispute is closed, the seller did not receive
   * a Final Value Fee credit, and the buyer did not receive a strike.
   * For Unpaid Item disputes.
   * 
     */
    CLOSED_NO_FVF_CREDIT_NO_STRIKE("ClosedNoFVFCreditNoStrike"),
  

    /**
     * 
   * The buyer's strike was appealed after the dispute was closed.
   * For Unpaid Item disputes.
   * 
     */
    STRIKE_APPEALED_AFTER_CLOSING("StrikeAppealedAfterClosing"),
  

    /**
     * 
   * The seller's Final Value Fee credit was reversed after the
   * dispute was closed. For Unpaid Item disputes.
   * 
     */
    FVF_CREDIT_REVERSED_AFTER_CLOSING("FVFCreditReversedAfterClosing"),
  

    /**
     * 
   * Both the seller's Final Value Fee credit and the buyer's strike
   * were reversed after the dispute was closed. For Unpaid Item disputes.
   * 
     */
    STRIKE_APPEALED_AND_FVF_CREDIT_REVERSED("StrikeAppealedAndFVFCreditReversed"),
  

    /**
     * 
   * Claim assigned to an adjuster. Also maps for filed claim in Half.com
   * 
     */
    CLAIM_OPENED("ClaimOpened"),
  

    /**
     * 
   * Buyer contacted and asked to submit paperwork
   * 
     */
    NO_DOCUMENTATION("NoDocumentation"),
  

    /**
     * 
   * Buyer did not respond to verification or missing some paperwork. Also maps for
   * filed claim in Half.com
   * 
     */
    CLAIM_CLOSED("ClaimClosed"),
  

    /**
     * 
   * Not eligible for reimbursement
   * 
     */
    CLAIM_DENIED("ClaimDenied"),
  

    /**
     * 
   * Paperwork received, claim being investigated. Also maps for filed claim in
   * Half.com
   * 
     */
    CLAIM_IN_PROCESS("ClaimInProcess"),
  

    /**
     * 
   * Claim approved for reimbursement; sent to accounts payable for payment
   * 
     */
    CLAIM_APPROVED("ClaimApproved"),
  

    /**
     * 
   * Reimbursement completed
   * 
     */
    CLAIM_PAID("ClaimPaid"),
  

    /**
     * 
   * Issue resolved: seller sent Item or Refund
   * 
     */
    CLAIM_RESOLVED("ClaimResolved"),
  

    /**
     * 
   * Claim Submitted via Web flow
   * 
     */
    CLAIM_SUBMITTED("ClaimSubmitted"),
  

    /**
     * 
   * Unpaid Item dispute opened
   * 
     */
    UNPAID_ITEM_OPENED("UnpaidItemOpened"),
  

    /**
     * 
   * Reserved for internal or future use.
   * 
     */
    CUSTOM_CODE("CustomCode");
  
  
    private final String value;
  
    DisputeStatusCodeType(String v) {
        value = v;
    }
    
    public String value() {
        return value;
    }
    
    public static DisputeStatusCodeType fromValue(String v) {
        if (v != null) {
            for (DisputeStatusCodeType c: DisputeStatusCodeType.values()) {
                if (c.value.equals(v)) {
                    return c;
                }
            }
        }
        throw new IllegalArgumentException(v);
    }
}