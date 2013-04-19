// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.api.trading;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;

/**
 * 
 * Ends the eBay Motors listing specified by ItemID and creates a new Transaction
 * Confirmation Request (TCR) for the item, thus enabling the TCR recipient to
 * purchase the item. You can also use this call to see if a new TCR can be created
 * for the specified item.
 * 
 */
@RootElement(name = "AddTransactionConfirmationItemRequest", namespace = "urn:ebay:apis:eBLBaseComponents")
public class AddTransactionConfirmationItemRequestType extends AbstractRequestType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "RecipientUserID")
	@Order(value=0)
	public String recipientUserID;	
	
	@Element(name = "VerifyEligibilityOnly")
	@Order(value=1)
	public String verifyEligibilityOnly;	
	
	@Element(name = "RecipientPostalCode")
	@Order(value=2)
	public String recipientPostalCode;	
	
	@Element(name = "RecipientRelationType")
	@Order(value=3)
	public String recipientRelationType;	
	
	@Element(name = "NegotiatedPrice")
	@Order(value=4)
	public AmountType negotiatedPrice;	
	
	@Element(name = "ListingDuration")
	@Order(value=5)
	public SecondChanceOfferDurationCodeType listingDuration;	
	
	@Element(name = "ItemID")
	@Order(value=6)
	public String itemID;	
	
	@Element(name = "Comments")
	@Order(value=7)
	public String comments;	
	
    
}